package tests.recoverpasswordtests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import tests.BaseTest;


public class RecoverPasswordTests extends BaseTest {

    String emailReset = RandomStringUtils.randomAlphabetic(6) + "@yahoo.com";


    @Test
    public void resetPasswordFunctionalities() {
        LOG.info("Starting test Reset Password Functionalities");
        landingPage.clickLogInButton();
        logInPage.clickOnForgottenPasswordButton();
        recoverPasswordPage.isResetPasswordMessageDisplayed();
        recoverPasswordPage.typeInResetEmailField(emailReset);
        recoverPasswordPage.clickOnContinueButton();
        recoverPasswordPage.clickOnContinueButton();

    }

}