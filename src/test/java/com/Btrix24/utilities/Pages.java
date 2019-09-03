package com.Btrix24.utilities;


import com.Btrix24.pages.ActivitiesStream.ActivityStream;
import com.Btrix24.pages.loginPage.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private ActivityStream activityStream;
//    private Modules modules;
//    private Tasks tasks;


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
//    public Modules modules() {
//        if (modules == null) {
//            modules = new Modules();
//        }
//        return modules;
//    }
//
//    public Tasks tasks() {
//        if (tasks == null) {
//            tasks = new Tasks();
//        }
//        return tasks;
//    }


}
