package com.dd.mapper;

import com.base.BaseMapper;
import com.dd.entity.PjCompanyList;
import com.dd.entity.entityBean.PjCompanyListBean;

import java.util.Map;

public interface PjCompanyListMapper extends BaseMapper<PjCompanyList> {
    PjCompanyListBean selectBean(Map<String, Object> params);
}