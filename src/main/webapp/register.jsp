<%@ page isELIgnored ="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
<jsp:include page="./style/registercss.jsp">
    <jsp:param name="pageColor" value="#04AA6D;" />
</jsp:include>
</style>
<head>
    <title>Heiwa Login</title>
</head>
<body>

    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form action="./user" method="post">

        <h3>Heiwa Survey</h3>

        <h4>Register </h4>

        <label for="username">Username</label>
        <input type="text" placeholder="Enter Username" name="username" id="username" required>

        <label for="password">Password</label>
        <input type="password" placeholder="Enter Password" name="password" id="password" required>

         <label for="confirm password">Confirm Password</label>
         <input type="password" placeholder="Confirm Password" name="confirmPassword" id="confirmPassword"required>

        <button type="submit">Register</button>

        <span style="font-weight:bold;font-size:14px;color:#424242;">Already registered? <a href="index.jsp">Login</a></span>

    </form>
</body>
</html>