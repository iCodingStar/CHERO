package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class Course extends BaseModel {

    protected String courseId;

    protected String courseName;

    protected String courseImage;

    protected String courseCategoryId;

    protected Boolean hot;
}