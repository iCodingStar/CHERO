/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.codingstar.chero.model.dto;

import cn.codingstar.chero.model.persistence.Member;
import lombok.Data;

import java.util.Date;

/**
 * <p>Class: </p>
 * <p>Description: </p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/23 9:47
 * @since 1.0.0
 */

public class MemberDTO {

    protected Integer id;

    protected String memberNickname;

    protected String memberName;

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

    protected String memberEmail;//用户邮箱

    public MemberDTO() {
    }

    public MemberDTO(Member member) {
        this.id = member.getId();
        this.memberNickname = member.getMemberNickname();
        this.memberName = member.getMemberName();
        this.memberImage = member.getMemberImage();
        this.memberSex = member.getMemberSex();
        this.memberBirthday = member.getMemberBirthday();
        this.memberHobby = member.getMemberHobby();
        this.memberTelephone = member.getMemberTelephone();
        this.memberHomePhone = member.getMemberHomePhone();
        this.memberQq = member.getMemberQq();
        this.memberWeixin = member.getMemberWeixin();
        this.memberAddress = member.getMemberAddress();
        this.memberNote = member.getMemberNote();
        this.memberEmail = member.getMemberEmail();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
}
