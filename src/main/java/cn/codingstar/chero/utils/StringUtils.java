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

import java.io.UnsupportedEncodingException;

/**
 * <p>Class: StringUtils</p>
 * <p>Description: 处理String相关的工具方法</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/23 15:44
 * @since 1.0.0
 */
public interface StringUtils {

    /***
     * 判断字符串是否为空串
     *
     * @param s 需要检查的字符串
     * @return 如果字符串为null或者为空返回true, 否则返回false
     */
    static boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }

    /***
     * 判断字符序列是否为空序列
     *
     * @param cs 需要检查的字符序列
     * @return 如果字符序列为null或者为空返回true, 否则返回false
     */
    static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /***
     * 将字符串转化成UTF-8格式的字节数组
     *
     * @param s 需要转化的字符串
     * @return
     */
    static byte[] toBytes(String s) {
        try {
            return s.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 将字节数组转化为UTF-8格式的字符串
     *
     * @param b 需要转化的字节数组
     * @return
     */
    static String fromBytes(byte[] b) {
        try {
            return new String(b, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     * 判断一个字符序列是否为数字
     *
     * @param cs 需要判断的字符序列
     * @return 如果字符序列为数字返回true, 否则返回false
     */
    static boolean isNumeric(CharSequence cs) {
        if (isEmpty(cs)) {
            return false;
        }
        final int length = cs.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
