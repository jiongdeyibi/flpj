package com.dd.mapper;

import com.base.BaseMapper;
import com.dd.entity.PjCompany;

import java.util.List;
import java.util.Map;

public interface PjCompanyMapper extends BaseMapper<PjCompany> {
    List<PjCompany> listCompany(Map<String, Object> params);

    void callProcedure(Map<String, Object> params);
}