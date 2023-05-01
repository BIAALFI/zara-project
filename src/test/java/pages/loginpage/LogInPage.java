
package pages.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public static LogInPage instance;

    private final By logInToYourAccSection = By.xpath("(//h2[@class='logon-view__section-title'])[1]");
    private final By emailField = By.xpath("//input[@name= 'logonId']");
    private final By passwordField = By.xpath("//input[@name= 'password']");
    public final By logInButton = By.xpath("//button[@class='zds-button zds-button--primary']");
    public final By forgottenPasswordButton = By.xpath("//a[@class='action-link logon-view__link link']");
    public final By registerButton = By.xpath("(//button[@role='button'])[2]");
    private final By zaraLogoOnLogInPage = By.xpath("//a[@aria-label='ZARA Romania logo.']");


    public void isLogInToYourAccSectionDisplayed() {
        LOG.info("Verify if log to your acc section is displayed");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInToYourAccSection));
        Assert.assertTrue(driver.findElement(logInToYourAccSection).isDisplayed());
    }

    public void typeInEmailField(String email) {
        LOG.info("Type in email field");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }

    public void typeInPasswordField(String password) {
        LOG.info("Type in password field");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLogInButton() {
        LOG.info("Click on log in button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInButton));
        driver.findElement(logInButton).click();
    }

    public void clickOnForgottenPasswordButton() {
        LOG.info("Clicking the forgotten password button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(forgottenPasswordButton));
        driver.findElement(forgottenPasswordButton).click();
    }

    public void clickOnRegisterButton() {
        LOG.info("Clicking the register button");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(registerButton));
        driver.findElement(registerButton).click();
    }

    public void clickOnZaraLogoOnLogInPage() {
        LOG.info("Clicking the zara logo on the LOG In Page");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(zaraLogoOnLogInPage));
        driver.findElement(zaraLogoOnLogInPage).click();
    }

}