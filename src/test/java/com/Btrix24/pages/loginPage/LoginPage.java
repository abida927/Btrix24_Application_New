package com.Btrix24.pages.loginPage;

import com.Btrix24.utilities.*;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
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
        BrowserUtils.waitForClickablility(loginBtn, 3);
        loginBtn.click();
    }


    public void goToLandingPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


//**********************************************login with Credentials methods

    List<Map<String, String>> credentialData;

    public void getCredentialData() {
        ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\bahti\\OneDrive\\Documents\\BTRIX24_Application_New\\src\\test\\resoucers\\LoginCredentials.xlsx", "credentials");

        credentialData = excelUtil.getDataList();

    }

    public void loginWithCredentialDataTest() {

        for (Map<String,String> credential : credentialData){
            usernameInput.sendKeys(credential.get("UserName"));
            passwordInput.sendKeys(credential.get("Password"));

            loginBtn.click();
        }
    }
}
