package com.Btrix24.step_definitions;

import com.Btrix24.pages.homepage.HomePage;
import com.Btrix24.utilities.BrowserUtils;
import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.ExcelUtil;
import com.Btrix24.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class Login_Step_Definition  {

    Pages pages = new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        pages.loginPage().goToLandingPage();

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        pages.loginPage().login(username, password);

    }

    @Then("homepage logo should display")
    public void homepage_logo_should_display() {
        HomePage homePage = new HomePage();
        BrowserUtils.waitForVisibility(homePage.homePageLogo, 2);
        homePage.homePageLogo.isDisplayed();
        String expected = "NextbaseCRM";
        String actual = homePage.homePageLogo.getText();
        Assert.assertEquals(expected, actual);
        System.out.println(expected + "  " + actual);
    }


    @When("user login with credentials")
    public void user_login_with_credentials() {

        List<Map<String, String>> credentialData;

        ExcelUtil excelUtil = new ExcelUtil("C:\\Users\\bahti\\OneDrive\\Documents\\BTRIX24_Application_New\\src\\test\\resoucers\\LoginCredentials.xlsx", "credentials");

        credentialData = excelUtil.getDataList();
        for (Map<String,String> credential : credentialData){
            pages.loginPage().usernameInput.sendKeys(credential.get("UserName"));
            pages.loginPage().passwordInput.sendKeys(credential.get("Password"));
            pages.loginPage().loginBtn.click();
        }
    }

    @Then("homepage title should be {string}")
    public void homepage_title_should_be(String title) {

        title = Driver.getDriver().getTitle();
        Assert.assertEquals(title,"Portal");
        Driver.getDriver().close();

    }
}