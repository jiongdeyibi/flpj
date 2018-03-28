package com.dd.controller;

import com.base.BaseController;
import com.dd.entity.PjCompany;
import com.dd.service.PjCompanyService;
import com.dd.util.Request2ModelUtil;
import com.dd.util.WebUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/company")
public class PjCompanyController extends BaseController {

    @Autowired
    private PjCompanyService service;

    @PostMapping(value = "/detail")
    public Object detail(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        PjCompany record = service.selectByPrimaryKey(params);
        return setSuccessModelMap(modelMap, record);
    }

    @PostMapping(value = "/add")
    public Object add(HttpServletRequest request, ModelMap modelMap) {
        PjCompany record = Request2ModelUtil.covert(PjCompany.class, request);
        service.insert(record);
        return setSuccessModelMap(modelMap);
    }

    @PostMapping(value = "/update")
    public Object update(HttpServletRequest request, ModelMap modelMap) {
        PjCompany record = Request2ModelUtil.covert(PjCompany.class, request);
        service.updateByPrimaryKeySelective(record);
        return setSuccessModelMap(modelMap);
    }

    @PostMapping(value = "/delete")
    public Object delete(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        service.deleteByPrimaryKey(params);
        return setSuccessModelMap(modelMap);
    }

    @PostMapping(value = "/list")
    public Object list(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        PageInfo<PjCompany> list = service.findByPage(params);
        return setSuccessModelMap(modelMap, list);
    }

    @PostMapping(value = "/listcompany")
    public Object listCompany(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        List<PjCompany> list = service.listCompany(params);
        return setSuccessModelMap(modelMap, list);
    }

}

