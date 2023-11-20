<%@ page isELIgnored="false" %>
<%@ page import="com.heiwa.surveyapp.view.helper.HtmlMenuToolbar" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../style/style.jsp">
            <jsp:param name="pageColor" value="#fff" />
        </jsp:include>
    </head>

    <body>
        <h3 style="font-size:2em;color:#fff"> ${initParam.AppName} | User: ${sessionScope.username} </h3><br/>
        <jsp:useBean id="htmlMenuToolBar" class="com.heiwa.surveyapp.view.helper.HtmlMenuToolbar" />
        <jsp:setProperty name="htmlMenuToolBar" property="activeLink" value='${requestScope.activeMenu}' />
        ${htmlMenuToolBar.menu}

        ${requestScope.content}
    </body>
</html>