<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>添加账户信息表单</h1>
    <form name="accountForm" action="${pageContext.request.contextPath}/detail/save" method="post">
        型号牌类:<input type="text" name="numtype"><br>
        号牌号码:<input type="text" name="num"><br>
        收费类型id:<input type="text" name="pid"><br>
        单位id:<input type="text" name="uid"><br>
        收费次数:<input type="text" name="paynum"><br>
        金额:<input type="text" name="sum"><br>
        <input type="submit" value="保存"><br>
        <a href="/detail/findAll">点我查询页面...</a>
    </form>
</body>
</html>
