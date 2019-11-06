<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/11
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../bootstrap-3.3.7/css/bootstrap.css"/>
    <script type="text/javascript" src="../../bootstrap-3.3.7/js/jquery-1.11.3.min.js" ></script>
    <script type="text/javascript" src="../../bootstrap-3.3.7/js/bootstrap.min.js" ></script>
    <script type="text/javascript">
        $(function () {
            $(".btn-group").click(function () {
                //$(".tr"+$(this).attr("name")).empty();
                var flag = confirm("确定删除？");
                if(flag){
                    var bookId = $(this).attr("name");
                    $.post("${pageContext.request.contextPath}/admin/del",{bookId:bookId},function (data) {
                        if(data==1){
                            //$(".tr"+bookId).empty();
                            location.href="${pageContext.request.contextPath}/admin/sendToBookPage";
                        }else {
                            alert("删除失败，请刷新页面重试...")
                        }

                    })
                }
            });

        })
    </script>
    <style>
        .btn-group{
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="container">

    <div class="row">
        <%--管理员：--%>
        <div class="col-md-12">
            <h1 style="color: blue">管理员：${sessionScope.loginAdmin}</h1>
        </div>
        <%--新增和删除按钮--%>
        <div class="col-md-2 col-md-offset-10">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/admin/toAdd"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 新增</a>
            <button class="btn btn-danger"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span> 删除(x)</button>
        </div>
        <div class="col-md-12">
            <hr>
        </div>
        <%--数据显示--%>
        <div class="col-md-12">
            <table id="table" class="table table-hover table-striped"
                            style="height: ${(requestScope.pageInfo.pageSize+1) * 38}px;">
                <tr style="height: 38px;">
                    <%--<th>序号</th>--%>
                    <th>序号</th>
                    <th>书名</th>
                    <th>价格</th>
                    <th>描述</th>
                    <th>类别</th>
                    <th>库存</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${requestScope.pageInfo.list}" var="book" varStatus="num">
                    ${pageContext.setAttribute("trNum",num.count)}
                    <tr class="tr${book.bookId}">
                        <td>${num.count}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookPrice}</td>
                        <td>${book.bookDesc}</td>
                        <td>${book.categoryEntity.categoryName}</td>
                        <td>${book.stockEntity.bookStock}</td>
                        <td>
                            <a class="btn-group"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑(×) |</a>
                            <a class="btn-group" name="${book.bookId}"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除</a>
                        </td>
                    </tr>
                </c:forEach>
                <c:forEach begin="1" end="${requestScope.pageInfo.pageSize - trNum}">
                    <tr style="height: 38px;"></tr>
                </c:forEach>
            </table>
        </div>
        <%--分页信息--%>
        <div class="col-md-12">
            <nav aria-label="Page navigation" style="text-align: center">
                <ul class="pagination">
                    <%--上一页--%>
                    <c:if test="${requestScope.pageInfo.hasPreviousPage}">
                        <li>
                            <a href="${requestScope.request.contextPath}/admin/sendToBookPage?pageNumber=${requestScope.pageInfo.pageNum-1}">
                                <span aria-hidden="true">上一页</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${!requestScope.pageInfo.hasPreviousPage}">
                        <li class="disabled">
                            <a>
                                <span aria-hidden="true">上一页</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${!requestScope.pageInfo.isFirstPage}">

                    </c:if>

                    <%--页码数--%>
                    <c:forEach items="${requestScope.pageInfo.navigatepageNums}" var="page_num">
                        <c:if test="${page_num == requestScope.pageInfo.pageNum}">
                            <li class="active" disabled="disabled"><a href="${pageContext.request.contextPath}/admin/sendToBookPage?pageNumber=${page_num}">${page_num}</a></li>
                        </c:if>
                        <c:if test="${page_num != requestScope.pageInfo.pageNum}">
                            <li><a href="${pageContext.request.contextPath}/admin/sendToBookPage?pageNumber=${page_num}">${page_num}</a></li>
                        </c:if>
                        </c:forEach>
                    <%--下一页--%>
                    <c:if test="${requestScope.pageInfo.hasNextPage}">
                        <li>
                            <a href="${requestScope.request.contextPath}/admin/sendToBookPage?pageNumber=${requestScope.pageInfo.pageNum+1}">
                                <span aria-hidden="true">下一页</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${!requestScope.pageInfo.hasNextPage}">
                        <li class="disabled">
                            <a>
                                <span aria-hidden="true">下一页</span>
                            </a>
                        </li>
                    </c:if>

                </ul>
            </nav>
        </div>
    </div>

</div>
</body>
</html>

