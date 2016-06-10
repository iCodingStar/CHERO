<%--
 * <p>File: hrad.jsp</p>
 * <p>Description:网站页脚内容 </p>
 * <p>site: www.codingstar.cn</p>
 *
 * @autor iCodingStar
 * @date 2016/6/10 20:53
 * @since 1.0.0
--%>
<!--Footer-part-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!----footer--->
<div class="section footer">
    <div class="container-fluid">
        <div class="contact">
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
        </div>

        <div class="copy">
            <p>Copyright &copy; 2016.All Rights Reserved <a href="http://blog.codingstar.cn/" target="_blank"
                                                            title="iCodingStar">iCodingStar</a></p>
        </div>
    </div>
</div>
<!----footer--->

<!--start-smoth-scrolling-->
<script type="text/javascript">
    jQuery(document).ready(function ($) {
        $(".scroll").click(function (event) {
            event.preventDefault();
            $('html,body').animate({scrollTop: $(this.hash).offset().top}, 3000);
        });
    });
</script>

<a href="#home" id="toTop" class="scroll" style="display: block;">
    <span id="toTopHover" style="opacity: 1;"> </span>
</a>

