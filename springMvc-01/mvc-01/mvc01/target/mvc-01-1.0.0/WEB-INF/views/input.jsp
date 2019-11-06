<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/9
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7/css/bootstrap.css"/>
    <script src="Jquery/jquery-1.11.3.min.js"></script>
    <script src="bootstrap-3.3.7/js/bootstrap.js"></script>

    <script>
        $(function () {
            $(".form-group").css("width","250px");
        })
    </script>
</head>
<body>
    <form:form action="${pageContext.request.contextPath}/emp" method="post">
        <div class="container">
            <div class="form-group">
                <label>Employee Name</label>
                <form:input path="empName" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label>Employee Gender</label>
                <form:input path="empGender" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label>Employee Age</label>
                <form:input path="empAge" cssClass="form-control"/>
            </div>
            <div class="form-group">
                <label>Employee Dept</label>
                <form:input path="deptId" cssClass="form-control"/>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </div>

    </form:form>
</body>
</html>
