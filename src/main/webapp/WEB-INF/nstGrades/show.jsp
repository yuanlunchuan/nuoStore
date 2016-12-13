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
<h1><center>这是一个NST评分页面</center></h1>
<div class="hidden" id="user-id" data-user-id="<%= request.getSession().getAttribute("uid")%>"></div>
<textarea rows="5" cols="100" id="message">12345</textarea><br/>
<button id="sendMessage">发送webSocket消息</button><br/>
webSocket接收到的消息：
<p id="webSocketMessage"></p><br>
<button id="startFetalMonitor">开始进行胎监数据</button>
</body>
<script type="text/javascript" src="<%=path%>/static/js/jquery.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/nstGrades/show.js"></script>
</html>
