package cn.codingstar.chero.model.persistence;

import cn.codingstar.chero.common.authorization.AuthorizationHelper;
import cn.codingstar.chero.model.dto.MemberDTO;
import lombok.Data;

import java.util.Date;

public class Member extends BaseModel {

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

    protected String token;

    protected String memberEmail;//用户邮箱

    /***
     * 密码加密
     */
    public void encodePassword() {
        this.password = AuthorizationHelper.encodePassword(this.password, this.passwordSalt);
    }

    /***
     * 密码验证
     *
     * @param password
     * @return
     */
    public boolean checkPassword(String password) {
        return this.password.equals(AuthorizationHelper.encodePassword(password, this.passwordSalt));
    }

    /***
     * 生成token
     */
    public void generateToken() {
        this.token = AuthorizationHelper.generateToken(this.memberName, this.password);
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberNickname() {
        return memberNickname;
    }

    public void setMemberNickname(String memberNickname) {
        this.memberNickname = memberNickname;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getMemberImage() {
        return memberImage;
    }

    public void setMemberImage(String memberImage) {
        this.memberImage = memberImage;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public Date getMemberBirthday() {
        return memberBirthday;
    }

    public void setMemberBirthday(Date memberBirthday) {
        this.memberBirthday = memberBirthday;
    }

    public String getMemberHobby() {
        return memberHobby;
    }

    public void setMemberHobby(String memberHobby) {
        this.memberHobby = memberHobby;
    }

    public String getMemberTelephone() {
        return memberTelephone;
    }

    public void setMemberTelephone(String memberTelephone) {
        this.memberTelephone = memberTelephone;
    }

    public String getMemberHomePhone() {
        return memberHomePhone;
    }

    public void setMemberHomePhone(String memberHomePhone) {
        this.memberHomePhone = memberHomePhone;
    }

    public String getMemberQq() {
        return memberQq;
    }

    public void setMemberQq(String memberQq) {
        this.memberQq = memberQq;
    }

    public String getMemberWeixin() {
        return memberWeixin;
    }

    public void setMemberWeixin(String memberWeixin) {
        this.memberWeixin = memberWeixin;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberNote() {
        return memberNote;
    }

    public void setMemberNote(String memberNote) {
        this.memberNote = memberNote;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
}