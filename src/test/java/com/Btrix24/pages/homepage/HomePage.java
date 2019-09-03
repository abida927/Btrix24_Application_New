package com.Btrix24.pages.homepage;

import com.Btrix24.utilities.BasePage;
import com.Btrix24.utilities.BrowserUtils;
import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.Pages;
import cucumber.api.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.Btrix24.utilities.BrowserUtils.waitForVisibility;

public class HomePage extends Pages {


    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    Scenario scenario;

    @FindBy(css = "[class='logo-text']")
    public WebElement homePageLogo;















}
