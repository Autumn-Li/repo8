<html>
<body>
<h2>Hello World!</h2>
<button type="button" onclick="x()"style="background: red">查询...</button>
<<a href="save.jsp">点我跳转保存页面...</a>
</body>
<script>
    function x() {
        location.href="${pageContext.request.contextPath}/account/findAll/";
    }
</script>
</html>
