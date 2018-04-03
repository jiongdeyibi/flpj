package com.dd.service.impl;

import com.base.BaseServiceImpl;
import com.dd.entity.PjCompanyScore;
import com.dd.service.PjCompanyScoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PjCompanyScoreServiceImpl extends BaseServiceImpl<PjCompanyScore> implements PjCompanyScoreService {

}
