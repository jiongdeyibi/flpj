package com.dd.mapper;

import java.util.List;
import java.util.Map;

public interface RankListMapper {
    List call(Map<String, Object> params);

    List callI(Map<String, Object> params);
}
