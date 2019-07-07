package com.myyl.mapper;

import com.myyl.pojo.Coursetype;
import com.myyl.pojo.CoursetypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursetypeMapper {
    long countByExample(CoursetypeExample example);

    int deleteByExample(CoursetypeExample example);

    int deleteByPrimaryKey(String typeid);

    int insert(Coursetype record);

    int insertSelective(Coursetype record);

    List<Coursetype> selectByExample(CoursetypeExample example);

    Coursetype selectByPrimaryKey(String typeid);

    int updateByExampleSelective(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);

    int updateByExample(@Param("record") Coursetype record, @Param("example") CoursetypeExample example);

    int updateByPrimaryKeySelective(Coursetype record);

    int updateByPrimaryKey(Coursetype record);
}