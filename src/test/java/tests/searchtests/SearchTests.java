package tests.searchtests;

import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;

import static pages.BasePage.*;

public class SearchTests extends BaseTest {
    private String egal = getBaseUrl();

    String item = "dress";
    String city = "Cluj-Napoca";
    String chat = "Hi";

    @Test

    public void isTheSearchFieldWorking() {
        landingPage.clickingTheSearchButton();
        searchPage.isSearchFieldOnSearchPageDisplayed();
        searchPage.typeOnSearchField(item);
        BasePage.sleep(2000);
        searchPage.clickOnTheRedDress();
        BasePage.sleep(2000);
        searchPage.clickOnXsSize();
        BasePage.sleep(2000);
        searchPage.clickOnCheckInStoreAvailability();
        // searchPage.clickOnAddToBagButton();   ///session expired again///
        searchPage.selectXsSizeOnCheckInStore();
        searchPage.clickOnCheckAvailabilityBtn();
        searchPage.typeStreetZonePostcode(city);
        searchPage.clickOnSearchBtnInCheckInStore();
        searchPage.markTheVivoRadioBtn();
        searchPage.clickTheCloseBtnX();
        BasePage.sleep(3000);
        searchPage.clickDeliveryExchangeReturnButton();
        BasePage.sleep(3000);
        searchPage.clickTheCloseBtnX();
        //searchPage.clickOnChatButton();
       // BasePage.sleep(3000);
        //searchPage.typeInsideTheChatField(chat);
       // BasePage.sleep(6000);
       // searchPage.sendMessageInChat();
       // BasePage.sleep(2000);
       // searchPage.closingTheChatPanel();
       // searchPage.closingChatConfirmation();
       // BasePage.sleep(6000);
        driver.get(egal);
        BasePage.sleep(3000);
    }
}