<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<% String baseUrl = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="wispanh=device-wispanh, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>诺利康</title>
<link href="/spring1/static/css/master.css" rel="stylesheet" type="text/css">

</head>

<body>
	<div class="container">
		<div class="nav-header">
		<i><a href="<%=baseUrl %>/sites">&#xe602;</a></i>我的订单<em><a href="<%=baseUrl %>/profile">&#xe603;</a></em>
		</div>

		<div class="dan-menu">
			<ul>
				<li><a href="dingdan.html" class="dx">全部</a></li>
				<li><a href="fukuan.html">待付款</a></li>
				<li><a href="shouhuo.html">待收货</a></li>
				<li><a href="fahuo.html">待发货</a></li>
				<li><a href="yifukuan.html">已付款</a></li>
			</ul>
		</div>

		<div class="dingdt">
			<ul>
				<li>
					<div class="pic">
						<img src="/spring1/static/images/7.png" width="124" height="107" alt="" />
					</div>
					<div class="txt">
						<strong>柯氏发酵冬虫夏草胶囊2盒</strong>
						<p>
							<span>￥3380</span><i>X2</i>
						</p>
					</div>
					<div class="hez">
						<p>共1件商品 合计：￥6760(含运费￥0.00)</p>
						<a href="#" class="bk">确认收货</a>
					</div>
				</li>
				<li>
					<div class="pic">
						<img src="/spring1/static/images/7.png" width="124" height="107" alt="" />
					</div>
					<div class="txt">
						<strong>柯氏发酵冬虫夏草胶囊2盒</strong>
						<p>
							<span>￥3380</span><i>X2</i>
						</p>
					</div>
					<div class="hez">
						<p>共1件商品 合计：￥6760(含运费￥0.00)</p>
						<a href="#" class="bk">交易成功</a>
					</div>
				</li>
				<li>
					<div class="pic">
						<img src="/spring1/static/images/7.png" width="124" height="107" alt="" />
					</div>
					<div class="txt">
						<strong>柯氏发酵冬虫夏草胶囊2盒</strong>
						<p>
							<span>￥3380</span><i>X2</i>
						</p>
					</div>
					<div class="fukuan">
						<a href="#">立即付款</a>
					</div>
					<div class="hez">
						<p>共1件商品 合计：￥6760(含运费￥0.00)</p>
						<a href="#" class="bk">未付款</a>
					</div>
				</li>
				<li>
					<div class="pic">
						<img src="/spring1/static/images/7.png" width="124" height="107" alt="" />
					</div>
					<div class="txt">
						<strong>柯氏发酵冬虫夏草胶囊2盒</strong>
						<p>
							<span>￥3380</span><i>X2</i>
						</p>
					</div>
					<div class="hez">
						<p>共1件商品 合计：￥6760(含运费￥0.00)</p>
						<a href="#" class="bk">交易成功</a>
					</div>
				</li>
			</ul>
		</div>
	</div>

</body>
</html>
