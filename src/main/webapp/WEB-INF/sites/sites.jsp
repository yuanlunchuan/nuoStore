<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String baseUrl = request.getContextPath(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>诺利康</title>
<link href="/spring1/static/css/master.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/spring1/static/js/jquery.js"></script>
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
		<div class="top-header">
			<div class="logo">
				<img src="/spring1/static/images/logo.png" width="104" height="60" alt="" />
			</div>
			<div class="user">
			  <c:choose>
			    <c:when test="${ sessionScope.userId>0}">
			            欢迎您<a href="">${user.userName}</a>
			    </c:when>
			    <c:otherwise>
				  <a href="/spring1/sessions/new">登陆</a>|<a href="#">注册</a>
				</c:otherwise>
			  </c:choose>
			</div>
		</div>

		<div class="slider">
			<ul>
				<li><a href="#" target="_blank"><img src="/spring1/static/images/1.jpg"
						alt="诺利康"></a></li>
				<li><a href="#" target="_blank"><img src="/spring1/static/images/2.jpg"
						alt="诺利康"></a></li>
				<li><a href="#" target="_blank"><img src="/spring1/static/images/3.jpg"
						alt="JS诺利康"></a></li>
			</ul>
		</div>
		<script type="text/javascript" src="/spring1/static/js/yxMobileSlider.js"></script>
		<script>
			$(".slider").yxMobileSlider({
				width : 640,
				height : 320,
				during : 10000
			})
		</script>

		<div class="nav">
			<ul>
				<li><i class="icon-fenlei font12"></i><a href="<%=baseUrl%>/goods">全部商品</a></li>
				<li><i class="icon-xuexi font14"></i><a href="<%=baseUrl %>/academies/">学术课题</a></li>
				<li><i class="icon-jifen font14"></i><a href="jifen.html">积分商城</a></li>
				<li><i class="icon-wodedingdan font12"></i><a href="/spring1/orders">我的订单</a></li>
				<li><i class="icon-gouwuche font12"></i><a href="gou.html">购物车</a></li>
				<li><i class="icon-gerenzhongxin font12"></i><a href="/spring1/profile/">个人中心</a></li>
			</ul>
		</div>

		<div class="ad-banner">
			<a href="xiangxi.html"><img src="/spring1/static/images/4.jpg" width="658" height="219" alt="" /></a>
		</div>
		<div class="ad-banner">
			<a href="xiangxi.html"><img src="/spring1/static/images/5.jpg" width="658" height="219" alt="" /></a>
		</div>

		<div class="shequ">
			<div class="pic">
				<a href="#"><img src="/spring1/static/images/shangcheng.jpg" width="336"
					height="148" alt="" /></a>
			</div>
			<div class="pic1">
				<a href="#"><img src="/spring1/static/images/jifeng.jpg" width="334"
					height="148" alt="" /></a>
			</div>
		</div>

		<div class="mod">
			<div class="title">
				<em></em><strong>珍瘦体脂管理课程</strong><i>|<a href="#">更多</a></i>
			</div>
			<div class="pic">
				<div class="tui">
					<div class="tu">
						<a href="#"><img src="/spring1/static/images/6.png" width="658" height="482"
							alt="" /></a>
					</div>
					<h1>
						<a href="xiangxi.html">珍瘦体脂管理课程</a>
					</h1>
					<p class="daodu">其背后的原因除了营养的不均衡还有习惯养成难的问题。面对 ...【读书会预告</p>
					<p class="jiag">
						价格：￥<strong>3380</strong>元<a href="xiangxi.html">购买</a>
					</p>
				</div>
				<div class="mtu">
					<ul class="mtut">
						<li><div class="img-pic">
								<img src="/spring1/static/images/7.png" width="124" height="107" alt="" />
							</div>
							<p>薏仁紫苏2盒</p></li>
						<li><div class="img-pic">
								<img src="/spring1/static/images/8.png" width="124" height="107" alt="" />
							</div>
							<p>益生菌3盒</p></li>
						<li><div class="img-pic">
								<img src="/spring1/static/images/9.png" width="124" height="107" alt="" />
							</div>
							<p>柯氏发酵冬虫夏草胶囊2盒</p></li>
						<li><div class="img-pic">
								<img src="/spring1/static/images/10.png" width="124" height="107" alt="" />
							</div>
							<p>均衡营养特善2盒</p></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="mod">
			<div class="title">
				<em></em><strong>学术课题展示</strong><i>|<a href="xueshu.html">更多</a></i>
			</div>
			<div class="video">
				<ul>
					<li><iframe frameborder="0" width="100%" height="auto"
							src="http://v.qq.com/iframe/player.html?vid=u0019xi8pje&tiny=0&auto=0"
							allowfullscreen></iframe></li>
				</ul>
			</div>
		</div>
		<div class="mod">
			<div class="title">
				<em></em><strong>案例展示</strong><i>|<a href="/spring1/cases">更多</a></i>
			</div>
			<ul class="anli">
				<li>
					<div class="img-an">
						<img src="/spring1/static/images/11.jpg" width="392" height="528" alt="" />
					</div>
					<div class="wz">
						<strong>姓名：夏倩</strong>
						<p>在开始正文前，先让大家看几组图片，也问大家一个问题，大家觉得这是同一个人吗？？ 图一 图二
							图四为：未减肥前的照片，下图及第三张均是减肥成功的照片。</p>
					</div>
				</li>
				<li>
					<div class="img-an">
						<img src="/spring1/static/images/11.jpg" width="392" height="528" alt="" />
					</div>
					<div class="wz">
						<strong>姓名：夏倩</strong>
						<p>在开始正文前，先让大家看几组图片，也问大家一个问题，大家觉得这是同一个人吗？？ 图一 图二
							图四为：未减肥前的照片，下图及第三张均是减肥成功的照片。</p>
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
