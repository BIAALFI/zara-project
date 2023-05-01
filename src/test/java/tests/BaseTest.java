package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.landingpage.LandingPage;
import pages.loginpage.LogInPage;
import pages.recoverpasswordpage.RecoverPasswordPage;
import pages.registerpage.RegisterPage;
import pages.searchpage.SearchPage;
import pages.sessionexpiredpage.SessionExpiredPage;


public class BaseTest {

    public static final Logger LOG = LoggerFactory.getLogger(BaseTest.class);
    public LandingPage landingPage = LandingPage.getInstance();
    public LogInPage logInPage = LogInPage.getInstance();
    public RecoverPasswordPage recoverPasswordPage = RecoverPasswordPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public SessionExpiredPage sessionExpiredPage = SessionExpiredPage.getInstance();
    public SearchPage searchPage = SearchPage.getInstance();


    @BeforeSuite
    public void beforeSuite() {
        BasePage.setUp();
        landingPage.clickOnAcceptCookie();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

}