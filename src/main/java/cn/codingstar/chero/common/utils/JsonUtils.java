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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
 * <p>Class: JsonUtils</p>
 * <p>Description: Json工具类,使用GSON作为Json转换工具</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/23 17:19
 * @since 1.0.0
 */
public interface JsonUtils {

    Gson GSON = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    /***
     * 将对象转化为json字符串
     *
     * @param o
     * @return
     */
    static String toJson(Object o) {
        return GSON.toJson(o);
    }

    /***
     * 将json字符串转化成对应类型的对象
     *
     * @param jsonString json字符串
     * @param clazz      对象类型
     * @param <T>        类
     * @return
     */
    static <T> T fromJson(String jsonString, Class<T> clazz) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        }
        return GSON.fromJson(jsonString, clazz);
    }

    /***
     * @param jsonString
     * @param type
     * @param <T>
     * @return
     */
    static <T> T fromJson(String jsonString, Type type) {
        if (StringUtils.isEmpty(jsonString)) {
            return null;
        }
        return GSON.fromJson(jsonString, type);
    }
}
