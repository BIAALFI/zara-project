package pages.sessionexpiredpage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;

public class SessionExpiredPage extends BasePage {
    private SessionExpiredPage() {
    }

    public static SessionExpiredPage getInstance() {
        if (instance == null) {
            instance = new SessionExpiredPage();
        }
        return instance;
    }

    public static final Logger LOG = LoggerFactory.getLogger(SessionExpiredPage.class);
    public static SessionExpiredPage instance;

    private final By zaraLogoOnExpiredPage = By.xpath("//a[@aria-label='ZARA Romania logo.']");
    private final By sessionHasExpiredMessage = By.xpath("//h1[@class='content-header__title']");
    private final By goToHomePageButton = By.xpath("(//a[@href='https://www.zara.com/ro/en/'])[2]");
    private final By logInButton = By.xpath("(//a[@role='link'])[1]");
    private final By zaraLogoOnLogInPage = By.xpath("//a[@aria-label='ZARA Romania logo.']");

    public void isSessionExpiredMessageDisplayed() {
        LOG.info("The session expired message is displayed");
        Assert.assertTrue(driver.findElement(sessionHasExpiredMessage).isDisplayed());
    }

    public void isZaraLogoDisplayedOnExpiredPage() {
        LOG.info("Zara logo is displayed on the session expired page");
        Assert.assertTrue(driver.findElement(zaraLogoOnExpiredPage).isDisplayed());
    }

    public void isGoToHomePageButtonDisplayed() {
        LOG.info("Go To Home Page Button is displayed on the session expired page");
        Assert.assertTrue(driver.findElement(goToHomePageButton).isDisplayed());
    }

    public void isLogInButtonDisplayed() {
        LOG.info("Log In button is displayed on the session expired page");
        Assert.assertTrue(driver.findElement(logInButton).isDisplayed());
    }

    public void clickOnGoToHomePageButton() {
        LOG.info("Clicking on GO TO HOME PAGE button");
        driver.findElement(goToHomePageButton).click();

    }

    public void clickOnLogInButton() {
        LOG.info("Clicking on LOG IN Button");
        driver.findElement(logInButton).click();
    }

    public void clickOnZaraLogoOnLogInPage() {
        LOG.info("Clicking the zara logo on the LOG In Page");
        driver.findElement(zaraLogoOnLogInPage).click();
    }
}