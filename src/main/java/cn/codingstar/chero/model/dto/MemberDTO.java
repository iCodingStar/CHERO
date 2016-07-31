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
@Data
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
}
