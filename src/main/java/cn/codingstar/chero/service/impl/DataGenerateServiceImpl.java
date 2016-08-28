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

import cn.codingstar.chero.common.utils.NumberUtils;
import cn.codingstar.chero.service.DataGenerateService;
import cn.codingstar.chero.service.UniqueKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;

/**
 * <p>Class: </p>
 * <p>Description: 数据生成器</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/30 18:01
 * @since 1.0.0
 */
@Service
public class DataGenerateServiceImpl implements DataGenerateService {

    @Autowired
    private UniqueKeyService uniqueKeyService;

    /**
     * 生成用户id
     * @return 用户id
     */

    /**
     * Spring事务传播属性总结：
     * Propagation.REQUIRED : 支持当前事务，如果没有当前事务，就新建一个事务。
     * Propagation.REQUIRES_NEW :新建一个事物，如果存在当前事务，就把当前事务挂起。新建的事务和挂起的事务没有任何关系。
     * 外层事务失败回滚之后，不能回滚内层事务执行结果。内层事务失败抛出异常，外层事物捕获。也可以不处理回滚操作。
     * Propagation.SUPPORTS : 支持当前事务，如果没有事务，就以非事务方式执行。
     * Propagation.MANDATORY : 支持当前事务，如果没有事物就抛出异常。
     * Propagation.NOT_SUPPORTED : 以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
     * Propagation.NEVER : 以非事务方式执行，如果当前存在事物，就抛出异常。
     * Propagation.NESTED : 如果一个活动的事物存在，则运行在一个嵌套的事务中。如果没有活动事务，则按REQUIRED方式执行。
     * 它使用了一个单独的事物，这个事务拥有多个可以回滚的保存点，内部事务的回滚不会对外部的事务造成影响。
     * 它只对DataSourceTransactionManager事务管理器起效。
     *
     * Spring事务隔离级别总结:
     * 1) 数据库隔离级别
     *     隔离级别           隔离级别的值         导致的问题
     * Read-Uncommitted           0             导致脏读
     * Read-Committed             1             避免脏读，允许不可重复读和幻读
     * Repeatable-Read            2             避免脏读，不可重复读，允许幻度
     * Serializable               3             串行化读，事务只能一个一个执行，避免了脏读，不可重复读，幻读。执行效率慢，使用需谨慎。
     * 说明：
     * 脏读：
     * 不可重复读：
     * 幻读：
     *
     * 2)
     */
    @Transactional(propagation = Propagation.NESTED)
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
