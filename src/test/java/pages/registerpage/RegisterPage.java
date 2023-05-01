package pages.registerpage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;


public class RegisterPage extends BasePage {

    private RegisterPage() {

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    public static RegisterPage instance;


    private final By personalDetailsMsg = By.xpath("//div[@class='content-header__info']");
    private final By emailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By repeatPassword = By.xpath("//input[@name='passwordConfirm']");
    private final By nameField = By.xpath("//input[@name='firstName']");
    private final By surnameField = By.xpath("//input[@name='lastName']");
    private final By checkBox = By.xpath("(//div[@class='form-input-checkbox__input-wrapper'])[2]");
    private final By createAccountButton = By.xpath("//button[@role='button']");
    private final By searchField = By.xpath("//a[@class='layout-header-search-link__link']");


    public void isPersonalDetailsMsgDisplayed() {
        LOG.info("Is personal details message displayed");
        Assert.assertTrue(driver.findElement(personalDetailsMsg).isDisplayed());
    }

    public void typeInEmailField(String email) {
        LOG.info("Type in email field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void typeInPasswordField(String password) {
        LOG.info("Type in password field");
        driver.findElement(passwordField).sendKeys(password);
    }

    public void typeInRepeatPasswordField(String passwordRepeat) {
        LOG.info("Type in repeat password field");
        driver.findElement(repeatPassword).sendKeys(passwordRepeat);
    }

    public void typeInNameField(String name) {
        LOG.info("Type in name field");
        driver.findElement(nameField).sendKeys(name);
    }

    public void typeInSurnameField(String surname) {
        LOG.info("Type in surname field");
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void markCheckBox() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(checkBox));
        LOG.info("Mark the checkbox");
        driver.findElement(checkBox).click();
    }

    public void clickOnCreateAccountButton() {
        LOG.info("Click the create account button");
        driver.findElement(createAccountButton).click();
    }

    public void isSearchFieldDisplayed() {
        LOG.info("Search field is displayed");
        Assert.assertTrue(driver.findElement(searchField).isDisplayed());
    }

}