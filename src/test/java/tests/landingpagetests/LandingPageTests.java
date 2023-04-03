package tests.landingpagetests;

import org.testng.annotations.Test;
import tests.BaseTest;


public class LandingPageTests extends BaseTest {
    //TODO: IMI FAC TOT INTR UN SINGUR TEST!!!


    @Test
    public void isZaraHomePageDisplayed() {
        landingPage.isLogoDisplayed();
    }

    @Test
    public void isTheHamburgerButtonDisplayed() {
        landingPage.isHamburgerButtonDisplayed();
    }

    @Test
    public void isLogInButtonDisplayed() {
        landingPage.isLogInButtonDisplayedd();
    }

    @Test
    public void isSearchFieldDisplayed() {
        landingPage.isSearchFieldDisplayed();
    }

    @Test
    public void isHelpButtonDisplayed() {
        landingPage.isHelpButtonDisplayed();
    }

    @Test
    public void isTheBasketLogoDisplayed() {
        landingPage.isBasketLogoDisplayed();
    }

    @Test
    public void isAccessibilityButtonDisplayed() {
        landingPage.isAccessibilityButtonDisplayed();
    }

    @Test
    public void clickingTheHamburgerButton() {
        landingPage.clickHmaburgerButton();
    }

    @Test
    public void openingHamburgerButton() {
        landingPage.clickOnAcceptCookie();
        landingPage.clickHmaburgerButton();
        landingPage.isWomanButtonDsiapalyedInHmgButton();
        landingPage.isManButtonDsiapalyedInHmgButton();
        landingPage.isKidsButtonDsiapalyedInHmgButton();
        landingPage.isHomeButtonDsiapalyedInHmgButton();
        landingPage.isBeautyButtonDsiapalyedInHmgButton();
        landingPage.clickingHomeButtonInHmgButton();
        landingPage.clickingDiningRoomSectionInHomeButton();
        landingPage.clickingTablewareButtonInDiningRoomSection();
    }

}