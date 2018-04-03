package com.dd.controller;

import com.base.BaseController;
import com.dd.entity.BrokerList;
import com.dd.entity.PjCompany;
import com.dd.mapper.BrokerListMapper;
import com.dd.service.PjCompanyService;
import com.dd.util.WebUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/brokerlist")
public class BrokerListController extends BaseController {
    @Autowired
    private PjCompanyService service;

    @Autowired
    private BrokerListMapper mapper;

    /**
     * sp_rphg020003
     *
     * @param request
     * @param modelMap
     * @return rt_cursor
     */
    @PostMapping(value = "/call")
    public Object call(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        if (!params.containsKey("i_year") || !params.containsKey("i_company_id")) {
            return setSuccessModelMap(modelMap);
        }
        Object returnObj;
        mapper.call(params);
        returnObj = params.get("rt_cursor");
        return setSuccessModelMap(modelMap, returnObj);
    }

    /**
     * sp_rphg020003
     *
     * @param request
     * @param modelMap
     * @return rt_cursor1
     */
    @PostMapping(value = "/call1")
    public Object call1(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        if (!params.containsKey("i_year")) {
            return setSuccessModelMap(modelMap);
        }
        //获取上一年的公司评级等级
        params.put("year",String.valueOf(Integer.parseInt((String) params.get("i_year"))-1));
        List<PjCompany> lastYearCompanyList = service.findByCondition(params);
        //去掉部分搜索项
        params.remove("i_company_id");
        params.remove("year");

        mapper.call(params);
        ArrayList<BrokerList> returnObj = (ArrayList<BrokerList>) params.get("rt_cursor1");
        //将上一年的评级等级依次放进本年度排名,预测本年度的评级等级
        for(int i=0;i<returnObj.size();i++){
            returnObj.get(i).setRemark(lastYearCompanyList.get(i).getCompanyLevel());
        }
        return setSuccessModelMap(modelMap, returnObj);
    }

}

