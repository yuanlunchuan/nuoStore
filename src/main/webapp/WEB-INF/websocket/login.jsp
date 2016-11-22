<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>WebSocket示例</title>
<script type="text/javascript" src="<%=path%>/static/js/jquery.js"></script>
</head>
<body>
  <form action="/spring1/msg/login" method="POST">
  <input type="hidden" name="CSRFToken" value="${csrf}" />
    用户名: <select name="id">
      <option value="1">张三</option>
      <option value="2">李四</option>
    </select><br> 姓名: <input name="name" type="text" value="123456">
    <br>
    密码: <input name="password" type="text" value="123456">
    <input type="submit" value="登录">
  </form>
</body>

</html>
