<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
<link href="/spring1/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="/spring1/static/js/jquery.1.4.2-min.js"></script>
<script type="text/javascript" src="/spring1/static/js/bootstrap.min.js"></script>
</head>
<body>
  <%@ include file="_header.jsp"%>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
        <div class="alert alert-dismissible alert-success">
          <button type="button" class="close" data-dismiss="alert">&times;</button>${userName}创建成功
        </div>
		<table class="table table-striped table-hover ">
		  <thead>
		    <tr>
		      <th>用户id</th>
		      <th>用户名</th>
		      <th>年龄</th>
		      <th>操作</th>
		    </tr>
		  </thead>
		  <tbody>
		    <c:forEach var="user" items="${users}">
              <tr>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.age }</td>
                <td><a href="">编辑</a>/<a href="">删除</a></td>
              </tr>
            </c:forEach>
		  </tbody>
		</table>
      </div>
    </div>
  </div>
</body>
</html>
