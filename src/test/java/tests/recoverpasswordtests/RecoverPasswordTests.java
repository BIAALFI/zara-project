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

        recoverPasswordPage.isResetPaswordMessageDisplayed();
        BasePage.sleep(2000);
        recoverPasswordPage.typeInResetEmailField(emailreset);
        BasePage.sleep(2000);
        recoverPasswordPage.clickOnContinueButton(); ///////// aici o sa fiu dusa pe SESSION EXPIRED PAGE//// anti bot protection!
        recoverPasswordPage.clickOnContinueButton();
        BasePage.sleep(2000);
        //recoverPasswordPage.clickOnAcceptButton(); //// nu merge de la ei!
    }
}