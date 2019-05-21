package com.raji.pages;

import com.raji.config.AppConfiguration;
import com.raji.pages.base.BasePage;
import com.raji.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    String url = AppConfiguration.BaseUrl + "?ref_=nav_signin&";

    @FindBy (css = "#nav-link-accountList")
    WebElement AccountAndLists;

    @FindBy (css = "#nav-item-signout")
    WebElement SignOutButton;

    @FindBy (css = "#searchDropdownBox")
    WebElement CategoryDropdown;

    @FindBy (css = "#twotabsearchtextbox")
    WebElement SearchTextEntry;

    @FindBy (css = "[value='Go']")
    WebElement SearchSubmitButton;

	public LandingPage(WebDriver driver) {
		super(driver);
	}

	public void AtChecker() throws Exception{
		DriverHelper.AssertPageTitleContains("Amazon");
        DriverHelper.AssertPageUrlStartsWith(url);
	}

	public void HoverOnAccountsAndLists(){
        Actions hoverAccountAndLists = new Actions(driver);
        hoverAccountAndLists.moveToElement(AccountAndLists).build().perform();
    }

    public void ClickSignOut(){
        SignOutButton.click();
    }

}
