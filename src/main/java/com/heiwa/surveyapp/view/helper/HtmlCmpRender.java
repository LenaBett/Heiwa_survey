package com.heiwa.surveyapp.view.helper;

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

public class HtmlCmpRender implements Serializable {
    public static String table(List<?> dataList, Class<?> dataClass) {

        if (!dataClass.isAnnotationPresent(HtmlTable.class))
            return StringUtils.EMPTY;

        HtmlTable htmlTable = dataClass.getAnnotation(HtmlTable.class);

        StringBuilder trBuilder = new StringBuilder();
        trBuilder.append("<a class=\"linkBtn\" href=\"")
                .append(htmlTable.addUrl()).append("\" target=\"_blank\">Add</a><br/>")
                .append("<table><tr>");

        Field[] fields = dataClass.getDeclaredFields();

        for (Field field : fields) {
            if (!field.isAnnotationPresent(HtmlTableColHeader.class))
                continue;

            trBuilder.append("<th>")
                    .append(field.getAnnotation(HtmlTableColHeader.class).header())
                    .append("</th>");
        }

        trBuilder.append("</tr>");

        if (dataList != null && !dataList.isEmpty()){

            for (Object data : dataList) {

                trBuilder.append("<tr>");
                for (Field field : fields) {
                    if (!field.isAnnotationPresent(HtmlTableColHeader.class))
                        continue;

                    try {
                        field.setAccessible(true);
                        trBuilder.append("<td>").append(field.get(data)).append("</td>");

                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);

                    }
                }

                trBuilder.append("<tr>");

            }
        }

        trBuilder.append("</table>");

        return trBuilder.toString();

    }

    public static String form(Class<?> model){

        HtmlForm htmlFormMarker = null;
        if (model.isAnnotationPresent(HtmlForm.class))
            htmlFormMarker = model.getAnnotation(HtmlForm.class);

        if (htmlFormMarker == null)
            return StringUtils.EMPTY;

        StringBuilder htmlForm = new StringBuilder("<br/><h3>Add " + htmlFormMarker.label() + "</h3><br/>" +
                "<form action=\"" + htmlFormMarker.url() + "\" method=\"" + htmlFormMarker.httpMethod() + "\">" +
                "<div class=\"container\">");

        Field [] fields = model.getDeclaredFields();

        for (Field field : fields) {
            if (!field.isAnnotationPresent(HtmlFormField.class))
                continue;

            HtmlFormField formField = field.getAnnotation(HtmlFormField.class);

            String fieldName = field.getName();

            htmlForm
                    .append("<label for=\"").append(ifBlank(formField.labelFor(), fieldName)).append("\">")
                    .append(ifBlank(formField.label(),fieldName))
                    .append(":</label><br>");

            htmlForm.append("<input type=\"text\" id=\"").append(ifBlank(formField.id(),fieldName))
                    .append("\" name=\"").append(ifBlank(formField.name(),fieldName))
                    .append("\" ><br>");

        }

        htmlForm.append("<button type=\"submit\">Submit</button>");
        htmlForm.append("</div>" + "</form>" + "<br/>");

        return htmlForm.toString();

    }

    private static String ifBlank(String target, String alternative){
        return StringUtils.isBlank(target)? alternative : StringUtils.trimToEmpty(target);
    }

    public static String card(Class<?> modelCard) {
        HtmlCard htmlCardMaker = null;
        if (modelCard.isAnnotationPresent(HtmlCard.class))
            htmlCardMaker = modelCard.getAnnotation(HtmlCard.class);

        if (htmlCardMaker == null)
            return StringUtils.EMPTY;

        StringBuilder htmlCards = new StringBuilder();


        for (Field field : modelCard.getDeclaredFields()) {

            HtmlCardContent htmlCardContent = field.getAnnotation(HtmlCardContent.class);

            if (htmlCardContent != null) {
                String title = htmlCardContent.title();

                htmlCards.append("<div class=\"card\" action=\"")
                        .append(htmlCardMaker.viewUrl())
                        .append("\" method=\"")
                        .append(htmlCardMaker.httpMethod())
                        .append("\">")
                        .append("  <div class=\"custom-card-body\">")
                        .append("    <div class=\"content-container\">")
                        .append("       <h2 class=\"card-title\">").append(htmlCardContent.title()).append("</h2>")
                        .append("       <p class=\"card-text\">").append(htmlCardContent.title()).append("</p>\n")
                        .append("     </div>")
                        .append("     <div class=\"button-container\">")
                        .append("        <a href=\"./takeSurvey\" class=\"btn btn-primary\">Take Survey</a>")
                        .append("     </div>\n")
                        .append("  </div>\n")
                        .append("</div>\n");

            }
        }

        return htmlCards.toString();
    }

    public static String paragraph(Class<?> dataClass) {
        if (!dataClass.isAnnotationPresent(Title.class))
            return StringUtils.EMPTY;

        Title title= dataClass.getAnnotation(Title.class);

        StringBuilder trBuilder = new StringBuilder("<p>" + title.pageTitle() + "</p>");

       return trBuilder.toString();
    }


}
