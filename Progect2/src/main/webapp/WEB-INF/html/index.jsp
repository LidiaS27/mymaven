<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
    <h1>Welcome to main page</h1>
    <body>
    <form method="post" action="" class="login">

        <div>
            <a href="login">login</a>
        </div>

        <%
            String userName = null;
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("SESSIONID"))
                        userName = cookie.getValue();
                }
            }
            //out.print(userName);
            if (userName != null){
                response.sendRedirect("login");

            }
        %>





        <div>
            <a href="registration">Registration</a>
        </div>

        <div>
            <a href="top">Top users</a>
        </div>


    </form>
    </body>

</html>