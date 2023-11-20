package com.heiwa.surveyapp.view.helper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class HtmlNavbar implements HtmlMenu, Serializable {

    private String menu;

    private int activeLink;

    private final List<MenuLink> links = new ArrayList<>();

    {
        links.add(new MenuLink("./home", "Home", MenuLinkStatus.ACTIVE));
        links.add(new MenuLink("./createSurvey", "Create Survey", MenuLinkStatus.ACTIVE));
        links.add(new MenuLink("./takeSurvey", "Take Survey", MenuLinkStatus.ACTIVE));
        links.add(new MenuLink("./results", "View Results", MenuLinkStatus.ACTIVE));
        links.add(new MenuLink("./logout", "Logout", MenuLinkStatus.ACTIVE));
    }

    public String getMenu() {

        this.activateLink(getActiveLink());

        String menuBar = "<ul class=\"main-nav\">";

        for (MenuLink link : links)
            menuBar += "<a " + (link.getStatus() == MenuLinkStatus.ACTIVE? "class=\"active\"" : "")
                    + " href=\"" + link.getUrl() + "\">" + link.getLabel() + "</a>";

        menuBar += "</div>";

        return menuBar;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getActiveLink() {
        return activeLink;
    }

    public void setActiveLink(int activeLink) {
        this.activeLink = activeLink;
    }

    private void activateLink(int linkIndex){
        for (int index = 0; index < links.size(); index++){
            if (index == linkIndex)
                links.get(index).setStatus(MenuLinkStatus.ACTIVE);
            else
                links.get(index).setStatus(MenuLinkStatus.NOT_ACTIVE);
        }

    }

    @Override
    public String menu(int activeLinkIndex) {
        return null;
    }
}
