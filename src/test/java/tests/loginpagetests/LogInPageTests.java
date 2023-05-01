package tests.loginpagetests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LogInPageTests extends BaseTest {

    String email = "biancamircea230@gmail.com";
    String password = "B123456b";

    @Test
    public void clickingLogInButton() {
        LOG.info("Starting test Clicking Log In Button");
        landingPage.clickOnAcceptCookie();
        landingPage.clickLogInButton();
        logInPage.isLogInToYourAccSectionDisplayed();
        logInPage.typeInEmailField(email);
        logInPage.typeInPasswordField(password);
        logInPage.clickOnLogInButton();
    }

}