package com.dd.controller;

import com.base.BaseController;
import com.dd.entity.PjList;
import com.dd.service.PjListService;
import com.dd.util.Request2ModelUtil;
import com.dd.util.WebUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/pjlist", method = RequestMethod.POST)
public class PjListController extends BaseController {

    @Autowired
    private PjListService service;

    @RequestMapping(value = "/detail")
    public Object detail(@RequestParam(value = "listId", required = false) String listId, ModelMap modelMap) {
        Map<String, Object> params = new HashMap<>();
        params.put("listId", listId);
        PjList record = service.selectByPrimaryKey(params);
        return setSuccessModelMap(modelMap, record);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object add(HttpServletRequest request, ModelMap modelMap) {
        PjList record = Request2ModelUtil.covert(PjList.class, request);
        service.insert(record);
        return setSuccessModelMap(modelMap);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Object update(HttpServletRequest request, ModelMap modelMap) {
        PjList record = Request2ModelUtil.covert(PjList.class, request);
        service.updateByPrimaryKeySelective(record);
        return setSuccessModelMap(modelMap);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Object delete(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        service.deleteByPrimaryKey(params);
        return setSuccessModelMap(modelMap);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Object list(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        PageInfo<PjList> list = service.findByPage(params);
        return setSuccessModelMap(modelMap, list);
    }

}

