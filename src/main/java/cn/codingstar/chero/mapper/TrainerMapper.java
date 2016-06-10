package cn.codingstar.chero.mapper;

import cn.codingstar.chero.model.persistence.Trainer;
import cn.codingstar.chero.model.example.TrainerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainerMapper {
    int countByExample(TrainerExample example);

    int deleteByExample(TrainerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trainer record);

    int insertSelective(Trainer record);

    List<Trainer> selectByExample(TrainerExample example);

    Trainer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trainer record, @Param("example") TrainerExample example);

    int updateByExample(@Param("record") Trainer record, @Param("example") TrainerExample example);

    int updateByPrimaryKeySelective(Trainer record);

    int updateByPrimaryKey(Trainer record);
}