package com.dd.mapper;

import java.util.List;
import java.util.Map;

public interface BrokerListMapper {
    List call(Map<String, Object> params);
}
