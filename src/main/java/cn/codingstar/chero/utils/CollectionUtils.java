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
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Class: CollectionUtils</p>
 * <p>Description: 集合工具类</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/23 16:44
 * @since 1.0.0
 */
public interface CollectionUtils {

    /***
     * 检测集合是否为空
     *
     * @param collection 需要检测的集合
     * @return 集合为null或者为空时返回true, 否则返回false
     */
    static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    /***
     * 检测Map是否为空
     *
     * @param map 需要检测的Map
     * @return map为null或者为空时返回true, 否则返回false
     */
    static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }

    /***
     * 检测数组是否为空
     *
     * @param array 需要检测的数组
     * @return array为null或者为空时返回true, 否则返回false
     */
    static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    /***
     * 将map转化为value为数组的map
     *
     * @param map 需要转化的map
     * @return 如果map非空, 返回转化后的结果，否则，新建一个map返回
     */
    static Map<String, String[]> mapToArrayMap(Map<String, String> map) {
        if (!isEmpty(map)) {
            Map<String, String[]> result = new HashMap<>();
            for (String key : map.keySet()) {
                result.put(key, new String[]{map.get(key)});
            }
            return result;
        }
        return new HashMap<>();
    }

    /***
     * 新建一个map,装入keys和values
     *
     * @param keys   键值数组
     * @param values 值数组
     * @param <T>    值类型
     * @return 返回一个新的map
     */
    static <T> Map<String, T> newMap(String[] keys, T... values) {
        Map<String, T> map = new HashMap<>();
        if (!isEmpty(keys) && !isEmpty(values) && keys.length <= values.length) {
            for (int i = 0; i < keys.length; i++) {
                map.put(keys[i], values[i]);
            }
        }
        return map;
    }

    /***
     * 创建一个map,装入key和value
     *
     * @param key   键
     * @param value 值
     * @param <T>   值类型
     * @return 返回一个新的map
     */
    static <T> Map<String, T> newMap(String key, T value) {
        Map<String, T> map = new HashMap<>();
        if (!StringUtils.isEmpty(key) && !ObjectUtils.isEmpty(value)) {
            map.put(key, value);
        }
        return map;
    }
}
