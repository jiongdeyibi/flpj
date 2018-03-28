package com.dd.service.impl;

import com.base.BaseServiceImpl;
import com.dd.entity.PjCompany;
import com.dd.mapper.PjCompanyMapper;
import com.dd.service.PjCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
public class PjCompanyServiceImpl extends BaseServiceImpl<PjCompany> implements PjCompanyService {
    @Autowired
    PjCompanyMapper mapper;

    @Override
    public List<PjCompany> listCompany(Map<String, Object> params) {
        return mapper.listCompany(params);
    }

}
