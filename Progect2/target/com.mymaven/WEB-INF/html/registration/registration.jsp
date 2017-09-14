
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
</head>
<body>
<h1>Registration page</h1>
<form method="post" action="registration" class="login">

    <p>
        <label for="mail">mail:</label>
        <input type="text" name="mail" id="mail" required placeholder = "FirstName">
    </p>

    <p>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required placeholder = "Password">
    </p>

    <p>
        <label for="login">Login:</label>
        <input type="text" name="login" id="login" required placeholder = "login">
    </p>

    <p>
        <label for="lastName">FirstName:</label>
        <input type="text" name="FirstName" required placeholder = "FirstName" id="FirstName"  >
        <label for="lastName">lastName:</label>
        <input type="text" name="lastName" id="lastName" value="lastName">
        <label for="age">Age:</label>
        <input type="text" name="age" id="age" value="age">
    </p>


    <div>
        <input type="submit">
    </div>

    <div>
        <a href="/com.mymaven">Go main page</a>
    </div>
</form>
</body>
</html>
