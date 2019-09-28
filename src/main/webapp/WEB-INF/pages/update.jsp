<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<center>

    <h1>修改账户信息表单</h1>
    <form name="accountForm" action="${pageContext.request.contextPath}/detail/updateEntity" method="post">
        <table>
            <input type="hidden" value="${detail.id}" name="id"><br>
            号牌类型:<input type="text" value="${detail.numtype}" name="numtype"><br>
            号牌号码:<input type="text" value="${detail.num}" name="num"><br>
            收费类型:
            <select name="show">
                <c:forEach var="entity" items="${detail.list}">
                    <c:if test="${detail.pid == entity.payname}">
                        <option selected="selected">${entity.payname}</option>
                    </c:if>
                    <c:if test="${detail.pid != entity.payname}">
                        <option>
                                ${entity.payname}
                        </option>
                    </c:if>
                </c:forEach>
            </select><br>
            单位id:<input type="text" value="${detail.uid}" name="uid"><br>
            收费次数:<input type="text" value="${detail.paynum}" name="paynum"><br>
            金额:<input type="text" value="${detail.sum}" name="sum"><br>
            <input type="submit" value="保存"><br>
            <a href="/detail/findAll">点我查询页面...</a>
        </table>
    </form>
</center>
</body>
</html>
