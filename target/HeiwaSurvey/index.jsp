<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
<jsp:include page="./style/style.jsp">
    <jsp:param name="pageColor" value="#04AA6D;" />
</jsp:include>
</style>
</head>
<body>
    <h1>${initParam.AppName}</h1>
    <c:set var="pageLink" scope="application" value="Home/<a href='index.jsp'>Login</a>/Register" />
    <c:choose>
        <c:when test='${sessionScope.loggedInId ne null}' >
            <c:redirect url="./home" />
        </c:when>
        <c:otherwise>
            <span style="font-weight:bold;font-size:15px;">Welcome</span>
            <form action="./login" method="post">
                <div class="login-form">

                    <jsp:useBean id="loginForm" class="com.heiwa.surveyapp.userbean.LoginForm" scope="page"/>
                     Time to Login ${loginForm.timeToLogin}

                     <span style="font-weight:bold;font-size:15px;text-align:left;color:green;">Sign in</span>

                    <div class="input-field">
                      <input type="text" placeholder="${loginForm.usernamePlaceHolder}" name="username" required>
                    </div>
                    <div class="input-field">
                      <input type="password" placeholder="${loginForm.passwordPlaceHolder}" name="password" required>
                    </div>

                    <span class="psw">Forgot <a href="#">password?</a></span>

                    <div class="action">

                        <button type="submit">Login</button>
                    </div>

                    <span style="font-weight:bold;font-size:14px;color:green;">Not Registered? <a href="register.jsp">Register</a></span>

                </div>
            </form>


        </c:otherwise>
    </c:choose>
</body>
</html>
