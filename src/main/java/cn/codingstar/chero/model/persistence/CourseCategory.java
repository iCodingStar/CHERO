package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

public class CourseCategory extends BaseModel{

    protected String courseCategoryId;

    protected String courseCategoryName;

    protected String courseCategoryDescription;

    protected String courseCategoryImage;

    public String getCourseCategoryId() {
        return courseCategoryId;
    }

    public void setCourseCategoryId(String courseCategoryId) {
        this.courseCategoryId = courseCategoryId;
    }

    public String getCourseCategoryName() {
        return courseCategoryName;
    }

    public void setCourseCategoryName(String courseCategoryName) {
        this.courseCategoryName = courseCategoryName;
    }

    public String getCourseCategoryDescription() {
        return courseCategoryDescription;
    }

    public void setCourseCategoryDescription(String courseCategoryDescription) {
        this.courseCategoryDescription = courseCategoryDescription;
    }

    public String getCourseCategoryImage() {
        return courseCategoryImage;
    }

    public void setCourseCategoryImage(String courseCategoryImage) {
        this.courseCategoryImage = courseCategoryImage;
    }
}