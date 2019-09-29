<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <style>
        .time1 {
            width: 100%;
            height: 50px;
            background: #FFF000;
            line-height: 50px;
            text-align: center;
        }
    </style>

</head>

<script language="javascript">

    var t = null;
    t = setTimeout(time, 1000);//开始执行
    function time() {
        clearTimeout(t);//清除定时器
        dt = new Date();
        var y = dt.getYear() + 1900;
        var mm = dt.getMonth() + 1;
        var d = dt.getDate();
        var weekday = ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"];
        var day = dt.getDay();
        var h = dt.getHours();
        var m = dt.getMinutes();
        var s = dt.getSeconds();
        if (h < 10) {
            h = "0" + h;
        }
        if (m < 10) {
            m = "0" + m;
        }
        if (s < 10) {
            s = "0" + s;
        }
        document.getElementById("timeShow").innerHTML = "现在的时间为：" + y + "年" + mm + "月" + d + "日" + weekday[day] + "" + h + ":" + m + ":" + s + "";
        t = setTimeout(time, 1000); //设定定时器，循环执行
    }
</script>

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

<div id="timeShow" class="time1"></div>

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
            <th>添加</th>
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
                    <a href="../../save.jsp">添加</a>
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
