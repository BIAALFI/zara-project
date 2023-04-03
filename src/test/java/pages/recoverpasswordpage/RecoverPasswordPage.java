package pages.recoverpasswordpage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;
import pages.registerpage.RegisterPage;

public class RecoverPasswordPage extends BasePage {
    private RecoverPasswordPage() {
    }

    public static RecoverPasswordPage getInstance() {
        if (instance == null) {
            instance = new RecoverPasswordPage();
        }
        return instance;
    }

    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RecoverPasswordPage instance;

    private final By resetPasswordMessageIsDisplayed = By.xpath("//div[@class='content-header__info']");
    private final By resetEmailField = By.xpath("//input[@name='logonId']");
    private final By clickContinueButton = By.xpath("//button[@role='button']");
    private final By clickOnAcceptButton = By.xpath("//div[@role='alertdialog']//button[@data-qa-id='message-close-success']");


    public void isResetPaswordMessageDisplayed() {
        LOG.info("Verify if reste password  is displayed");
        Assert.assertTrue(driver.findElement(resetPasswordMessageIsDisplayed).isDisplayed());
    }

    public void typeInResetEmailField(String emailreset) {
        LOG.info("Type in reset email field");
        driver.findElement(resetEmailField).sendKeys(emailreset);
    }

    public void clickOnContinueButton() {
        LOG.info("Clicking the continue button");
        driver.findElement(clickContinueButton).click();

    }

    public void clickOnAcceptButton() {
        LOG.info("Clicking on accept button");
        driver.findElement(clickOnAcceptButton).click();
        //bibi
    }
}