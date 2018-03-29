package com.dd.controller;

import com.base.BaseController;
import com.dd.mapper.RankListMapper;
import com.dd.util.WebUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping(value = "/ranklist")
public class RankListController extends BaseController {

    @Autowired
    private RankListMapper mapper;

    @PostMapping(value = "/call")
    public Object call(HttpServletRequest request, ModelMap modelMap) {
        Map<String, Object> params = WebUtil.getParameterMap(request);
        if (params.containsKey("listId")) {
            if ("i".equals(params.get("listId")) || "I".equals(params.get("listId"))) {
//                params.replace("listId","tf_report.sp_rphg020004_"+params.get("listId"));
                mapper.callI(params);
            } else {
                params.replace("listId", "tf_report.sp_rphg020004_" + params.get("listId"));
                mapper.call(params);
            }
        }
        return setSuccessModelMap(modelMap, params.get("rt_cursor"));
    }

}

