package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;


public class MemberSchedule extends BaseModel {

    protected String memberId;

    protected String courseId;

    protected String stageId;

    protected Integer leftTimes;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public Integer getLeftTimes() {
        return leftTimes;
    }

    public void setLeftTimes(Integer leftTimes) {
        this.leftTimes = leftTimes;
    }
}