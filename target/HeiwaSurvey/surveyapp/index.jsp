<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../style/homepagecss.jsp">
            <jsp:param name="pageColor" value="#fff" />
        </jsp:include>

    </head>
    <header class="header">
    		<h1 class="logo"><a href="./home">${initParam.AppName} </a></h1>
    		<jsp:useBean id="htmlNavbar" class="com.heiwa.surveyapp.view.helper.HtmlNavbar" />
            <jsp:setProperty name="htmlNavbar" property="activeLink" value='${requestScope.activeMenu}' />
            ${htmlNavbar.menu}
    	</header>
    <body>
     ${requestScope.content}
    </body>
</html>