package cn.codingstar.chero.controller;

import cn.codingstar.chero.common.bean.GeeTestData;
import cn.codingstar.chero.common.web.AbstractWebController;
import cn.codingstar.chero.component.GeeTestSDK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description 验证码验证服务
 */
@Controller
@RequestMapping("/VerifyCode")
public class VerifyCodeController extends AbstractWebController {

    @Autowired
    private GeeTestSDK geeTestSDK;

    /**
     * 使用Get的方式返回challenge和capthca_id,此方式以实现前后端完全分离的开发模式
     */
    @RequestMapping(value = {"/StartCaptcha"}, method = {RequestMethod.GET})
    public
    @ResponseBody
    String startCapt() {

        //获取request
        HttpServletRequest request = getRequest();

        //进行验证预处理
        int gtServerStatus = geeTestSDK.preProcess();

        //将服务器状态设置到session中
        request.getSession().setAttribute(geeTestSDK.gtServerStatusSessionKey, gtServerStatus);

        //将userId设置到session中
        //request.getSession().setAttribute("userId", userId);

        //返回结果值
        return geeTestSDK.getResponseValue();
    }

    @RequestMapping(value = {"/VerifySecCode"}, method = {RequestMethod.POST})
    public
    @ResponseBody
    GeeTestData verifyLogin(HttpServletRequest request,
                            @RequestParam("geetest_challenge") String challenge,
                            @RequestParam("geetest_seccode") String secCode,
                            @RequestParam("geetest_validate") String validate) {

        /*返回结果*/
        GeeTestData data = new GeeTestData();

        //从session中获取gt-server状态
        int serverStatus = (Integer) request.getSession().getAttribute(geeTestSDK.gtServerStatusSessionKey);
        //从session中获取userId
        String userId = (String) request.getSession().getAttribute("userId");

        int result = 0;

        if (serverStatus == 1) {
            //gt-server正常，向gt-server进行二次验证
            result = geeTestSDK.enhencedValidateRequest(challenge, validate, secCode, userId);
            System.out.println(result);
        } else {
            // gt-server非正常情况下，进行failBack模式验证
            System.out.println("失败：请使用你自己的cat验证");
            result = geeTestSDK.failBackValidateRequest(challenge, validate, secCode);
            System.out.println(result);
        }

        if (result == 1) {
            // 验证成功
            data.setStatus("success");
            data.setVersion(geeTestSDK.getVersionInfo());
            return data;
        } else {
            // 验证失败
            data.setStatus("fail");
            data.setVersion(geeTestSDK.getVersionInfo());
            return data;
        }
    }
}
