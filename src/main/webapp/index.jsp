<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
<jsp:include page="./style/logincss.jsp">
    <jsp:param name="pageColor" value="#04AA6D;" />
</jsp:include>
</style>
<head>
    <title>Heiwa Login</title>
</head>
<body>
    <c:set var="pageLink" scope="application" value="Home/<a href='login.jsp'>Login</a>Register" />
    <c:choose>
        <c:when test='${sessionScope.loggedInId ne null}'>
            <c:redirect url="./login" />
        </c:when>
        <c:otherwise>

            <div class="background">
                <div class="shape"></div>
                <div class="shape"></div>
            </div>
            <form action="./login" method="post">
                <jsp:useBean id="loginForm" class="com.heiwa.surveyapp.userbean.LoginForm" scope="page"/>
                <h3>Heiwa Survey</h3>

                <h4>Login Here</h4>

                <label for="username">Username</label>
                <input type="text" placeholder="${loginForm.usernamePlaceHolder}" name="username" required>

                <label for="password">Password</label>
                <input type="password" placeholder="${loginForm.passwordPlaceHolder}" name="password" required>

                <span class="psw">Forgot <a href="#">password?</a></span>

                <button type="submit">Log In</button>

                <span style="font-weight:bold;font-size:14px;color:white;">Not Registered? <a href="register.jsp">Register</a></span>

            </form>
        </c:otherwise>
    </c:choose>
</body>
</html>