package com.heiwa.surveyapp.action;

import com.heiwa.surveyapp.model.Survey;
import com.heiwa.surveyapp.view.helper.HtmlCmpRender;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

public class BaseAction extends HttpServlet {

    @SuppressWarnings("unchecked")
    public <T> T serializeForm(Class<?> clazz, Map<String, ?> requestMap) {

        T clazzInstance;

        try {
            clazzInstance = (T) clazz.getDeclaredConstructor().newInstance();

            BeanUtils.populate(clazzInstance, requestMap);

        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e ) {
            throw new RuntimeException(e);
        }

        return clazzInstance;
    }

    public void renderPage(HttpServletRequest request, HttpServletResponse response, int activeMenu,
                           Class<?> entity, List<?> entityList)
            throws ServletException, IOException {

        request.setAttribute("activeMenu", activeMenu);

        request.setAttribute("content", HtmlCmpRender.paragraph(entity));


//       if (StringUtils.trimToEmpty(request.getParameter("action")).equals("add"))
//            request.setAttribute("content", HtmlCmpRender.form(entity));
//        else
//            request.setAttribute("content", HtmlCmpRender.table(entityList, Survey.class));



      RequestDispatcher dispatcher = request.getRequestDispatcher("./surveyapp/index.jsp");
       dispatcher.forward(request, response);
    }
}
