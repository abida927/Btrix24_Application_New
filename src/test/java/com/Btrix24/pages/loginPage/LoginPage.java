package com.Btrix24.pages.loginPage;

import com.Btrix24.utilities.BasePage;
import com.Btrix24.utilities.ConfigurationReader;
import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.Pages;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class LoginPage extends Pages {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[name='USER_LOGIN']")
    public WebElement usernameInput;

    @FindBy(css = "[name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(css = "[type='submit']")
    public WebElement loginBtn;

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }


    public void goToLandingPage () {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


}
