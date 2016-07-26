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

package cn.codingstar.chero.common.bean;

/**
 * 异常类型.
 *
 * @author ShiXing
 * @see cn.codingstar.chero.common.exception.BusinessException
 * @since 1.0.0
 */
public enum ExceptionType {
    MEMBER_NAME_NOT_EXIST(20001, "用户名不存在"),
    MEMBER_NOT_FOUND(20001, "找不到用户"),
    MEMBER_REGISTER_FAILED(20002, "用户注册失败"),
    MEMBER_NAME_PASSWORD_ERROR(20003,"用户名密码错误"),
    PARAMETER_ILLEGAL(20004,"参数不合法"),
    AUTHORIZATION_ERROR(20005,"授权失败");

    private int code;

    private String message;

    ExceptionType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
