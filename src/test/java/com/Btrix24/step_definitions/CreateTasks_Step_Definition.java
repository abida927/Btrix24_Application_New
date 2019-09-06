package com.Btrix24.step_definitions;

import com.Btrix24.utilities.Pages;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class CreateTasks_Step_Definition {

    Pages pages= new Pages();
    @Then("create task on Activity Stream")
    public void create_task_on_Activity_Stream() {
        pages.activityStream().createTask();
    }



    @Then("create task with file on Activity Stream")
    public void create_task_with_file_on_Activity_Stream() throws IOException {

        pages.activityStream().createTaskWithFile();
    }

    @Then("create task with deadline on Activity Stream")
    public void create_task_with_deadline_on_Activity_Stream() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}