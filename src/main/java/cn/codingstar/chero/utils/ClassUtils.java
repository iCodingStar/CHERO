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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * <p>Class: ClassUtils</p>
 * <p>Description: 用于Class的工具类</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/23 15:26
 * @since 1.0.0
 */
public interface ClassUtils {
    /***
     * 判断某一个类是否为原始数据类型
     *
     * @param clazz
     * @return
     */
    static boolean isPrimitive(Class<?> clazz) {
        return clazz.isPrimitive() || clazz == Byte.class || clazz == Short.class || clazz == Integer.class ||
                clazz == Long.class || clazz == Float.class || clazz == Double.class || clazz == Boolean.class ||
                clazz == Character.class || clazz == BigInteger.class || clazz == BigDecimal.class || clazz == String.class ||
                clazz == Date.class || Enum.class.isAssignableFrom(clazz);
    }

    /***
     * 判断一个类是否为List类型
     *
     * @param clazz
     * @return
     */
    static boolean isList(Class<?> clazz) {
        return List.class.isAssignableFrom(clazz);
    }

    /***
     * 判断一个类是否为Set类型
     *
     * @param clazz
     * @return
     */
    static boolean isSet(Class<?> clazz) {
        return Set.class.isAssignableFrom(clazz);
    }
}
