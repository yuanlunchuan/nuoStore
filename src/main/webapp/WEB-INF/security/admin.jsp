<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
    <h1>标题 : ${title}</h1>
    <h1>消息 : ${message}</h1>

    <c:url value="/j_spring_security_logout"  var="logoutUrl" />

    <!-- csrt for log out-->
    <form action="${logoutUrl}" method="post" id="logoutForm">
      <input type="hidden"  name="${_csrf.parameterName}" value="${_csrf.token}" />
    </form>
    
    <script>
        function formSubmit() {
            document.getElementById("logoutForm").submit();
        }
    </script>

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <h2>
            欢迎 : ${pageContext.request.userPrincipal.name} 登录本系统 | <a
                href="javascript:formSubmit()"> 注销</a>
        </h2>
    </c:if>

</body>
</html>