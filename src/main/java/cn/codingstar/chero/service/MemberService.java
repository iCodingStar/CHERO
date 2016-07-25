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
package cn.codingstar.chero.service;

import cn.codingstar.chero.model.dto.MemberDTO;
import cn.codingstar.chero.model.persistence.Member;

/**
 * <p>Class: MemberService</p>
 * <p>Description: 会员管理接口</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/23 9:39
 * @since 1.0.0
 */
public interface MemberService {
    /***
     * 用户注册
     *
     * @param member
     * @return
     */
    Member register(Member member);

    /***
     * 用户登录
     *
     * @param memberName
     * @param password
     * @return
     */
    Member login(String memberName, String password);

    /***
     * 使用token登陆
     *
     * @param token
     * @return
     */
    Member loginWithToken(String token);

    /***
     * 修改密码
     *
     * @param memberName
     * @param oldPassword
     * @param newPassword
     */
    void modifyPassword(String memberName, String oldPassword, String newPassword);

    /***
     * 检查用户名是否存在
     *
     * @param username
     * @return
     */
    boolean checkUsername(String memberName);

    /***
     * 检查token
     *
     * @param token
     * @return
     */
    Member checkToken(String token);

    /**
     * 获取用户信息
     *
     * @param memberId
     * @return
     */
    MemberDTO getLoginMember(Integer memberId);
}
