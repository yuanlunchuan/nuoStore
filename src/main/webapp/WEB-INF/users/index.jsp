<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
<link href="/spring1/static/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/spring1/static/css/jquery-ui.min.css" rel="stylesheet" type="text/css">
</head>
<body>
  <%@ include file="_header.jsp"%>
  <div class="container">
    <div class="row">
      <div class="col-md-12">
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
                <td><a href="/spring1/users/${user.id}">${user.userName}</a></td>
                <td>${user.age }</td>
                <td>
                  <a href="/spring1/users/${user.id}/edit">编辑</a>/
                  <a href="/spring1/users/${user.id}" data-method="DELETE" class="rest">删除</a>
                </td>
              </tr>
            </c:forEach>
		  </tbody>
		</table>
		<ul class="pagination">
		  <li class="disabled"><a href="#">&laquo;</a></li>
		  <li class="active"><a href="#">1</a></li>
		  <li><a href="#">2</a></li>
		  <li><a href="#">3</a></li>
		  <li><a href="#">4</a></li>
		  <li><a href="#">5</a></li>
		  <li><a href="#">&raquo;</a></li>
		</ul>
      </div>
    </div>
  </div>
</body>
<script type="text/javascript" src="/spring1/static/js/jquery.1.4.2-min.js"></script>
<script type="text/javascript" src="/spring1/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/spring1/static/js/jquery-ui.min.js"></script>
<script type="text/javascript" src="/spring1/static/js/jquery.restfulizer.js"></script>
<script type="text/javascript" src="/spring1/static/js/user-index.js"></script>
</html>
