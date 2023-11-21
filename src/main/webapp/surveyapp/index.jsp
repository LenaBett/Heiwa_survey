<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="../style/landingpagecss.jsp">
            <jsp:param name="pageColor" value="#fff" />
        </jsp:include>

    </head>
    <header class="header">
    		<h1 class="logo"><a href="#">${initParam.AppName} </a></h1>
    		<jsp:useBean id="htmlNavbar" class="com.heiwa.surveyapp.view.helper.HtmlNavbar" />
            <jsp:setProperty name="htmlNavbar" property="activeLink" value='${requestScope.activeMenu}' />
            ${htmlNavbar.menu}
    	</header>
    <body>
    <div class="wrapper">
      <div class="image-div">
        <img src="https://images.pexels.com/photos/4403924/pexels-photo-4403924.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260" />
      </div>
      <div class="text-div">
        <p>Lorem ipsum dolor sit</p>
       <button> <a href="takeSurvey.jsp">Take survey</a></button>
      </div>
    </div>
     <div class="wrapper">
          <div class="text-div">
             <p>Lorem ipsum dolor sit</p>
             <button> <a href="takeSurvey.jsp">Take survey</a></button>
          </div>
          <div class="image-div">
            <img src="https://images.pexels.com/photos/4403924/pexels-photo-4403924.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260" />
          </div>
        </div>
    </body>
</html>