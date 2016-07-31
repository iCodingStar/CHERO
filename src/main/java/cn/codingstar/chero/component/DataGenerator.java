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
package cn.codingstar.chero.component;

import cn.codingstar.chero.common.utils.NumberUtils;
import cn.codingstar.chero.service.UniqueKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * <p>Class: </p>
 * <p>Description: 数据生成器</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/30 18:01
 * @since 1.0.0
 */
@Component
public class DataGenerator {

    @Autowired
    private UniqueKeyService uniqueKeyService;

    /*生成用户id*/
    public String generateMemberId() {
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(Calendar.YEAR);
        String YEAR = NumberUtils.format(year, 4);
        Integer month = calendar.get(Calendar.MONTH) + 1;
        String MONTH = NumberUtils.format(month, 2);
        Integer day = calendar.get(Calendar.DAY_OF_MONTH);
        String DAY = NumberUtils.format(day, 2);
        Integer uniqueKey = uniqueKeyService.insertForKey();
        String UNIQUE_KEY = NumberUtils.format(uniqueKey, 4);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(YEAR);
        stringBuffer.append(MONTH);
        stringBuffer.append(DAY);
        stringBuffer.append(UNIQUE_KEY);
        return stringBuffer.toString();
    }
}
