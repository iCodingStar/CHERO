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

import cn.codingstar.chero.common.exception.BusinessException;
import lombok.Data;

/**
 * <p>Class: </p>
 * <p>Description: </p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/26 8:23
 * @since 1.0.0
 */
@Data
public class Result<T> {
    private int code;

    private String message;

    private Object data;

    public Result() {
        this.code = 200;
        this.message = "请求成功";
    }

    public Result(Object data) {
        this.code = 200;
        this.message = "请求成功";
        this.data = data;
    }

    public Result(Exception exception) {
        if (exception instanceof BusinessException) {
            BusinessException businessException = (BusinessException) exception;
            this.code = businessException.getCode();
            this.message = businessException.getMessage();
        } else {
            this.code = 500;
            this.message = "系统发生错误，请联系管理员";
        }
    }

    public Result(BusinessMessage message) {
        if (message != null) {
            if (message.getCode() != null){
                this.code = message.getCode();
            }else {
                this.code = 100;
            }
            if (message.getMessage()!= null){
                this.message = message.getMessage();
            }else {
                this.message = "未知结果";
            }
        } else {
            this.code = 100;
            this.message = "未知结果";
        }
    }

    public boolean success() {
        return this.code == 200;
    }

    public boolean authorizationError() {
        return this.code == 401;
    }
}
