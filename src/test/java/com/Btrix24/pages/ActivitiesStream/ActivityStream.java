package com.Btrix24.pages.ActivitiesStream;

import com.Btrix24.utilities.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.io.IOException;

public class ActivityStream extends BasePage {

    WebDriver driver = Driver.getDriver();
    //Action action = new Action(driver);

    public ActivityStream() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class='menu-item-link'][title='Tasks']")
    public WebElement tasksMenue;


    @FindBy(css = "[id='feed-add-post-form-tab-tasks']")
    public WebElement taskElement;

    @FindBy(xpath = "//div[@class='task-info-panel']//input[@placeholder='Things to do']")
    public WebElement thingToDoInput;

    // @FindBy(css = "body[contenteditable='true'][style='min-height: 84px;']")
    @FindBy(id = "bx-html-editor-area-cnt-lifefeed_task_form")
    public WebElement taskInputBox;

    @FindBy(css = "[id='blog-submit-button-save']")
    public WebElement sendBtn;

    @FindBy(css = "span[class='popup-window-button']")
    public WebElement veiwTaskBtn;

    @FindBy(css = "span[id='pagetitle']2")
    public WebElement taskPagetitle;

    @FindBy(css = "iframe[class='bx-editor-iframe']")
    public WebElement newTaskiframe;


    @FindBy(id = "bx-b-uploadfile-task-form-lifefeed_task_form")////
    public WebElement uploadBtn;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFileBtn;


    public void createTask() {

        taskElement.click();
        BrowserUtils.waitForVisibility(thingToDoInput, 5);
        thingToDoInput.sendKeys(ConfigurationReader.getProperty("thingToDo"));
        BrowserUtils.waitForFrameAndSwitchToIt(newTaskiframe);
        driver.switchTo().frame(newTaskiframe);
        taskInputBox.sendKeys(ConfigurationReader.getProperty("task"));
        driver.switchTo().defaultContent();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForClickablility(sendBtn, 3);
        sendBtn.click();
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForVisibility(veiwTaskBtn, 3);
        veiwTaskBtn.click();
        driver.switchTo().frame("iframe_vzdhq4kgvp");
        BrowserUtils.waitFor(3);
        BrowserUtils.waitForVisibility(taskPagetitle, 3);
        String actualTaskTitle = taskPagetitle.getText();
        String expectedTaskTitle = ConfigurationReader.getProperty("thingToDo");
        Assert.assertEquals(expectedTaskTitle, actualTaskTitle);

    }


    public void createTaskWithFile() throws IOException {
        BrowserUtils.waitForClickablility(taskElement, 2);
        taskElement.click();
        BrowserUtils.waitForVisibility(thingToDoInput, 5);
        thingToDoInput.sendKeys(ConfigurationReader.getProperty("thingToDo1"));
        BrowserUtils.waitForClickablility(uploadBtn, 2);
        uploadBtn.click();
        // BrowserUtils.waitForClickablility(uploadFileBtn,5);


        // uploadFileBtn.click().;
        BrowserUtils.waitFor(5);
        Runtime.getRuntime().exec("C:\\Users\\bahti\\upload2.exe");

        BrowserUtils.waitFor(3);

        sendBtn.click();
        veiwTaskBtn.click();

    }

}