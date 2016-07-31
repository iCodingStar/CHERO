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
package cn.codingstar.chero.service.impl;

import cn.codingstar.chero.mapper.UniqueKeyMapper;
import cn.codingstar.chero.model.persistence.UniqueKey;
import cn.codingstar.chero.service.UniqueKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Class: </p>
 * <p>Description: </p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/30 18:26
 * @since 1.0.0
 */
@Service
public class UniqueKeyServiceImpl implements UniqueKeyService {

    @Autowired
    private UniqueKeyMapper uniqueKeyMapper;

    @Override
    public Integer insertForKey() {
        UniqueKey uniqueKey = new UniqueKey();
        try{
            uniqueKeyMapper.insert(uniqueKey);
        }catch (Exception e){
            e.printStackTrace();
        }
        return uniqueKey.getId();
    }
}
