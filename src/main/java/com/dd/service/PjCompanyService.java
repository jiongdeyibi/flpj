package com.dd.service;

import com.base.BaseService;
import com.dd.entity.PjCompany;

import java.util.List;
import java.util.Map;

public interface PjCompanyService extends BaseService<PjCompany> {
    List<PjCompany> listCompany(Map<String, Object> params);

    void callProcedure(Map<String, Object> params);
}
