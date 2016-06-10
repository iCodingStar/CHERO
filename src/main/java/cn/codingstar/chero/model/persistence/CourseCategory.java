package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class CourseCategory extends BaseModel{

    protected String courseCategoryId;

    protected String courseCategoryName;

    protected String courseCategoryDescription;

    protected String courseCategoryImage;
}