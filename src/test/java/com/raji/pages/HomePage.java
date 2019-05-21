package com.raji.pages;

import com.raji.config.AppConfiguration;
import com.raji.pages.base.BasePage;
import com.raji.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.*;

public class HomePage extends BasePage {

    @FindBy (css="#nav-link-accountList")
    private WebElement accountAndLists;

    @FindBy (css="[data-nav-ref='nav_signin']")
    private WebElement signInButton;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void AtChecker() throws Exception{
		DriverHelper.AssertPageTitleContains("Amazon");
		DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
	}

	public void ClickOnSignIn() {
        Actions hoverAccountAndLists = new Actions(driver);
        hoverAccountAndLists.moveToElement(accountAndLists).build().perform();
        signInButton.click();
    }

}
