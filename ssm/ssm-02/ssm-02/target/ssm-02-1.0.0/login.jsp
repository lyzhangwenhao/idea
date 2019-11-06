<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/11
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" 
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7/css/bootstrap.css"/>
    <script type="text/javascript" src="bootstrap-3.3.7/js/jquery-1.11.3.min.js" ></script>
    <script type="text/javascript" src="bootstrap-3.3.7/js/bootstrap.min.js" ></script>
    <script type="text/javascript">
        $(function () {
            $("#login").click(function () {
                var username = $("#username").val();
                var password = $("#password").val();
                var remPwd = $("#remPwd").val();
                $.post("${pageContext.request.contextPath}/admin/adminLogin",{username:username,password:password,remPwd:remPwd},function (data) {
                    if (data==1){
                        location.href="${pageContext.request.contextPath}/admin/sendToBookPage";
                    }else if(data==0){
                        alert("你一个用户登后台干嘛？？？？？");
                    }else{
                        alert("账号或密码错了，重新输入....."+"错误代码："+data);
                    }
                })
            });
        })
    </script>
    <style>
        #divMain{
            width: 500px;
            margin: auto;
        }
        #username,#password{
            width: 300px;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div id="divMain">
    
        <form action="${pageContext.request.contextPath}/admin/adminLogin" method="post">
            <div class="form-group">
                <label>账号:</label>
                <input id="username" type="text" class="form-control" name="username" placeholder="请输入账号...">
            </div>
            
            <div class="form-group">
                <label>密码:</label>
                <input id="password" type="password" class="form-control" name="password" placeholder="请输入密码...">
            </div>
            <div class="checkbox">
                <label>
                    <input type="checkbox" name="remPwd" id="remPwd" value="yes"> 记住密码
                </label>
            </div>
            <button id="login" type="button" class="btn btn-default">登录</button>
        </form>
    </div>
</div>
</body>
</html>

