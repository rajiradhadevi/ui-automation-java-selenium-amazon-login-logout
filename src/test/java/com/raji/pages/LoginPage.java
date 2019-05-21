package com.raji.pages;

import com.raji.config.AppConfiguration;
import com.raji.pages.base.BasePage;
import com.raji.util.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(css="#ap_email")
	private WebElement EmailTextbox;

	@FindBy(css="#ap_password")
	private WebElement PasswordTextbox;

	@FindBy(css="#signInSubmit")
	private WebElement SignInSubmitButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void AtChecker() throws Exception{
		DriverHelper.AssertPageTitleContains("Amazon Sign In");
		DriverHelper.AssertPageUrlStartsWith(AppConfiguration.BaseUrl);
		EmailTextbox.isDisplayed();
		PasswordTextbox.isDisplayed();
		SignInSubmitButton.isDisplayed();
	}


	public void EnterEmail(String Email) {
		EmailTextbox.sendKeys(Email);
	}

	public void EnterPassword(String Password){
		PasswordTextbox.sendKeys(Password);
	}

	public void ClickOnSignInSubmitButton() {
		SignInSubmitButton.click();
	}
}
