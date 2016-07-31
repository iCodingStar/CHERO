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
package cn.codingstar.chero.common.utils;

/**
 * <p>Class: </p>
 * <p>Description: </p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/31 0:03
 * @since 1.0.0
 */
public interface NumberUtils {

    static String format(Integer number, Integer length) {
        String value = String.valueOf(number);
        StringBuffer formatNumber = new StringBuffer();
        if (length - value.length() <= 0) {
            return value;
        }
        for (int i = 0; i < length - value.length(); i++) {
            formatNumber.append("0");
        }
        formatNumber.append(value);
        return formatNumber.toString();
    }

}
