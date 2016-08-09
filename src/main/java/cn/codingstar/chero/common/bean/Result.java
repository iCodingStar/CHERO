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

public class Result<T> {

    private MessageType message;

    private Object data;

    public Result() {
        this.message = MessageType.UNKNOWN_RESULT;
    }

    public Result(Object data) {
        this.message = MessageType.UNKNOWN_RESULT;
        this.data = data;
    }

    public Result(MessageType message) {
        if (message != null) {
            this.message = message;
        } else {
            this.message = MessageType.UNKNOWN_RESULT;
        }
    }

    public boolean success() {
        return (this.message.getCode() > 10000 && this.message.getCode() % 2 == 1);
    }

    public MessageType getMessage() {
        return message;
    }

    public void setMessage(MessageType message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
