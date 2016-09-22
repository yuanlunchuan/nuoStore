<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="/spring1/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<title>用户详情</title>
</head>
<body>
  <%@ include file="_header.jsp"%>
  <div class="container">
    <div class="row">
      <div class="col-md-6 col-md-offset-3">
		<div class="panel panel-primary">
		  <div class="panel-heading">
		    <h3 class="panel-title">用户详情</h3>
		  </div>
		  <div class="panel-body">
		    <table>
		      <tr><td>用户id</td><td>${user.id}</td></tr>
		      <tr><td>用户名</td><td>${user.userName}</td></tr>
		      <tr><td>年龄</td><td>${user.age}</td></tr>
		    </table>
		  </div>
		</div>
      </div>
    </div>
  </div>
</body>
<script type="text/javascript" src="/spring1/static/js/jquery.1.4.2-min.js"></script>
<script type="text/javascript" src="/spring1/static/js/bootstrap.min.js"></script>
</html>
