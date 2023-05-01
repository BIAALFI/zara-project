package tests.registerpagetests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class RegisterTests extends BaseTest {

    String email = "mirceabianca806@gmail.com";
    String password = "Bibi123456";
    String passwordRepeat = "Bibi123456";
    String nameField = "Bianca";
    String surname = "Mircea";


    @Test
    public void fillRegisterInfo() {
        LOG.info("Starting test Fill Register Info");
        registerPage.isPersonalDetailsMsgDisplayed();
        landingPage.clickOnAcceptCookie();
        landingPage.clickLogInButton();
        logInPage.clickOnRegisterButton();
        registerPage.typeInEmailField(email);
        registerPage.typeInPasswordField(password);
        registerPage.typeInRepeatPasswordField(passwordRepeat);
        registerPage.typeInNameField(nameField);
        registerPage.typeInSurnameField(surname);
        registerPage.markCheckBox();
        registerPage.clickOnCreateAccountButton();
        registerPage.isSearchFieldDisplayed();
    }

}