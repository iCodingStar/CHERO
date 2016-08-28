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
package cn.codingstar.chero.service.impl;

import cn.codingstar.chero.common.bean.ExceptionType;
import cn.codingstar.chero.common.exception.BusinessException;
import cn.codingstar.chero.common.utils.ObjectUtils;
import cn.codingstar.chero.common.utils.ValidationUtils;
import cn.codingstar.chero.mapper.MemberMapper;
import cn.codingstar.chero.mapper.custom.MemberCustomMapper;
import cn.codingstar.chero.model.dto.MemberDTO;
import cn.codingstar.chero.model.persistence.Member;
import cn.codingstar.chero.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Class: MemberServiceImpl</p>
 * <p>Description: 会员服务实现类</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/23 9:40
 * @since 1.0.0
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MemberCustomMapper memberCustomMapper;

    @Autowired
    private DataGenerateServiceImpl dataGenerateService;

    /***
     * 会员注册
     *
     * @param member
     * @return
     */
    @Override
    public boolean register(Member member) {
        //检查用户名密码是否有效
        ValidationUtils.required(member.getMemberName());
        ValidationUtils.required(member.getPassword());
        ValidationUtils.required(member.getMemberEmail());

        //检查用户名是否已经存在
        if (!checkMemberName(member.getMemberName())) {
            return false;
        }

        //构造Member
        Member originMember = new Member();
        originMember.setMemberName(member.getMemberName());
        originMember.setMemberEmail(member.getMemberEmail());
        originMember.setPassword(member.getPassword());

        //设置盐值
        if (originMember.getPasswordSalt() == null) {
            originMember.setPasswordSalt(member.getPassword());
        }

        //设置昵称
        if (originMember.getMemberNickname() != null) {
            originMember.setMemberNickname(member.getMemberName());
        }

        //设置memberId
        String memberId = dataGenerateService.generateMemberId();
        originMember.setMemberId(memberId);

        //加密密码
        originMember.encodePassword();
        originMember.setEnable(true);

        //注册用户
        try {
            memberMapper.insertSelective(originMember);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /***
     * 会员登录
     *
     * @param memberName
     * @param password
     * @return
     */
    @Override
    public boolean login(String memberName, String password) {
        //检查用户名和密码是否有效
        ValidationUtils.required(memberName);
        ValidationUtils.required(password);
        ValidationUtils.text(memberName);
        ValidationUtils.text(password);

        Member originMember = null;

        originMember = memberCustomMapper.selectByMemberName(memberName);

        //检查用户是否存在
        if (ObjectUtils.isEmpty(originMember)) {
            return false;
        }
        //检查密码是否正确
        if (!originMember.checkPassword(password)) {
            return false;
        }

        //生成token
        originMember.generateToken();

        //更新数据(存储token)
        memberMapper.updateByPrimaryKeySelective(originMember);

        return true;
    }

    /***
     * 会员用token登陆
     *
     * @param token
     * @return
     */
    @Override
    public Member loginWithToken(String token) {
        return null;
    }

    /***
     * 会员修改密码
     *
     * @param memberName
     * @param oldPassword
     * @param newPassword
     */
    @Override
    public void modifyPassword(String memberName, String oldPassword, String newPassword) {
        //验证是否可以登录
        this.login(memberName, oldPassword);
        //验证新密码是否合法
        ValidationUtils.required(newPassword);
        ValidationUtils.text(newPassword);

        //获取原始用户
        Member originMember = memberCustomMapper.selectByMemberName(memberName);
        //设置新的密码
        originMember.setPassword(newPassword);
        //生成新的token
        originMember.encodePassword();
        //更新用户信息
        memberMapper.updateByPrimaryKeySelective(originMember);
    }

    /***
     * 检查用户名是否存在
     *
     * @param memberName
     * @return
     */
    @Override
    public boolean checkMemberName(String memberName) {
        return ObjectUtils.isEmpty(memberCustomMapper.selectByMemberName(memberName));
    }

    @Override
    public boolean checkMemberEmail(String memberEmail) {
        Member originMember = new Member();
        originMember.setMemberEmail(memberEmail);
        Member member = memberCustomMapper.selectByMember(originMember);
        if (!ObjectUtils.isEmpty(member)) {
            return true;//邮箱存在
        } else {
            return false;//邮箱不存在
        }
    }

    /***
     * 检查token是否存在
     *
     * @param token
     * @return
     */
    @Override
    public Member checkToken(String token) {
        Member param = new Member();
        param.setToken(token);
        return memberCustomMapper.selectByMember(param);
    }

    /***
     * 获取登录的会员信息
     *
     * @param memberId
     * @return
     */
    @Override
    public MemberDTO getLoginMember(Integer memberId) {
        Member originMember = memberMapper.selectByPrimaryKey(memberId);
        if (ObjectUtils.isEmpty(originMember)) {
            throw new BusinessException(ExceptionType.MEMBER_NOT_FOUND);
        }
        MemberDTO memberDTO = new MemberDTO();
        return memberDTO;
    }

    @Override
    public MemberDTO getLoginMember(String memberName) {
        Member member = memberMapper.selectByMemberName(memberName);
        if (member == null) {
            return null;
        }
        return new MemberDTO(member);
    }

}
