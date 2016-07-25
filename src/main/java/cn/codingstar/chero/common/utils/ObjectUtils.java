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
 * <p>Class: ObjectUtils</p>
 * <p>Description: 对象工具类</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/23 15:19
 * @since 1.0.0
 */
public interface ObjectUtils {
    /***
     * 判断对象是否为null
     *
     * @param o
     * @return
     */
    static boolean isNull(Object o) {
        return o == null;
    }

    /***
     * 判断对象是否为空
     *
     * @param o
     * @return
     */
    static boolean isEmpty(Object o) {
        return o == null || o.toString().length() == 0;
    }

}
