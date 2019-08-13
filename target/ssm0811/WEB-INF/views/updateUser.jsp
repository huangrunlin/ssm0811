<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019\8\12 0012
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改用户信息</h1>
<form action="${pageContext.request.contextPath}/user/getAllUser" method="post" name="userForm">
    <input value="${user.id}" name="id" type="hidden"/>
    name:<input type="text" name="name" value="${user.name}"><br>
    mark:<input type="text" name="mark" value="${user.mark}"><br>
    <input type="submit" value="确认修改" onclick="updateUser()"> </input>
</form>

</body>
</html>

<script>
    alert(${user.id});
    function updateUser(){
        var form = document.forms[0];
        form.action = "<%=basePath%>user/updateUser";
        form.method = "post";
        form.submit();
    }
</script>

