package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class Order extends BaseModel {

    protected String orderId;

    protected String memberId;

    protected String courseId;

    protected String stageId;

    protected Boolean orderState;

    protected String orderComment;

    protected String orderReplyComment;

}