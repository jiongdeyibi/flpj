package com.dd.controller;

import com.base.BaseController;
import com.dd.entity.PjCompanyList;
import com.dd.entity.RankList;
import com.dd.entity.entityBean.PjCompanyListBean;
import com.dd.mapper.PjCompanyListMapper;
import com.dd.mapper.RankListMapper;
import com.dd.util.Request2ModelUtil;
import com.dd.util.WebUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping(value = "/ranklist")
public class RankListController extends BaseController {

    @Autowired
    private PjCompanyListMapper pjCompanyListMapper;

    @Autowired
    private RankListMapper mapper;

    @PostMapping(value = "/detail")
    public Object detail(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        PjCompanyListBean record = pjCompanyListMapper.selectBean(params);
        return setSuccessModelMap(modelMap, record);
    }

    @PostMapping(value = "/add")
    public Object add(HttpServletRequest request, ModelMap modelMap) {
        PjCompanyList record = Request2ModelUtil.covert(PjCompanyList.class, request);
        pjCompanyListMapper.insert(record);
        return setSuccessModelMap(modelMap);
    }

    @PostMapping(value = "/update")
    public Object update(HttpServletRequest request, ModelMap modelMap) {
        PjCompanyList record = Request2ModelUtil.covert(PjCompanyList.class, request);
        pjCompanyListMapper.updateByPrimaryKeySelective(record);
        return setSuccessModelMap(modelMap);
    }

    @PostMapping(value = "/delete")
    public Object delete(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        pjCompanyListMapper.deleteByPrimaryKey(params);
        return setSuccessModelMap(modelMap);
    }

    @PostMapping(value = "/call")
    public Object call(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        if (!params.containsKey("i_year")) {
            return setSuccessModelMap(modelMap);
        }
        Object returnObj;
        if (params.containsKey("listId")) {
            if ("i".equals(params.get("listId")) || "I".equals(params.get("listId"))) {
//                params.replace("listId","tf_report.sp_rphg020004_"+params.get("listId"));
                mapper.callI(params);
            } else {
                params.replace("listId", "tf_report.sp_rphg020004_" + params.get("listId"));
                mapper.call(params);
            }
        }
        returnObj = params.get("rt_cursor");
        return setSuccessModelMap(modelMap, returnObj);
    }

    @PostMapping(value = "/callpage")
    public Object callpage(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        if (params.containsKey("listId")) {
            if ("i".equals(params.get("listId")) || "I".equals(params.get("listId"))) {
                mapper.callI(params);
            } else {
                params.replace("listId", "tf_report.sp_rphg020004_" + params.get("listId"));
                mapper.call(params);
            }
        }
        ArrayList<RankList> list = (ArrayList<RankList>) params.get("rt_cursor");
        int pageNum = params.get("pageNum") == null ? 1 : Integer.parseInt((String) params.get("pageNum"));
        int pageSize = params.get("pageSize") == null ? 30 : Integer.parseInt((String) params.get("pageSize"));
        String orderBy = params.get("orderBy") == null ? "" : params.get("orderBy").toString();
        if (StringUtils.isNotEmpty(orderBy)) {
            PageHelper.startPage(pageNum, pageSize, orderBy);
        } else {
            PageHelper.startPage(pageNum, pageSize);
        }
        PageInfo<RankList> pageInfo = new PageInfo<RankList>(list);
        return setSuccessModelMap(modelMap, pageInfo);
    }
}

