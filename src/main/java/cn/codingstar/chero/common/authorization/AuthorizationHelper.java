/*
 * Copyright 2002-2016 the original author or authors.
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

package cn.codingstar.chero.common.authorization;


import cn.codingstar.chero.common.utils.DateUtils;
import cn.codingstar.chero.common.utils.EncodeDecodeUtils;

import java.util.Date;

/**
 * 权限帮助类,处理所有与权限相关的内容.
 *
 * @author ShiXing
 * @since 1.0.0
 */
public interface AuthorizationHelper {

    String DATE_FORMAT = "yyyyMMddHHmmss";

    long EXPIRED_TIME = 1000L * 60L * 60L * 24L * 30L;

    /***
     * 加密密码
     *
     * @param password
     * @param passwordSalt
     * @return
     */
    static String encodePassword(String password, String passwordSalt) {
        return EncodeDecodeUtils.encodeByMd5(password + passwordSalt);
    }

    /***
     * 生成token
     *
     * @param username
     * @param password
     * @return
     */
    static String generateToken(String username, String password) {
        return EncodeDecodeUtils.encryptDes(DateUtils.format(new Date(), DATE_FORMAT) + username, password);
    }

    /***
     * 检查token是否过期
     *
     * @param token
     * @param password
     * @return
     */
    static boolean isTokenExpired(String token, String password) {
        String source = EncodeDecodeUtils.decryptDes(token, password);
        Date date = DateUtils.parse(source.substring(0, DATE_FORMAT.length()), DATE_FORMAT);
        long time = System.currentTimeMillis() - date.getTime();
        if (time > EXPIRED_TIME) {
            return true;
        }
        return false;
    }

}
