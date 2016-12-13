<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>胎心仪数据</title>
</head>
<body>
用户id：<input type="text" id="uid"><br>
胎心数据：<textarea rows="5" cols="20" id="monitorMessage"></textarea><br>
<button id="sendButton">发送</button>
</body>
<script type="text/javascript" src="<%=path%>/static/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/monitor/newPage.js"></script>
</html>
