package com.mapper;

import com.pojo.Area;

import java.util.List;

public interface AreaMapper {
    List<Area> selectAllAreaByFather(int code);
}
