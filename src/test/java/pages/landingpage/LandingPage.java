package pages.landingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;

public class LandingPage extends BasePage {

    private LandingPage() {

    }


    public static LandingPage getInstance() {
        if (instance == null) {
            instance = new LandingPage();
        }
        return instance;
    }

    public static LandingPage instance;

    private final By zaraLogo = By.xpath("//a[@class='layout-logo__link link']");
    private final By logInButton = By.xpath("//a[@class='layout-header-link layout-header-links__desktop-link layout-header-links__logon-link link']");
    private final By acceptCookieButton = By.id("onetrust-accept-btn-handler");
    private final By hamburgerButton = By.xpath("//button[@aria-label='Open menu']");
    private final By searchField = By.xpath("//a[@class='layout-header-search-link__link']");
    private final By helpButton = By.xpath("//a[@href='https://www.zara.com/ro/en/help']");
    private final By basketLogo = By.xpath("//span[@class='layout-header-shop-cart-link__count']");
    private final By accessibilityButton = By.xpath("//div[@class='accessibility-widget-button__background']");
    private final By womanButtonDisplayedInHamburgerButton = By.xpath("(//span[@class='layout-categories-category__name'])[1]");
    private final By manButtonDisplayedInHamburgerButton = By.xpath("(//span[@class='layout-categories-category__name'])[34]");
    private final By kidsButtonDisplayedInHamburgerButton = By.xpath("//a[@aria-label='KIDS, Display auxiliary categories']");
    private final By homeButtonDisplayedInHamburgerButton = By.xpath("(//a[@aria-label='HOME, Display auxiliary categories'])[3]");
    private final By beautyButtonDisplayedInHamburgerButton = By.xpath("(//a[@aria-label='BEAUTY, Display auxiliary categories'])[3]");
    private final By diningRoomSectionInHomeButton = By.xpath("(//a[@aria-label='DINING ROOM, Display auxiliary categories'])[3]");
    private final By tableWareButton = By.xpath("(//a[@aria-label='Tableware, Display auxiliary categories'])[3]");


    public void clickOnAcceptCookie() {
        LOG.info("Accepting Cookies");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(acceptCookieButton));
        driver.findElement(acceptCookieButton).click();
    }

    public void isLogoDisplayed() {
        LOG.info("Verifying if Zara Logo is Displayed");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(zaraLogo));
        Assert.assertTrue(driver.findElement(zaraLogo).isDisplayed(), "Zara Logo is not displayed");
    }

    public void isHamburgerButtonDisplayed() {
        LOG.info("Hamburger button is displayed");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(hamburgerButton));
        Assert.assertTrue(driver.findElement(hamburgerButton).isDisplayed());
    }

    public void isLogInButtonDisplayed() {
        LOG.info("Log in button is displayed on landing page");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(logInButton));
        Assert.assertTrue(driver.findElement(logInButton).isDisplayed());
    }

    public void isSearchFieldDisplayed() {
        LOG.info("Search field is displayed on landing page");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
        Assert.assertTrue(driver.findElement(searchField).isDisplayed());
    }

    public void isHelpButtonDisplayed() {
        LOG.info("Help button is displayed on landing page");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(helpButton));
        Assert.assertTrue(driver.findElement(helpButton).isDisplayed());
    }

    public void isBasketLogoDisplayed() {
        LOG.info("Basket logo is displayed on  landing page");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(basketLogo));
        Assert.assertTrue(driver.findElement(basketLogo).isDisplayed());
    }

    public void isAccessibilityButtonDisplayed() {
        LOG.info("Accessibility button is displayed on landing page");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accessibilityButton));
        Assert.assertTrue(driver.findElement(accessibilityButton).isDisplayed());
    }

    public void clickLogInButton() {
        LOG.info("Clicking the log in button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(logInButton));
        BasePage.sleep(2000);
        driver.findElement(logInButton).click();
    }

    public void clickHamburgerButton() {
        LOG.info("Clicking the hamburger Button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(hamburgerButton));
        driver.findElement(hamburgerButton).click();
    }

    public void isWomanButtonDisplayedInHmgButton() {
        LOG.info("Woman button is displayed after clicking on hamburger button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(womanButtonDisplayedInHamburgerButton));
        Assert.assertTrue(driver.findElement(womanButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void isManButtonDisplayedInHmgButton() {
        LOG.info("Man button is displayed after clicking the hamburger button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(manButtonDisplayedInHamburgerButton));
        Assert.assertTrue(driver.findElement(manButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void isKidsButtonDisplayedInHmgButton() {
        LOG.info("Kids button is displayed after clicking the hamburger button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(kidsButtonDisplayedInHamburgerButton));
        Assert.assertTrue(driver.findElement(kidsButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void isHomeButtonDisplayedInHmgButton() {
        LOG.info("Home button is displayed after clicking the hamburger button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeButtonDisplayedInHamburgerButton));
        Assert.assertTrue(driver.findElement(homeButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void isBeautyButtonDisplayedInHmgButton() {
        LOG.info("Beauty button is displayed after clicking the hamburger button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(beautyButtonDisplayedInHamburgerButton));
        Assert.assertTrue(driver.findElement(beautyButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void clickingHomeButtonInHmgButton() {
        LOG.info("Clicking home button in the hamburger button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homeButtonDisplayedInHamburgerButton));
        driver.findElement(homeButtonDisplayedInHamburgerButton).click();
    }

    public void clickingDiningRoomSectionInHomeButton() {
        LOG.info("Dining room section is clicked in home button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(diningRoomSectionInHomeButton));
        driver.findElement(diningRoomSectionInHomeButton).click();
    }

    public void clickingTablewareButtonInDiningRoomSection() {
        LOG.info("Tableware button is clicked in dining room section");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tableWareButton));
        driver.findElement(tableWareButton).click();
    }

    public void clickingTheSearchButton() {
        LOG.info("Clicking the Search button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
        driver.findElement(searchField).click();
    }

}