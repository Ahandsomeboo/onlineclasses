package com.myyl.mapper;

import com.myyl.pojo.Course;
import com.myyl.pojo.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: myyl
 * @Time: 2019/5/20 - 13:14
 * @Description:
 * @See: <a href=" https://github.com/yuanqingx/onlineclasses"> https://github.com/yuanqingx/onlineclasses</a>
 */


public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(String cid);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);




}