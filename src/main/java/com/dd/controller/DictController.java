package com.dd.controller;

import com.base.BaseController;
import com.dd.entity.Dict;
import com.dd.service.DictService;
import com.dd.util.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/dict", method = RequestMethod.POST)
public class DictController extends BaseController {

    @Autowired
    private DictService service;

    @RequestMapping(value = "/detail")
    public Object detail(@RequestParam(value = "id", required = false) String id, ModelMap modelMap) {
        Dict record = service.selectByPrimaryKey(id);
        return setSuccessModelMap(modelMap, record);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public Object list(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        List<Dict> list = service.findByCondition(params);
        return setSuccessModelMap(modelMap, list);
    }

}

