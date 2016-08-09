package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;


public class UniqueKey extends BaseModel {

    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}