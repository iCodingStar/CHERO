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
package cn.codingstar.chero.common.bean;

/**
 * <p>Class: </p>
 * <p>Description: 信息枚举</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/26 8:53
 * @since 1.0.0
 */
public enum MessageType {
    UNKNOWN_RESULT(10000, "未知结果"),
    MEMBER_NAME_ALREADY_EXIST(10001, "用户已存在"),
    MEMBER_NAME_NOT_EXIST(20001, "用户不存在"),
    MEMBER_REGISTER_SUCCEED(10002, "用户注册成功"),
    MEMBER_REGISTER_FAILED(20002, "用户注册失败"),
    MEMBER_NAME_PASSWORD_OK(10003, "用户名密码正确"),
    MEMBER_NAME_PASSWORD_ERROR(20003, "用户名密码错误");

    private int code;
    private String message;

    MessageType(Integer code, String message) {
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
