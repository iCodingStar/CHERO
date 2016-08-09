package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;


public class Order extends BaseModel {

    protected String orderId;

    protected String memberId;

    protected String courseId;

    protected String stageId;

    protected Boolean orderState;

    protected String orderComment;

    protected String orderReplyComment;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

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

    public Boolean getOrderState() {
        return orderState;
    }

    public void setOrderState(Boolean orderState) {
        this.orderState = orderState;
    }

    public String getOrderComment() {
        return orderComment;
    }

    public void setOrderComment(String orderComment) {
        this.orderComment = orderComment;
    }

    public String getOrderReplyComment() {
        return orderReplyComment;
    }

    public void setOrderReplyComment(String orderReplyComment) {
        this.orderReplyComment = orderReplyComment;
    }
}