<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nst评分界面</title>
</head>
<body>
<div class="hidden" id="user-id" data-user-id="<%= request.getSession().getAttribute("uid")%>"></div>
  这是一个NST评分页面
</body>
<script type="text/javascript" src="<%=path%>/static/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/nstGrades/show.js"></script>
</html>
