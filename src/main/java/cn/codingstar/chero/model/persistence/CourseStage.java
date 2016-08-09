package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;


public class CourseStage extends BaseModel {

    protected String stageId;

    protected Integer stageTimes;

    protected Integer stageCapacity;

    protected Integer stageLeftCapacity;

    protected String courseId;

    protected String stageName;

    protected Date startTime;

    protected Date endTime;

    protected Double courseStagePrice;

    protected String stageScheduleImage;

    protected String stagePosterImage;

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public Integer getStageTimes() {
        return stageTimes;
    }

    public void setStageTimes(Integer stageTimes) {
        this.stageTimes = stageTimes;
    }

    public Integer getStageCapacity() {
        return stageCapacity;
    }

    public void setStageCapacity(Integer stageCapacity) {
        this.stageCapacity = stageCapacity;
    }

    public Integer getStageLeftCapacity() {
        return stageLeftCapacity;
    }

    public void setStageLeftCapacity(Integer stageLeftCapacity) {
        this.stageLeftCapacity = stageLeftCapacity;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getCourseStagePrice() {
        return courseStagePrice;
    }

    public void setCourseStagePrice(Double courseStagePrice) {
        this.courseStagePrice = courseStagePrice;
    }

    public String getStageScheduleImage() {
        return stageScheduleImage;
    }

    public void setStageScheduleImage(String stageScheduleImage) {
        this.stageScheduleImage = stageScheduleImage;
    }

    public String getStagePosterImage() {
        return stagePosterImage;
    }

    public void setStagePosterImage(String stagePosterImage) {
        this.stagePosterImage = stagePosterImage;
    }
}