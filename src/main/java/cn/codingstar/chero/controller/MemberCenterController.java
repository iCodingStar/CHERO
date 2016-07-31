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
package cn.codingstar.chero.controller;

import cn.codingstar.chero.common.authorization.CheckLogin;
import cn.codingstar.chero.common.bean.BusinessMessage;
import cn.codingstar.chero.common.bean.MessageType;
import cn.codingstar.chero.common.bean.Result;
import cn.codingstar.chero.common.web.AbstractWebController;
import cn.codingstar.chero.model.dto.MemberDTO;
import cn.codingstar.chero.model.persistence.Member;
import cn.codingstar.chero.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * <p>Class: MemberController</p>
 * <p>Description: 会员中心控制器</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/10 21:01
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = {"/MemberCenter"})
public class MemberCenterController extends AbstractWebController {

    @Autowired
    private MemberService memberService;

    /***
     * 会员中心首页
     *
     * @return
     */
    @RequestMapping(value = {"/Index"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberCenterIndex() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/index");
        return mav;
    }

    /***
     * 检查用户名是否已存在
     *
     * @param memberName
     * @return
     */
    @RequestMapping(value = {"/CheckMemberName"}, method = {RequestMethod.GET})
    public
    @ResponseBody
    void checkMemberName(@RequestParam("memberName") String memberName) {
        BusinessMessage message = new BusinessMessage();
        if (memberService.checkMemberName(memberName)) {
            message.setCode(MessageType.MEMBER_NAME_NOT_EXIST.getCode());
            message.setMessage(MessageType.MEMBER_NAME_NOT_EXIST.getMessage());
        } else {
            message.setCode(MessageType.MEMBER_NAME_ALREADY_EXIST.getCode());
            message.setMessage(MessageType.MEMBER_NAME_ALREADY_EXIST.getMessage());
        }
        Result<Boolean> result = new Result<Boolean>(message);
        result.setData(memberService.checkMemberName(memberName));
        renderJson(result);
    }

    /***
     * 用户前往登录
     *
     * @return
     */
    @RequestMapping(value = {"/Login/Index"}, method = RequestMethod.GET)
    public String toLogin() {
        return "/member/login";
    }

    /***
     * 用户登录验证
     *
     * @param memberName
     * @param password
     * @return
     */
    @RequestMapping(value = {"/Login/Check"}, method = RequestMethod.POST)
    public void checkLogin(String memberName, String password) {
        ModelAndView mav = new ModelAndView();
        boolean loginSuccess = memberService.login(memberName, password);
        if (loginSuccess) {//如果登陆成功
            loginSuccess(memberService.getLoginMember(memberName));
            renderJson(true);
        } else {//登陆失败
            renderJson(false);
        }
    }

    /***
     * 用户前往注册
     *
     * @return
     */
    @RequestMapping(value = {"/Register/Index"}, method = RequestMethod.GET)
    public String toRegister() {
        return "/member/register";
    }

    /***
     * 用户注册
     *
     * @param member
     * @return
     */
    @RequestMapping(value = {"/Register/Check"}, method = RequestMethod.POST)
    public void checkRegister(Member member) {
        //用户注册
        boolean registerSuccess = memberService.register(member);
        if (registerSuccess){
            //用户登录
            MemberDTO memberDTO = memberService.getLoginMember(member.getMemberName());
            loginSuccess(memberDTO);
            renderJson(true);
        }else {
            setRequestAttribute("error","注册失败！");
            renderJson(false);
        }
    }

    /**
     * @author iCodingStar
     * @params []
     * @return java.lang.String
     * @description 注册成功
     * @since 1.0 2016/7/31 1:04
     */
    @RequestMapping(value = {"/Register/Success"},method = RequestMethod.GET)
    @CheckLogin
    public String registerSuccess(){
        return "/member/register-success";
    }
}
