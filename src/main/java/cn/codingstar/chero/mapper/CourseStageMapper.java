package cn.codingstar.chero.mapper;

import cn.codingstar.chero.model.persistence.CourseStage;
import cn.codingstar.chero.model.example.CourseStageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseStageMapper {
    int countByExample(CourseStageExample example);

    int deleteByExample(CourseStageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseStage record);

    int insertSelective(CourseStage record);

    List<CourseStage> selectByExample(CourseStageExample example);

    CourseStage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseStage record, @Param("example") CourseStageExample example);

    int updateByExample(@Param("record") CourseStage record, @Param("example") CourseStageExample example);

    int updateByPrimaryKeySelective(CourseStage record);

    int updateByPrimaryKey(CourseStage record);
}