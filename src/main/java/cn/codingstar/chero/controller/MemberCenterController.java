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
     * 个人信息
     *
     * @return
     */
    @RequestMapping(value = {"/Info"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberInfo() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/info");
        return mav;
    }

    /***
     * 个人照片
     *
     * @return
     */
    @RequestMapping(value = {"/Info/Photo"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberInfoPhoto() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/info-photo");
        return mav;
    }

    /***
     * 个人照片
     *
     * @return
     */
    @RequestMapping(value = {"/Info/More"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberInfoMore() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/info-more");
        return mav;
    }

    /***
     * 用户地址
     *
     * @return
     */
    @RequestMapping(value = {"/Address"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAddress() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/address");
        return mav;
    }

    /***
     * 购物车
     *
     * @return
     */
    @RequestMapping(value = {"/Cart"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberCart() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/cart");
        return mav;
    }

    /***
     * 当前订单
     *
     * @return
     */
    @RequestMapping(value = {"/Orders"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberOrders() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/orders");
        return mav;
    }

    /***
     * 所有订单
     *
     * @return
     */
    @RequestMapping(value = {"/Orders/All"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAllOrders() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/orders-all");
        return mav;
    }

    /***
     * 未支付订单
     *
     * @return
     */
    @RequestMapping(value = {"/Orders/Unpaid"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberUnpaidOrders() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/orders-unpaid");
        return mav;
    }

    /***
     * 会员账户
     *
     * @return
     */
    @RequestMapping(value = {"/Account"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAccount() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/account");
        return mav;
    }

    /***
     * 会员账户安全
     *
     * @return
     */
    @RequestMapping(value = {"/Account/Safety"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAccountSafety() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/account-safety");
        return mav;
    }

    /***
     * 会员账户修改
     *
     * @return
     */
    @RequestMapping(value = {"/Account/Modify/Password"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAccountModify() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("member/account-modify");
        return mav;
    }

    /***
     * 会员账户修改
     *
     * @return
     */
    @RequestMapping(value = {"/Account/Modify/Password/Verify"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAccountModifyVerify() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("member/account-modify-new");
        return mav;
    }

    /***
     * 会员账户修改
     *
     * @return
     */
    @RequestMapping(value = {"/Account/Modify/Password/New"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAccountModifyNew() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("member/account-modify-success");
        return mav;
    }

    /***
     * 会员服务
     *
     * @return
     */
    @RequestMapping(value = {"/Client/Service"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberClientService() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/client-service");
        return mav;
    }

    /***
     * 会员账户修改
     *
     * @return
     */
    @RequestMapping(value = {"/Advices"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAdvices() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/advices");
        return mav;
    }

    /***
     * 会员账户修改
     *
     * @return
     */
    @RequestMapping(value = {"/Aftermarket"}, method = {RequestMethod.GET})
    @CheckLogin
    public ModelAndView memberAftermarket() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/aftermarket");
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

    /**
     * 注销
     */
    @RequestMapping(value = {"/Logout"}, method = RequestMethod.GET)
    public ModelAndView logout() {
        ModelAndView mav = new ModelAndView();
        logoutSuccess();
        mav.setViewName("member/login");
        return mav;
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
        if (registerSuccess) {
            //用户登录
            MemberDTO memberDTO = memberService.getLoginMember(member.getMemberName());
            loginSuccess(memberDTO);
            renderJson(true);
        } else {
            setRequestAttribute("error", "注册失败！");
            renderJson(false);
        }
    }

    /**
     * @return java.lang.String
     * @author iCodingStar
     * @params []
     * @description 注册成功
     * @since 1.0 2016/7/31 1:04
     */
    @RequestMapping(value = {"/Register/Success"}, method = RequestMethod.GET)
    @CheckLogin
    public String registerSuccess() {
        return "/member/register-success";
    }

    /**
     * 找回密码
     */
    @RequestMapping(value = {"/Find/Password"}, method = {})
    public String findPassword() {
        return "member/account-find-password";
    }

    @RequestMapping(value = {"/Verify/Email"}, method = {RequestMethod.GET})
    public
    @ResponseBody
    Boolean verifyEmail(String email) {
        boolean result = true;
        //1.验证邮箱是否存在

        //2.发送验证码
        return result;
    }

    @RequestMapping(value = {"/Verify/SecCode"}, method = {RequestMethod.GET})
    public ModelAndView verifySecCode(String secCode) {
        //1.验证验证码是否正确
        ModelAndView mav = new ModelAndView();
        boolean result = true;
        if (result) {
            mav.setViewName("member/account-reset-password");
        } else {
            mav.addObject("verifyCodeError", "验证码不正确");
            mav.setViewName("member/account-find-password");
        }
        return mav;
    }

    @RequestMapping(value = {"/Reset/Success"}, method = {RequestMethod.GET})
    public ModelAndView resetSuccess(String secCode) {
        //1.验证验证码是否正确
        ModelAndView mav = new ModelAndView();
        boolean result = true;
        if (result) {
            mav.setViewName("member/account-reset-success");
        } else {
            mav.addObject("verifyCodeError", "验证码不正确");
            mav.setViewName("member/account-reset-password");
        }
        return mav;
    }
}
