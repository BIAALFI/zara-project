package tests.recoverpasswordtests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;


public class RecoverPasswordTests extends BaseTest {

    String emailreset = RandomStringUtils.randomAlphabetic(6) + "@yahoo.com";

    @BeforeTest
    public void test() {
        landingPage.clickLogInButton();
        logInPage.clickOnForgottenPasswordButton();

    }

    @Test
    public void isResetPasswordMessageDidplayed() {
        //landingPage.clickOnAcceptCookie();
        //landingPage.clickLogInButton();
        //recoverPasswordPage.isResetPaswordMessageDisplayed();       /////////reminder pasi in test
        //logInPage.clickOnForgottenPasswordButton();
        recoverPasswordPage.isResetPaswordMessageDisplayed();
        BasePage.sleep(2000);
        recoverPasswordPage.typeInResetEmailField(emailreset);
        BasePage.sleep(2000);
        recoverPasswordPage.clickOnContinueButton();
        recoverPasswordPage.clickOnContinueButton();
        BasePage.sleep(2000);
        //recoverPasswordPage.clickOnAcceptButton(); //// nu merge de la ei!

    }
}