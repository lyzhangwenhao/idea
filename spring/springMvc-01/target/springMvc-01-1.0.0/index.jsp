<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/7
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/hello">springMvc</a>
<br>
<a href="/pathVariable/admin/1001">PathVariable</a>

<%--Rest--%>
<%--查询--%>
<a href="/order/1001">get</a>
<%--删除--%>
<form action="/order/1001" method="post">
    <input hidden="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="删除">
</form>
<%--添加--%>
<form action="/order" method="post">
    <input type="submit" value="添加">
</form>
<%--修改--%>
<form action="/order" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="修改"/>
</form>

<%--RequestParam--%>
<a href="/requestParam?username=张三&&password=zhangsan">RequestParam</a>



</body>
</html>

