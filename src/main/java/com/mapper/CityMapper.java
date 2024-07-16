package com.mapper;

import com.pojo.City;

import java.util.List;

public interface CityMapper {
    City getCityByFather(int code);
    List<City> listCitiesByFather(int father);
}
