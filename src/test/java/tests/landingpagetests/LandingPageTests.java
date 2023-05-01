package tests.landingpagetests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class LandingPageTests extends BaseTest {

    private String egal = getBaseUrl();

    @Test
    public void testingLandingPageFunctionalities() {
        LOG.info("Starting test Landing page functionalities");
        landingPage.isLogoDisplayed();
        landingPage.isHamburgerButtonDisplayed();
        landingPage.isLogInButtonDisplayed();
        landingPage.isSearchFieldDisplayed();
        landingPage.isHelpButtonDisplayed();
        landingPage.isBasketLogoDisplayed();
        landingPage.isBasketLogoDisplayed();
        landingPage.isAccessibilityButtonDisplayed();
        landingPage.clickHamburgerButton();
        landingPage.isWomanButtonDisplayedInHmgButton();
        landingPage.isManButtonDisplayedInHmgButton();
        landingPage.isKidsButtonDisplayedInHmgButton();
        landingPage.isHomeButtonDisplayedInHmgButton();
        landingPage.isBeautyButtonDisplayedInHmgButton();
        landingPage.clickingHomeButtonInHmgButton();
        landingPage.clickingDiningRoomSectionInHomeButton();
        landingPage.clickingTablewareButtonInDiningRoomSection();
        driver.get(egal);
        landingPage.clickingTheSearchButton();
    }

}