<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="resources/jquery-3.5.1.min.js"></script>
    <script>
        $(document).ready(function () {
            //jQuery 는 여기에..
        })
    </script>
</head>
<body>
<c:forEach var="lineVO" items="${lineList}">
    ${lineVO.toString()}
</c:forEach>
</body>
</html>