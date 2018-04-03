package com.dd.controller;

import com.base.BaseController;
import com.dd.mapper.BrokerListMapper;
import com.dd.util.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping(value = "/brokerlist")
public class BrokerListController extends BaseController {

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
        params.remove("i_company_id");
        Object returnObj;
        mapper.call(params);
        returnObj = params.get("rt_cursor1");
        return setSuccessModelMap(modelMap, returnObj);
    }

}

