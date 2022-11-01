package com.winson.showexcel.Mapper;

import com.winson.showexcel.Entity.TbSample;
import com.winson.showexcel.Entity.TbSampleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSampleMapper {
    long countByExample(TbSampleExample example);

    int deleteByExample(TbSampleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSample row);

    int insertSelective(TbSample row);

    List<TbSample> selectByExampleWithBLOBs(TbSampleExample example);

    List<TbSample> selectByExample(TbSampleExample example);

    TbSample selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TbSample row, @Param("example") TbSampleExample example);

    int updateByExampleWithBLOBs(@Param("row") TbSample row, @Param("example") TbSampleExample example);

    int updateByExample(@Param("row") TbSample row, @Param("example") TbSampleExample example);

    int updateByPrimaryKeySelective(TbSample row);

    int updateByPrimaryKeyWithBLOBs(TbSample row);

    int updateByPrimaryKey(TbSample row);
}