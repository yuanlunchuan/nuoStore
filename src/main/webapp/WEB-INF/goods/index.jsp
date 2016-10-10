<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String baseUrl = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>诺利康</title>
<link href="<%=baseUrl%>/static/css/master.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=baseUrl%>/static/js/jquery.js"></script>
<script type="text/jscript">
	
	
$(function(){
	var $qqServer = $('.qqserver');
	var $qqserverFold = $('.qqserver_fold');
	var $qqserverUnfold = $('.qqserver_arrow');
	$qqserverFold.click(function(){
		$qqserverFold.hide();
		$qqServer.addClass('unfold');
	});
	$qqserverUnfold.click(function(){
		$qqServer.removeClass('unfold');
		$qqserverFold.show();
	});
	//窗体宽度小鱼1024像素时不显示客服QQ
	function resizeQQserver(){
		$qqServer[document.documentElement.clientWidth < 0 ? 'hide':'show']();
	}
	$(window).bind("load resize",function(){
		resizeQQserver();
	});
});


</script>
</head>

<body>
  <div class="container">
    <div class="nav-header">
      <i><a href="<%=baseUrl%>/sites">&#xe602;</a></i>积分商城<em><a href="<%=baseUrl%>/profile">&#xe603;</a></em>
    </div>

    <div class="slider">
      <ul>
        <li><a href="#" target="_blank"><img src="<%=baseUrl%>/static/images/1.jpg" alt="诺利康"></a></li>
        <li><a href="#" target="_blank"><img src="<%=baseUrl%>/static/images/2.jpg" alt="诺利康"></a></li>
        <li><a href="#" target="_blank"><img src="<%=baseUrl%>/static/images/3.jpg" alt="JS诺利康"></a></li>
      </ul>
    </div>
    <script type="text/javascript" src="<%=baseUrl%>/static/js/yxMobileSlider.js"></script>
    <script>
					$(".slider").yxMobileSlider({
						width : 640,
						height : 320,
						during : 10000
					})
				</script>
    <div class="mobox">
      <ul>
        <li>
          <div class="pic">
            <a href="<%=baseUrl%>/goods/123">
              <img src="<%=baseUrl%>/static/images/01.png" width="245" height="196" alt="" />
            </a>
          </div>
          <div class="txt">
            <span>诺康薏仁紫苏</span>
            <p>
              <strong>￥ 500.00<a href="#">购买</a></strong>
            </p>
          </div>
        </li>
        <li>
          <div class="pic">
            <img src="<%=baseUrl%>/static/images/02.png" width="245" height="196" alt="" />
          </div>
          <div class="txt">
            <span>益生菌</span>
            <p>
              <strong>￥ 500.00<a href="#">购买</a></strong>
            </p>
          </div>
        </li>
        <li>
          <div class="pic">
            <img src="<%=baseUrl%>/static/images/03.png" width="245" height="196" alt="" />
          </div>
          <div class="txt">
            <span>柯氏发酵冬虫夏草胶囊</span>
            <p>
              <strong>￥ 500.00<a href="#">购买</a></strong>
            </p>
          </div>
        </li>
        <li>
          <div class="pic">
            <img src="<%=baseUrl%>/static/images/04.png" width="245" height="196" alt="" />
          </div>
          <div class="txt">
            <span>均衡营养特膳</span>
            <p>
              <strong>￥ 500.00<a href="#">购买</a></strong>
            </p>
          </div>
        </li>
      </ul>
    </div>
  </div>
  <div class="qqserver">
    <div class="qqserver_fold">
      <div></div>
    </div>
    <div class="qqserver-body" style="display: block;">
      <div class="qqserver-header">
        <div></div>
        <span class="qqserver_arrow"></span>
      </div>
      <ul>
        <li><a href="tel:18684819997">
            <div>客服咨询</div> <span>琳琳</span>
        </a></li>
        <li><a href="tel:18684819997">
            <div>客服咨询</div> <span>云云</span>
        </a></li>
        <li><a href="tel:18684819997">
            <div>推广合作</div> <span class="qqserver-service-alert">单单</span>
        </a></li>
      </ul>
    </div>
  </div>
</body>
</html>
