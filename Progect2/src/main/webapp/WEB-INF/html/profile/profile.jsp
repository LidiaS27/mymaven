
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Profile page</h1>


<c:set value="${cookie.SESSIONID}" var="currentCookie"/>
    ${currentCookie.name}<br/>
    ${currentCookie.value}<br/>



<div>
    <a href="/com.mymaven">go to main</a>
</div>


</body>
</html>