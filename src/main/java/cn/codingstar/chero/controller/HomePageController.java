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
package cn.codingstar.chero.controller;

import cn.codingstar.chero.common.authorization.CheckLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Class: HomePageController</p>
 * <p>Description: 主页控制器</p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/7/24 11:02
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = {"/HomePage"})
public class HomePageController {

    /***
     * 门户主页首页
     *
     * @return
     */
    @RequestMapping(value = {"/Index"}, method = {RequestMethod.GET})
    public ModelAndView homePageIndex() {
        ModelAndView mav = new ModelAndView("home/index");
        return mav;
    }
}
