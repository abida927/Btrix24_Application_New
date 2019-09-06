package com.Btrix24.pages.sidemodule;

import com.Btrix24.utilities.BasePage;
import com.Btrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideModule extends BasePage {

    public SideModule(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "[class='menu-item-link'][title='Activity Stream']")
    public WebElement ActivityStreamModule;

    @FindBy(css = "[class='menu-item-link'][title='Tasks']")
    public WebElement taskModule;
}
