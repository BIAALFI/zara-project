
package pages.loginpage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;

public class LogInPage extends BasePage {
    private LogInPage() {
    }

    public static LogInPage getInstance() {
        if (instance == null) {
            instance = new LogInPage();
        }
        return instance;
    }

    public static final Logger LOG = LoggerFactory.getLogger(LogInPage.class);
    public static LogInPage instance;

    private final By logInToYourAccSection = By.xpath("(//h2[@class='logon-view__section-title'])[1]");
    private final By emailField = By.xpath("//input[@name= 'logonId']");
    private final By passwordField = By.xpath("//input[@name= 'password']");
    public final By logInButton = By.xpath("//button[@class='zds-button zds-button--primary']");
    public final By forgottenPasswordButton = By.xpath("//a[@class='action-link logon-view__link link']");
    public final By registerButton = By.xpath("(//button[@role='button'])[2]");


    public void isLogInToYourAccSectionDiplayed() {
        LOG.info("Verify if log to your acc section is displayed");
        Assert.assertTrue(driver.findElement(logInToYourAccSection).isDisplayed());

    }

    public void typeInEmailField(String email) {
        LOG.info("Type in email field");
        driver.findElement(emailField).sendKeys(email);


    }

    public void typeInPasswordField(String password) {
        LOG.info("Type in password field");
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLogInButton() {
        LOG.info("Click on log in button");
        driver.findElement(logInButton).click();
    }

    public void clickOnForgottenPasswordButton() {
        LOG.info("Clicking the forgotten password button");
        driver.findElement(forgottenPasswordButton).click();
    }

    public void clickOnRegisterButton() {
        LOG.info("Clicking the register button");
        driver.findElement(registerButton).click();
    }

}