package com.raji.qe;

import com.raji.config.AppConfiguration;
import com.raji.pages.HomePage;
import com.raji.pages.LandingPage;
import com.raji.pages.LoginPage;
import com.raji.qe.base.FunctionalTest;
import com.raji.util.WaitHelper;
import org.junit.Test;

public class UIFlowsTest extends FunctionalTest {

    @Test
    public void LoginLogoutTest() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage.AtChecker();
        homePage.ClickOnSignIn();
        WaitHelper.WaitForPageLoad();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.AtChecker();
        loginPage.EnterEmail(AppConfiguration.Email);
        loginPage.EnterPassword(AppConfiguration.Password);
        loginPage.ClickOnSignInSubmitButton();
        WaitHelper.WaitForPageLoad();

        LandingPage landingPage = new LandingPage(driver);
        landingPage.AtChecker();
        landingPage.HoverOnAccountsAndLists();
        landingPage.ClickSignOut();
    }
}