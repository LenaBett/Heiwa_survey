package com.heiwa.surveyapp.model.view.css;

import java.io.Serializable;

public class HeiwaCss implements Serializable {

    private String style = "<style>" +
            "{" +
                "margin: 0;" +
                "padding: 0;" +
                "box-sizing: border-box;" +
                "font-family: 'Poppins',sans-serif;" +
            "}" +

            "::selection{" +
                "color: #000;" +
                "background: #fff;" +
            "}" +

            "nav{" +
                "position: fixed;" +
                "background: #1b1b1b;" +
                "width: 100%;" +
                "padding: 10px 0;" +
                "z-index: 12;" +
                "}" +

            "nav .menu{" +
                "max-width: 1250px;" +
                "margin: auto;" +
                "display: flex;" +
                "align-items: center;" +
                "justify-content: space-between;" +
                "padding: 0 20px;" +
            "}" +

            ".menu .logo a{" +
                "text-decoration: none;" +
                "color: #fff;" +
                "font-size: 35px;" +
                "font-weight: 600;" +
            "}" +

            ".menu ul{" +
                "display: inline-flex;" +
            "}" +

            ".menu ul li{" +
                "list-style: none;" +
                "margin-left: 7px;" +
            "}" +

            ".menu ul li:first-child{" +
                "margin-left: 0px;" +
            "}" +

            ".menu ul li a{" +
                "text-decoration: none;" +
                "color: #fff;" +
                "font-size: 18px;" +
                "font-weight: 500;" +
                "padding: 8px 15px;" +
                "border-radius: 5px;" +
                "transition: all 0.3s ease;" +
            "}" +

            ".menu ul li a:hover{" +
                "background: #fff;" +
                "color: black;" +
            "}" +

            ".center{" +
                "position: absolute;" +
                "top: 52%;" +
                "left: 50%;" +
                "transform: translate(-50%, -50%);" +
                "width: 100%;" +
                "padding: 0 20px;" +
                "text-align: center;" +
            "}"+

            ".center .title{" +
                "color: #fff;" +
                "font-size: 55px;" +
                "font-weight: 600;" +
            "}" +

            ".center .sub_title{" +
                "color: #fff;" +
                "font-size: 52px;" +
                "font-weight: 600;" +
            "}" +

            ".center .btns{" +
                "margin-top: 20px;" +
            "}" +

            ".center .btns button{" +
                "height: 55px;" +
                "width: 170px;" +
                "border-radius: 5px;" +
                "border: none;" +
                "margin: 0 10px;" +
                "border: 2px solid white;" +
                "font-size: 20px;" +
                "font-weight: 500;" +
                "padding: 0 10px;" +
                "cursor: pointer;" +
                "outline: none;" +
                "transition: all 0.3s ease;" +
            "}" +

            ".center .btns button:first-child{" +
                "color: #fff;" +
                "background: none;" +
            "}" +

            ".btns button:first-child:hover{" +
                "background: white;" +
                "color: black;" +
            "}" +

            ".center .btns button:last-child{" +
                "background: white;" +
                "color: black;" +
            "}" +

    "</style>";

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}