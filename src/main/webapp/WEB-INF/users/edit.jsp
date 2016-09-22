<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="/spring1/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<title>用户修改界面</title>
</head>
<body>
  <%@ include file="_header.jsp"%> 
  <div class="container">
    <div class="row" style="margin-top: 5%">
      <div class="col-md-12">
		<form class="form-horizontal" action="/spring1/users/${user.id}" method="post">
		  <fieldset>
		    <legend>修改用户</legend>
		    <div class="form-group">
		      <label class="col-md-2 control-label">用户名</label>
		      <div class="col-md-10">
		        <input class="form-control" placeholder="用户名" type="text" name="userName" value="${user.userName }">
		      </div>
		    </div>
		    <div class="form-group">
		      <label class="col-md-2 control-label">年龄</label>
		      <div class="col-md-10">
		        <input class="form-control" placeholder="年龄" type="text" name="age" value="${user.age}">
		      </div>
		    </div>
		    <div class="form-group">
		      <div class="col-md-2 col-md-offset-10">
		        <button type="submit" class="btn btn-primary">修改</button>
		      </div>
		    </div>
		  </fieldset>
		</form>
      </div>
    </div>
  </div>
</body>
<script type="text/javascript" src="/spring1/static/js/jquery.1.4.2-min.js"></script>
<script type="text/javascript" src="/spring1/static/js/bootstrap.min.js"></script>
</html>
