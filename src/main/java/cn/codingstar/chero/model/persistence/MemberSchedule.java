package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class MemberSchedule extends BaseModel {

    protected String memberId;

    protected String courseId;

    protected String stageId;

    protected Integer leftTimes;

}