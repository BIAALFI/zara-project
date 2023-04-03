package tests.loginpagetests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class LogInPageTests extends BaseTest {


    String email = "biancamircea230@gamil.com";
    String password = "B123456b";

    @Test
    public void clickingLogInButton() {
        landingPage.clickOnAcceptCookie();
        landingPage.clickLogInButton();
        logInPage.isLogInToYourAccSectionDiplayed();
        logInPage.typeInEmailField(email);
        logInPage.typeInPasswordField(password);
        logInPage.clickOnLogInButton();

        //logInPage.clickOnRegisterButton();

    }
}