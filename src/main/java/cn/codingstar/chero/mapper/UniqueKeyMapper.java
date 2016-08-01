package cn.codingstar.chero.mapper;

import cn.codingstar.chero.model.example.UniqueKeyExample;
import cn.codingstar.chero.model.persistence.UniqueKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UniqueKeyMapper {
    int countByExample(UniqueKeyExample example);

    int deleteByExample(UniqueKeyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UniqueKey record);

    int insertSelective(UniqueKey record);

    List<UniqueKey> selectByExample(UniqueKeyExample example);

    UniqueKey selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UniqueKey record, @Param("example") UniqueKeyExample example);

    int updateByExample(@Param("record") UniqueKey record, @Param("example") UniqueKeyExample example);

    int updateByPrimaryKeySelective(UniqueKey record);

    int updateByPrimaryKey(UniqueKey record);
}