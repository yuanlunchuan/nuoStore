<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String baseUrl = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>诺利康</title>
<link href="<%=baseUrl%>/static/css/master.css" rel="stylesheet"
	type="text/css">

</head>

<body>
	<div class="container">
		<div class="nav-header">
			<i><a href="<%=baseUrl%>/sites">&#xe602;</a></i>个人中心<em><a
				href="<%=baseUrl%>/profile">&#xe603;</a></em>
		</div>
		<div class="user-my">
			<div class="my-pic">
				<div class="pic-t">
					<img src="<%=baseUrl%>/static/images/6.jpg" width="1024"
						height="1024" alt="" />
				</div>
				<div class="int-zt">
					<strong>水果派派</strong>
					<p class="map">地址：湖南省长沙市芙蓉区158号明城国际3819</p>
					<p class="cute">
						<a href="map.html">修改地址</a>
					</p>
				</div>
			</div>
			<div class="txian">
				<p>
					账户余额：<i>￥0.00</i>
				</p>
				<a href="yinhang.html">提现</a>
			</div>
		</div>
		<div class="ico-mt">
			<ul>
				<li><i class="icon-wodedingdan"></i><a href="dingdan.html">我的订单</a></li>
				<li><i class="icon-gouwuche"></i><a href="no-gou.html">购物车</a></li>
				<li><i class="icon-yinxingqia"></i><a href="yinhang.html">**95595</a></li>
			</ul>
		</div>


		<div class="nav-muen">
			<ul>
				<li><a href="tijiao.html">社区分享<i class="icon-jiantou"></i></a></li>
				<li><a href="haibao.html">生成个人推广海报<i class="icon-jiantou"></i></a></li>
				<li><a href="#">互动积分<i class="icon-jiantou"></i></a></li>
				<li><a href="yue.html">月交易总基金<i class="icon-jiantou"></i></a></li>
				<li><a href="fenxiang.html">分享肖像奖励的基金<i
						class="icon-jiantou"></i></a></li>
				<li><a href="#">网红差额基金<i class="icon-jiantou"></i></a></li>
				<li><a href="#">年终基金 <i class="icon-jiantou"></i></a></li>
			</ul>
		</div>
	</div>
</body>
</html>
