package tests.sessionexpiredtests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SessionExpiredTests extends BaseTest {

    String emailReset = RandomStringUtils.randomAlphabetic(6) + "@yahoo.com";

    @BeforeTest
    public void test() {
        landingPage.clickLogInButton();
        logInPage.clickOnForgottenPasswordButton();
    }

    @Test
    public void isSessionExpiredMessageDisplayed() {
        LOG.info("Starting test Is Session Expired Message Displayed");
        recoverPasswordPage.isResetPasswordMessageDisplayed();
        recoverPasswordPage.typeInResetEmailField(emailReset);
        recoverPasswordPage.clickOnContinueButton();
        recoverPasswordPage.clickOnContinueButton();
        sessionExpiredPage.isZaraLogoDisplayedOnExpiredPage();
        sessionExpiredPage.isSessionExpiredMessageDisplayed();
        sessionExpiredPage.isGoToHomePageButtonDisplayed();
        sessionExpiredPage.isLogInButtonDisplayed();
        sessionExpiredPage.clickOnGoToHomePageButton();
        landingPage.clickLogInButton();
        logInPage.clickOnForgottenPasswordButton();
        recoverPasswordPage.isResetPasswordMessageDisplayed();
        recoverPasswordPage.typeInResetEmailField(emailReset);
        recoverPasswordPage.clickOnContinueButton();
        recoverPasswordPage.clickOnContinueButton();
        sessionExpiredPage.clickOnLogInButton();
        logInPage.clickOnZaraLogoOnLogInPage();
    }

}