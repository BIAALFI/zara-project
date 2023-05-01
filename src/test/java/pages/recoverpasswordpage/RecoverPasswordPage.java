package pages.recoverpasswordpage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

public class RecoverPasswordPage extends BasePage {

    private RecoverPasswordPage() {

    }

    public static RecoverPasswordPage getInstance() {
        if (instance == null) {
            instance = new RecoverPasswordPage();
        }
        return instance;
    }


    public static RecoverPasswordPage instance;

    private final By resetPasswordMessageIsDisplayed = By.xpath("//div[@class='content-header__info']");
    private final By resetEmailField = By.xpath("//input[@name='logonId']");
    private final By clickContinueButton = By.xpath("//button[@role='button']");
    private final By clickOnAcceptButton = By.xpath("//div[@role='alertdialog']//button[@data-qa-id='message-close-success']");


    public void isResetPasswordMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(resetPasswordMessageIsDisplayed));
        LOG.info("Verify if reset password  is displayed");
        Assert.assertTrue(driver.findElement(resetPasswordMessageIsDisplayed).isDisplayed());
    }

    public void typeInResetEmailField(String emailReset) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(resetEmailField));
        BasePage.sleep(3000);
        LOG.info("Type in reset email field");
        driver.findElement(resetEmailField).sendKeys(emailReset);
    }

    public void clickOnContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(clickContinueButton));
        BasePage.sleep(3000);
        LOG.info("Clicking the continue button");
        driver.findElement(clickContinueButton).click();
    }

    public void clickOnAcceptButton() {
        LOG.info("Clicking on accept button");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnAcceptButton));
        driver.findElement(clickOnAcceptButton).click();
    }

}