package pages.landingpage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    public static final Logger LOG = LoggerFactory.getLogger(LandingPage.class);
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
        driver.findElement(acceptCookieButton).click();
    }

    public void isLogoDisplayed() {
        LOG.info(" Zara Logo is Displayed");
        Assert.assertTrue(driver.findElement(zaraLogo).isDisplayed());
    }


    public void isHamburgerButtonDisplayed() {
        LOG.info("Hamburger button is displayed");
        Assert.assertTrue(driver.findElement(hamburgerButton).isDisplayed());
    }

    public void isLogInButtonDisplayedd() {
        LOG.info("Log in button is displayed on landing page");
        Assert.assertTrue(driver.findElement(logInButton).isDisplayed());
    }

    public void isSearchFieldDisplayed() {
        LOG.info("Search field is displayed on landing page");
        Assert.assertTrue(driver.findElement(searchField).isDisplayed());
    }

    public void isHelpButtonDisplayed() {
        LOG.info("Help button is displayed on landing page");
        Assert.assertTrue(driver.findElement(helpButton).isDisplayed());
    }

    public void isBasketLogoDisplayed() {
        LOG.info("Basket logo is displayed on  landing page");
        Assert.assertTrue(driver.findElement(basketLogo).isDisplayed());
    }

    public void isAccessibilityButtonDisplayed() {
        LOG.info("Accessibility button is displayed on landing page");
        Assert.assertTrue(driver.findElement(accessibilityButton).isDisplayed());
    }

    public void clickLogInButton() {
        LOG.info("Clicking the log in button");
        driver.findElement(logInButton).click();
    }

    public void clickHmaburgerButton() {
        LOG.info("Clicking the hamburger Button");
        driver.findElement(hamburgerButton).click();

    }

    public void isWomanButtonDsiapalyedInHmgButton() {
        LOG.info("Woman button is displayed after clicking on hamburger button");
        Assert.assertTrue(driver.findElement(womanButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void isManButtonDsiapalyedInHmgButton() {
        LOG.info("Man button is displayed after clicking the hamburger button");
        Assert.assertTrue(driver.findElement(manButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void isKidsButtonDsiapalyedInHmgButton() {
        LOG.info("Kids button is displayed after clicking the hamburger button");
        Assert.assertTrue(driver.findElement(kidsButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void isHomeButtonDsiapalyedInHmgButton() {
        LOG.info("Home button is displayed after clicking the hamburger button");
        Assert.assertTrue(driver.findElement(homeButtonDisplayedInHamburgerButton).isDisplayed());

    }

    public void isBeautyButtonDsiapalyedInHmgButton() {
        LOG.info("Beauty button is displayed after clicking the hamburger button");
        Assert.assertTrue(driver.findElement(beautyButtonDisplayedInHamburgerButton).isDisplayed());
    }

    public void clickingHomeButtonInHmgButton() {
        LOG.info("Clicking home button in the hamburger button");
        driver.findElement(homeButtonDisplayedInHamburgerButton).click();

    }

    public void clickingDiningRoomSectionInHomeButton() {
        LOG.info("Dining room section is clicked in home button");
        driver.findElement(diningRoomSectionInHomeButton).click();
    }

    public void clickingTablewareButtonInDiningRoomSection() {
        LOG.info("Tableware button is clicked in dining room section");
        driver.findElement(tableWareButton).click();
    }

}