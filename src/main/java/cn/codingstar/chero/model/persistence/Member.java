package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class Member extends BaseModel{

    protected String memberId;

    protected String memberNickname;

    protected String memberName;

    protected String password;

    protected String passwordSalt;

    protected Boolean enable;

    protected String memberImage;

    protected String memberSex;

    protected Date memberBirthday;

    protected String memberHobby;

    protected String memberTelephone;

    protected String memberHomePhone;

    protected String memberQq;

    protected String memberWeixin;

    protected String memberAddress;

    protected String memberNote;
    
}