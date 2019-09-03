package com.Btrix24.pages.ActivitiesStream;

import com.Btrix24.utilities.BrowserUtils;
import com.Btrix24.utilities.ConfigurationReader;
import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStream extends Pages {

    public ActivityStream(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "[class='menu-item-link'][title='Tasks']")
    public WebElement tasksMenue;


    @FindBy(css = "[id='feed-add-post-form-tab-tasks']")
    public  WebElement taskElement;

    @FindBy(css = "[data-bx-id='task-edit-title']")
    public WebElement thingToDoInput;

    @FindBy(css = "[id='bx-html-editor-lifefeed_task_form']")
    public WebElement taskInputBox;

    @FindBy(css = "[id='blog-submit-button-save']")
    public WebElement sendBtn;



    public void sendTask(){

        taskElement.click();
        thingToDoInput.sendKeys(ConfigurationReader.getProperty("thingToDo"));
        taskInputBox.sendKeys(ConfigurationReader.getProperty("task"));
        sendBtn.click();
    }

}