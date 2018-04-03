package com.dd.service.impl;

import com.base.BaseServiceImpl;
import com.dd.entity.PjList;
import com.dd.service.PjListService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PjListServiceImpl extends BaseServiceImpl<PjList> implements PjListService {

}
