package com.Btrix24.step_definitions;

import com.Btrix24.pages.homepage.HomePage;
import com.Btrix24.utilities.Driver;
import com.Btrix24.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Login_Step_Definition {

    Pages pages = new Pages();

    WebDriver driver = Driver.getDriver();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

        pages.loginPage().goToLandingPage();

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        pages.loginPage().login(username,password);
    }


    @Then("homepage logo should display")
    public void homepage_logo_should_display() {

        HomePage homePage = new HomePage();
        homePage.homePageLogo.isDisplayed();
        String expected = "NextbaseCRM";
        String actual = homePage.homePageLogo.getText();
        Assert.assertEquals(expected, actual);
        System.out.println(expected + "  " + actual);
    }

    }



