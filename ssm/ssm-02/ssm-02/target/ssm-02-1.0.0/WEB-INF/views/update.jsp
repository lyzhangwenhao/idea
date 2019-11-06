<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/12
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap-3.3.7/css/bootstrap.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap-3.3.7/js/jquery-1.11.3.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap-3.3.7/js/bootstrap.min.js" ></script>

</head>
<body>
    <div class="container" style="width:260px;">
        <h1 style="color: blue" align="center">添加Book</h1>
        <hr>
        <form:form action="${requestScope.request.contextPath}/admin/add" method="post">

            书名：<form:input path="bookName" cssClass="form-control"/>
            <br>
            价格：<form:input path="bookPrice" cssClass="form-control"/>
            <br>
            描述：<form:textarea path="bookDesc" cssClass="form-control"/>
            <br>
            类别：<form:select path="categoryEntity.categoryId" items="${requestScope.categoryList}"
                         itemLabel="categoryName" itemValue="categoryId"   cssClass="form-control"/>
            <br>
            库存：<form:input path="stockEntity.bookStock" cssClass="form-control"/>
            <br>
            <input class="btn btn-primary" type="submit" value="添加">
            <br>
        </form:form>
    </div>
</body>
</html>
