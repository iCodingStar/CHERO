/*
 * Copyright 2002-2016 the original author or authors.
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

package cn.codingstar.chero.common.authorization;

import cn.codingstar.chero.common.bean.ExceptionType;
import cn.codingstar.chero.common.exception.BusinessException;
import cn.codingstar.chero.common.utils.ObjectUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author ShiXing
 * @description 登陆验证拦截器
 * @since 1.0.0
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        //获取登陆注解
        CheckLogin checkLogin = handlerMethod.getMethodAnnotation(CheckLogin.class);
        //如果需要登陆，则检查用户是否登陆
        if (checkLogin != null) {
            checkLogin(request, response);
        }
        //如果需要登陆，则检查用户是否登陆
        checkLogin = handlerMethod.getBeanType().getDeclaredAnnotation(CheckLogin.class);
        if (checkLogin != null) {
            checkLogin(request, response);
        }
        return super.preHandle(request, response, handler);
    }

    private void checkLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //如果用户未登陆，则抛出异常
        if (ObjectUtils.isEmpty(session.getAttribute("memberName"))) {
            //跳转到个人中心界面
            request.getRequestDispatcher("/MemberCenter/Login/Index").forward(request,response);
            //throw new BusinessException(ExceptionType.AUTHORIZATION_ERROR);
        }
    }

}
