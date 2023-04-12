package tests.loginpagetests;

import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

public class LogInPageTests extends BaseTest {


    String email = "biancamircea230@gmail.com";
    String password = "B123456b";

    @Test
    public void clickingLogInButton() {
        landingPage.clickOnAcceptCookie();
        landingPage.clickLogInButton();
        logInPage.isLogInToYourAccSectionDiplayed();
        logInPage.typeInEmailField(email);
        BasePage.sleep(2000);
        logInPage.typeInPasswordField(password);
        BasePage.sleep(2000);
        logInPage.clickOnLogInButton();
        BasePage.sleep(2000); /// o sa mearga testul dar am session expired, pe tot site ul este anti bot detection/////
    }
}