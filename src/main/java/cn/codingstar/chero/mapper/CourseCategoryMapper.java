package cn.codingstar.chero.mapper;

import cn.codingstar.chero.model.persistence.CourseCategory;
import cn.codingstar.chero.model.example.CourseCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseCategoryMapper {
    int countByExample(CourseCategoryExample example);

    int deleteByExample(CourseCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseCategory record);

    int insertSelective(CourseCategory record);

    List<CourseCategory> selectByExample(CourseCategoryExample example);

    CourseCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseCategory record, @Param("example") CourseCategoryExample example);

    int updateByExample(@Param("record") CourseCategory record, @Param("example") CourseCategoryExample example);

    int updateByPrimaryKeySelective(CourseCategory record);

    int updateByPrimaryKey(CourseCategory record);
}