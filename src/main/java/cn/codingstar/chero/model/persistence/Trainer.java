package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

@Data
public class Trainer extends BaseModel {

    private String trainerId;

    private String trainerNickname;

    private String trainerName;

    private String trainerImage;

    private String trainerInfo;

    private String trainerSex;

    private Date trainerBirthday;

    private String trainerTelephone;

    private String trainerHomePhone;

    private String trainerQq;

    private String trainerWeixin;

    private String trainerAddress;

    private String trainerNote;

}