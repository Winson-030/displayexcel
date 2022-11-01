package com.winson.showexcel.Mapper;

import com.winson.showexcel.Entity.TbSampleDetailLocation;
import com.winson.showexcel.Entity.TbSampleDetailLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSampleDetailLocationMapper {
    long countByExample(TbSampleDetailLocationExample example);

    int deleteByExample(TbSampleDetailLocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSampleDetailLocation row);

    int insertSelective(TbSampleDetailLocation row);

    List<TbSampleDetailLocation> selectByExample(TbSampleDetailLocationExample example);

    TbSampleDetailLocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TbSampleDetailLocation row, @Param("example") TbSampleDetailLocationExample example);

    int updateByExample(@Param("row") TbSampleDetailLocation row, @Param("example") TbSampleDetailLocationExample example);

    int updateByPrimaryKeySelective(TbSampleDetailLocation row);

    int updateByPrimaryKey(TbSampleDetailLocation row);
}