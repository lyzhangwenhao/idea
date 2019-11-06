<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/9
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="bootstrap-3.3.7/css/bootstrap.css"/>
    <script src="Jquery/jquery-1.11.3.min.js"></script>
    <script src="bootstrap-3.3.7/js/bootstrap.js"></script>

    <script type="text/javascript">
        $(function(){

            //给删除的<a>动态绑定事件
            $(".del").click(function(){
                //确认是否要删除
                var flag = window.confirm("是否要删除?");
                if(!flag){
                    return false ;
                }

                //this :当前点击的dom对象
                //获取点击的超连接的href的值
                var href = $(this).attr("href");
                //将href的值设置到表单的action上，并提交
                $("form").attr("action",href).submit();

                //取消<a>的默认行为
                return false;

            });
        });


    </script>
</head>
<body>

    <div class="container">
        <table class="table table-hover">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Age</th>
                <th>Dept</th>
                <th>Operation</th>
            </tr>

            <c:forEach items="${requestScope.empList}" var="emp">
                <tr>
                    <td>${emp.empId}</td>
                    <td>${emp.empName}</td>
                    <td>${emp.empGender}</td>
                    <td>${emp.empAge}</td>
                    <td>${emp.deptId}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/emp/${emp.empId}">Edit</a> |

                        <a class="del" href="${pageContext.request.contextPath}/emp/${emp.empId}">Delete</a>

                        <%--删除按钮需要提交的表单--%>
                        <form action="" method="post">
                            <input type="hidden" name="_method" value="delete">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <h1 align="center"><a href="${pageContext.request.contextPath}/emp">Add Employee</a></h1>
    </div>

</body>
</html>
