<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="/spring1/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/spring1/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/spring1/static/js/jquery.1.4.2-min.js"></script>
<title>新增用户</title>
</head>
<body>
  <%@ include file="_header.jsp"%> 
  <div class="container">
    <div class="row" style="margin-top: 5%">
      <div class="col-md-12">
		<form class="form-horizontal" action="/spring1/users/create" method="post">
		  <fieldset>
		    <legend>新增用户</legend>
		    <div class="form-group">
		      <label class="col-md-2 control-label">用户名</label>
		      <div class="col-md-10">
		        <input class="form-control" placeholder="用户名" type="text" name="userName">
		      </div>
		    </div>
		    <div class="form-group">
		      <label class="col-md-2 control-label">年龄</label>
		      <div class="col-md-10">
		        <input class="form-control" placeholder="年龄" type="text" name="age">
		      </div>
		    </div>
		    <div class="form-group">
		      <label class="col-md-2 control-label">密码</label>
		      <div class="col-md-10">
		        <input class="form-control" placeholder="密码" type="password" name="password">
		      </div>
		    </div>
		    <div class="form-group">
		      <label class="col-md-2 control-label">确认密码</label>
		      <div class="col-md-10">
		        <input class="form-control" placeholder="确认密码" type="password" name="rePassword">
		      </div>
		    </div>
		    <div class="form-group">
		      <div class="col-md-2 col-md-offset-10">
		        <button type="submit" class="btn btn-primary">新增</button>
		      </div>
		    </div>
		  </fieldset>
		</form>
      </div>
    </div>
  </div>
</body>
</html>
