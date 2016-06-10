package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class Admin extends BaseModel{

    protected String adminId;

    protected String adminName;

    protected String adminNickname;

    protected String password;

    protected String passwordSalt;

    protected Boolean enable;

}