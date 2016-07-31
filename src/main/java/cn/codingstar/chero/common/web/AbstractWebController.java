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
package cn.codingstar.chero.common.web;

import cn.codingstar.chero.common.utils.JsonUtils;
import cn.codingstar.chero.model.dto.MemberDTO;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>Class: AbstractWebController</p>
 * <p>Description: 提供给web端使用的基本的Controller</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/26 8:12
 * @since 1.0.0
 */
public abstract class AbstractWebController extends AbstractController {
    /**
     * 存放当前线程的HttpServletResponse对象
     */
    private static ThreadLocal<HttpServletResponse> httpServletResponseThreadLocal = new ThreadLocal<>();

    protected static final String MEMBER_ATTRIBUTE_NAME = "memberName";

    protected static final String NICKNAME_ATTRIBUTE_NAME = "nickname";

    protected static final String MEMBER_ATTRIBUTE = "member";


    /**
     * 绑定response对象
     *
     * @param response
     */
    @ModelAttribute
    protected void setThreadLocal(HttpServletResponse response) {
        httpServletResponseThreadLocal.set(response);
    }

    /**
     * 成功登录后处理session
     *
     * @param loginMember
     */
    protected void loginSuccess(MemberDTO loginMember) {
        setSessionAttribute(MEMBER_ATTRIBUTE, loginMember);
        setSessionAttribute(MEMBER_ATTRIBUTE_NAME, loginMember.getMemberName());
        setSessionAttribute(NICKNAME_ATTRIBUTE_NAME, loginMember.getMemberNickname());
    }

    /**
     * 成功登录后处理session
     *
     * @param loginMember
     */
    protected void loginError(MemberDTO loginMember) {
        setSessionAttribute(MEMBER_ATTRIBUTE, loginMember);
        setSessionAttribute(MEMBER_ATTRIBUTE_NAME, loginMember.getMemberName());
        setSessionAttribute(NICKNAME_ATTRIBUTE_NAME, loginMember.getMemberNickname());
    }

    /**
     * 成功注销后处理session
     */
    protected void logoutSuccess() {
        setSessionAttribute(MEMBER_ATTRIBUTE, null);
        setSessionAttribute(MEMBER_ATTRIBUTE_NAME, null);
        setSessionAttribute(NICKNAME_ATTRIBUTE_NAME, null);
    }

    /**
     * 获取用户的username
     *
     * @return
     */
    protected String getUsername() {
        return (String) getSessionAttribute(MEMBER_ATTRIBUTE_NAME);
    }

    /**
     * 获取当前线程的HttpServletResponse对象
     *
     * @return 当前线程的HttpServletResponse对象
     */
    protected HttpServletResponse getResponse() {
        return httpServletResponseThreadLocal.get();
    }

    /**
     * 客户端返回JSON字符串
     *
     * @param object
     * @return
     */
    protected void renderJson(Object object) {
        renderText(JsonUtils.toJson(object), "application/json");
    }

    /**
     * 客户端返回字符串
     *
     * @param string
     * @return
     */
    protected void renderText(String string, String type) {
        try {
            HttpServletResponse response = getResponse();
            response.reset();
            response.setContentType(type);
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
