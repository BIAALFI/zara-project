package tests.registerpagetests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class RegisterTests extends BaseTest {

    String email = "mirceabianca806@gmail.com";
    String password = "Bibi123456";
    String passwordrepeat = "Bibi123456";
    String namefield = "Bianca";
    String surname = "Mircea";

    @Test

    public void isPersonalDetailsMsgDisplayed() {
        registerPage.isPersonalDetailsMsgDisplayed();

    }

    @Test
    public void fillRegisterinfo() {
        landingPage.clickOnAcceptCookie();
        landingPage.clickLogInButton();
        logInPage.clickOnRegisterButton();
        registerPage.typeInEmailField(email);
        registerPage.typeInPasswordField(password);
        registerPage.typeInRepeatPasswordField(passwordrepeat);
        registerPage.typeInNameField(namefield);
        registerPage.typeInSurnameField(surname);
        registerPage.markCheckBox(); /////ajutor!!!
        registerPage.clickOnCreateAccountButton();
        registerPage.isSearchFieldDisplayed();

    }
}