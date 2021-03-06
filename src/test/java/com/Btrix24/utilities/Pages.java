package com.Btrix24.utilities;


import com.Btrix24.pages.ActivitiesStream.ActivityStream;
import com.Btrix24.pages.homepage.HomePage;
import com.Btrix24.pages.loginPage.LoginPage;
import com.Btrix24.pages.sidemodule.SideModule;

public class Pages {
    private LoginPage loginPage;
    private ActivityStream activityStream;
    private SideModule modules;
    private HomePage homePage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


    public ActivityStream activityStream() {
        if (activityStream == null) {
            activityStream = new ActivityStream();
        }
        return activityStream;
    }
//
//
//
//
//
    public SideModule modules() {
        if (modules == null) {
            modules = new SideModule();
        }
        return modules;
    }

    public HomePage homePage() {
        if (homePage() == null) {
            homePage = new HomePage();
        }
        return homePage();
    }


}
