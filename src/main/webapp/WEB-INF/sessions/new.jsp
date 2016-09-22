<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="/spring1/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<title>用户登录</title>
</head>
<body>
  <div class="container">
    <div class="row" style="margin-top: 10%;">
      <div class="col-md-6 col-md-offset-3">
		<div class="panel panel-primary">
		  <div class="panel-heading">
		    <h3 class="panel-title">管理员登录</h3>
		  </div>
		  <div class="panel-body">
		    <form action="/spring1/sessions/" method="post" class="form-horizontal">
		      <div class="form-group">
		        <label class="col-md-2 control-label">用户名</label>
		        <div class="col-md-10">
		          <input class="form-control" type="text" name="userName">
		        </div>
		      </div>
		      <div class="form-group">
		        <label class="col-md-2 control-label">密码</label>
		        <div class="col-md-10">
		          <input type="password" name="password" class="form-control">
		        </div>
		      </div>
		      <div class="form-group">
		        <div class="col-md-2 col-md-offset-10">
		          <button type="submit" class="btn btn-primary">登录</button>
		        </div>
		      </div>
		    </form>
		  </div>
		</div>
      </div>
    </div>
  </div>
</body>
<script type="text/javascript" src="/spring1/static/js/jquery.1.4.2-min.js"></script>
<script type="text/javascript" src="/spring1/static/js/bootstrap.min.js"></script>
</html>