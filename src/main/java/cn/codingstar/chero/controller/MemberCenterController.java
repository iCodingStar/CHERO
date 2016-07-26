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
    public ModelAndView memberCenterIndex() {
        return new ModelAndView("member/index");
    }

    /***
     * 检查用户名是否已存在
     *
     * @param memberName
     * @return
     */
    @RequestMapping(value = {"/checkMemberName"}, method = {RequestMethod.GET})
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

//    @RequestMapping(value = "/Login", method = RequestMethod.GET)
//    public String login() {
//        return "/member/login";
//    }

    /***
     * 用户登录
     *
     * @param memberName
     * @param password
     * @return
     */
    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public ModelAndView login(String memberName, String password) {
        ModelAndView mav = new ModelAndView();
        Result result = memberService.login(memberName, password);
        if (result.success()) {
            mav.setViewName("/member/index");
            mav.addObject("member", result.getData());
            mav.addObject("message", result.getMessage());
        } else {
            mav.setViewName("/member/login");
            mav.addObject("message", result.getMessage());
        }
        return mav;
    }


    /***
     * @return
     */
//    @RequestMapping(value = {"/Register"}, method = RequestMethod.GET)
//    public String register() {
//        return "member/register";
//    }

    /***
     * 用户注册
     *
     * @param member
     * @return
     */
    @RequestMapping(value = {"/Register"}, method = RequestMethod.GET)
    public String register(Member member) {
        Result<MemberDTO> result = memberService.register(member);
        return "member/register-success";
    }
}
