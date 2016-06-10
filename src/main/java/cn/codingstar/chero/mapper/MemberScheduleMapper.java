package cn.codingstar.chero.mapper;

import cn.codingstar.chero.model.persistence.MemberSchedule;
import cn.codingstar.chero.model.example.MemberScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberScheduleMapper {
    int countByExample(MemberScheduleExample example);

    int deleteByExample(MemberScheduleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberSchedule record);

    int insertSelective(MemberSchedule record);

    List<MemberSchedule> selectByExample(MemberScheduleExample example);

    MemberSchedule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberSchedule record, @Param("example") MemberScheduleExample example);

    int updateByExample(@Param("record") MemberSchedule record, @Param("example") MemberScheduleExample example);

    int updateByPrimaryKeySelective(MemberSchedule record);

    int updateByPrimaryKey(MemberSchedule record);
}