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
package cn.codingstar.chero.utils;

import java.util.Collection;

/**
 * <p>Class: AssertUtils</p>
 * <p>Description: 断言工具类</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/23 17:12
 * @since 1.0.0
 */
public interface AssertUtils {

    /***
     * 判断object是否为null,如果为null,抛出异常
     *
     * @param o
     */
    static void isNull(Object o) {
        if (o == null) {
            throw new IllegalArgumentException();
        }
    }

    /***
     * 判断object是否为空,如果为空,抛出异常
     *
     * @param o
     */
    static void isEmpty(Object o) {
        if (ObjectUtils.isEmpty(o)) {
            throw new IllegalArgumentException();
        }
    }

    /***
     * 判断集合是否为空，如果是抛出异常
     *
     * @param collection
     */
    static void isEmpty(Collection<?> collection) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new IllegalArgumentException();
        }
    }
}
