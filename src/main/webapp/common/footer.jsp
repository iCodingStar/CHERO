<%--

    Copyright 2002-2016 the original author or authors.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
--%>
<%--
  User: Xiaolong Zuo
  Time: 16/1/15 02:04
--%>
<!--Footer-part-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!----footer--->
<div class="footer">
    <div class="container">
        <div class="row top-line">
            <div class="col-lg-12">
                <hr>
            </div>
        </div>

        <div class="row middle-line">
            <span>电话：027-87771666</span>
        </div>

        <div class="row middle-line">
            <span>邮箱：c-hero@c-hero.cn</span>
        </div>

        <div class="row middle-line">
            <span>地址：湖北省武汉市洪山区邮科院体育中心/中国地质大学（武汉）北区体育馆</span>
        </div>

        <div class="row bottom-line">
            <div class="col-lg-12">
                <hr>
            </div>
        </div>

        <div class="copy">
            <p>Copyright &copy; 2016.All Rights Reserved <a href="http://blog.codingstar.cn/" target="_blank" title="iCodingStar">iCodingStar</a></p>
        </div>
    </div>
</div>

<!--start-smoth-scrolling-->
<script type="text/javascript">
    jQuery(document).ready(function ($) {
        $(".scroll").click(function (event) {
            event.preventDefault();
            $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
        });
    });
</script>
<!--start-smoth-scrolling-->
<script type="text/javascript">
//    $(document).ready(function () {
//        $().UItoTop({easingType: 'easeOutQuart'});
//    });
</script>

<a href="#home" id="toTop" class="scroll" style="display: block;">
    <span id="toTopHover" style="opacity: 1;"> </span>
</a>

<!--end-Footer-part-->
