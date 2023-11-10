package com.example.springboot.migration.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface SimpleMapper {

    HashMap<String, Object> selectSample(HashMap<String, Object> param);

}
