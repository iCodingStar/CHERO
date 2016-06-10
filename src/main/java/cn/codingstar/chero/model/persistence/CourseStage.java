package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
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

}