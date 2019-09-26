<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<script>
    function del(id) {
        if (confirm("您确定删除吗?")){
            location.href = "${pageContext.request.contextPath}/account/del/"+id;
        }
    }
</script>

<body>
<h1>展示账户数据列表</h1>
<table border="1">
    <tr>
        <th>账户id</th>
        <th>账户名称</th>
        <th>账户金额</th>
        <th>删除</th>
    </tr>

    <c:forEach items="${accountList}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
            <td class="text-center">
                <a href="javascript:void(0);" onclick="del(${account.id})">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
