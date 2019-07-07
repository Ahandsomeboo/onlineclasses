package com.myyl.mapper;

import com.myyl.pojo.Data;
import com.myyl.pojo.DataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: myyl
 * @Time: 2019/5/20 - 13:14
 * @Description:
 * @See: <a href=" https://github.com/yuanqingx/onlineclasses"> https://github.com/yuanqingx/onlineclasses</a>
 */


public interface DataMapper {
    long countByExample(DataExample example);

    int deleteByExample(DataExample example);

    int deleteByPrimaryKey(String did);

    int insert(Data record);

    int insertSelective(Data record);

    List<Data> selectByExample(DataExample example);

    Data selectByPrimaryKey(String did);

    int updateByExampleSelective(@Param("record") Data record, @Param("example") DataExample example);

    int updateByExample(@Param("record") Data record, @Param("example") DataExample example);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKey(Data record);
}