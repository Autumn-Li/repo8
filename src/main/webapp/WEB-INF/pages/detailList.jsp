<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<script>
    <%--删除--%>
    function del(id) {
        if (confirm("您确定删除吗?")) {
            location.href = "${pageContext.request.contextPath}/detail/del/" + id;
        }
    }
    function update(id) {
        location.href = "${pageContext.request.contextPath}/detail/update/" + id;
    }
</script>

<body>
<center>
    <h1>展示收费明细数据列表</h1>
    <table border="1">
        <tr>
            <th>收费明细id</th>
            <th>号牌类型</th>
            <th>号牌号码</th>
            <th>收费类型id</th>
            <th>单位id</th>
            <th>收费次数</th>
            <th>金额</th>
            <th>修改</th>
            <th>删除</th>
        </tr>

        <c:forEach items="${detailList}" var="detail">
            <tr>
                <td>${detail.id}</td>
                <td>${detail.numtype}</td>
                <td>${detail.num}</td>
                <td>${detail.pid}</td>
                <td>${detail.uid}</td>
                <td>${detail.paynum}</td>
                <td>${detail.sum}</td>
                <td class="text-center">
                    <a href="javascript:void(0);" onclick="update(${detail.id})">修改</a>
                </td>
                <td class="text-center">
                    <a href="javascript:void(0);" onclick="del(${detail.id})">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
