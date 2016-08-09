package cn.codingstar.chero.model.persistence;

import lombok.Data;

import java.util.Date;

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

    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerNickname() {
        return trainerNickname;
    }

    public void setTrainerNickname(String trainerNickname) {
        this.trainerNickname = trainerNickname;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerImage() {
        return trainerImage;
    }

    public void setTrainerImage(String trainerImage) {
        this.trainerImage = trainerImage;
    }

    public String getTrainerInfo() {
        return trainerInfo;
    }

    public void setTrainerInfo(String trainerInfo) {
        this.trainerInfo = trainerInfo;
    }

    public String getTrainerSex() {
        return trainerSex;
    }

    public void setTrainerSex(String trainerSex) {
        this.trainerSex = trainerSex;
    }

    public Date getTrainerBirthday() {
        return trainerBirthday;
    }

    public void setTrainerBirthday(Date trainerBirthday) {
        this.trainerBirthday = trainerBirthday;
    }

    public String getTrainerTelephone() {
        return trainerTelephone;
    }

    public void setTrainerTelephone(String trainerTelephone) {
        this.trainerTelephone = trainerTelephone;
    }

    public String getTrainerHomePhone() {
        return trainerHomePhone;
    }

    public void setTrainerHomePhone(String trainerHomePhone) {
        this.trainerHomePhone = trainerHomePhone;
    }

    public String getTrainerQq() {
        return trainerQq;
    }

    public void setTrainerQq(String trainerQq) {
        this.trainerQq = trainerQq;
    }

    public String getTrainerWeixin() {
        return trainerWeixin;
    }

    public void setTrainerWeixin(String trainerWeixin) {
        this.trainerWeixin = trainerWeixin;
    }

    public String getTrainerAddress() {
        return trainerAddress;
    }

    public void setTrainerAddress(String trainerAddress) {
        this.trainerAddress = trainerAddress;
    }

    public String getTrainerNote() {
        return trainerNote;
    }

    public void setTrainerNote(String trainerNote) {
        this.trainerNote = trainerNote;
    }
}