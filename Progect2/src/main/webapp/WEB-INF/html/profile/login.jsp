
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="login" class="login">
<p>
    <label for="login">Login:</label>
    <input type="text" name="login" id="login" required placeholder = "login">
</p>

<p>
    <label for="password">Password:</label>
    <input type="password" name="password" id="password" required placeholder = "password">
</p>


<div>
    <input type="submit">
    <a href="/forgot_pass">Forgot password</a>
</div>


</form>
</body>
</html>
