package tests.landingpagetests;

import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class LandingPageTests extends BaseTest {

    private String egal = getBaseUrl();


    @Test
    public void testingLandingPageFunctionalities() {

        landingPage.isLogoDisplayed();
        landingPage.isHamburgerButtonDisplayed();
        landingPage.isLogInButtonDisplayedd();
        landingPage.isSearchFieldDisplayed();
        landingPage.isHelpButtonDisplayed();
        landingPage.isBasketLogoDisplayed();
        landingPage.isBasketLogoDisplayed();
        landingPage.isAccessibilityButtonDisplayed();
        landingPage.clickHamburgerButton();
        landingPage.isWomanButtonDsiapalyedInHmgButton();
        landingPage.isManButtonDsiapalyedInHmgButton();
        landingPage.isKidsButtonDsiapalyedInHmgButton();
        landingPage.isHomeButtonDsiapalyedInHmgButton();
        landingPage.isBeautyButtonDsiapalyedInHmgButton();
        landingPage.clickingHomeButtonInHmgButton();
        landingPage.clickingDiningRoomSectionInHomeButton();
        landingPage.clickingTablewareButtonInDiningRoomSection();
        driver.get(egal);
        BasePage.sleep(2000);
        landingPage.clickingTheSearchButton();
    }

}