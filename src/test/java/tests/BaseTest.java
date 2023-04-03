package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.BasePage;
import pages.landingpage.LandingPage;
import pages.loginpage.LogInPage;
import pages.recoverpasswordpage.RecoverPasswordPage;
import pages.registerpage.RegisterPage;


public class BaseTest {


    public LandingPage landingPage = LandingPage.getInstance();
    public LogInPage logInPage = LogInPage.getInstance();
    public RecoverPasswordPage recoverPasswordPage = RecoverPasswordPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

    @BeforeTest
    public void acceptCookie() {
        landingPage.clickOnAcceptCookie();
    }
}