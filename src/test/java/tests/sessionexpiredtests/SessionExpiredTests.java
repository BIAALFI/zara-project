package tests.sessionexpiredtests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

public class SessionExpiredTests extends BaseTest {
    String emailreset = RandomStringUtils.randomAlphabetic(6) + "@yahoo.com";

    //@BeforeTest
    //public void test() {
    //landingPage.clickLogInButton();                ///reminder pentru profesor! de ce nu ma lasa sa am si before test!
    //logInPage.clickOnForgottenPasswordButton();

    @Test
    public void isSessionExpiredMessageDisplayed() {
        landingPage.clickLogInButton();
        logInPage.clickOnForgottenPasswordButton();
        recoverPasswordPage.isResetPaswordMessageDisplayed();
        BasePage.sleep(2000);
        recoverPasswordPage.typeInResetEmailField(emailreset);
        BasePage.sleep(2000);
        recoverPasswordPage.clickOnContinueButton();
        recoverPasswordPage.clickOnContinueButton();
        BasePage.sleep(2000);
        //recoverPasswordPage.clickOnAcceptButton(); //// nu merge de la ei!
        sessionExpiredPage.isZaraLogoDisplayedOnExpiredPage();
        sessionExpiredPage.isSessionExpiredMessageDisplayed();
        sessionExpiredPage.isGoToHomePageButtonDisplayed();
        sessionExpiredPage.isLogInButtonDisplayed();
        sessionExpiredPage.clickOnGoToHomePageButton();
        BasePage.sleep(5000);
        landingPage.clickLogInButton();
        logInPage.clickOnForgottenPasswordButton();
        recoverPasswordPage.isResetPaswordMessageDisplayed();
        BasePage.sleep(2000);
        recoverPasswordPage.typeInResetEmailField(emailreset);
        BasePage.sleep(2000);
        recoverPasswordPage.clickOnContinueButton();
        recoverPasswordPage.clickOnContinueButton();
        BasePage.sleep(2000);
        sessionExpiredPage.clickOnLogInButton();
        logInPage.clickOnZaraLogoOnLogInPage();
    }
}