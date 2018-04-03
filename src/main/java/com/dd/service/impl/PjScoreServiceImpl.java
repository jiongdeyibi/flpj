package com.dd.service.impl;

import com.base.BaseServiceImpl;
import com.dd.entity.PjScore;
import com.dd.service.PjScoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PjScoreServiceImpl extends BaseServiceImpl<PjScore> implements PjScoreService {

}
