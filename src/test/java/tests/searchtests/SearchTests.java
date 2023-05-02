package tests.searchtests;

import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SearchTests extends BaseTest {

    private String egal = getBaseUrl();

    String item = "coat";
    String city = "Cluj-Napoca";
    String chat = "Hi";

    @Test

    public void isTheSearchFieldWorking() {
        LOG.info("Starting test Is The Search Field Working");
        landingPage.clickingTheSearchButton();
        searchPage.isSearchFieldOnSearchPageDisplayed();
        searchPage.typeOnSearchField(item);
        searchPage.clickOnTheCoat();
        searchPage.clickOnXsSize();
        searchPage.clickOnCheckInStoreAvailability();
        searchPage.selectXsSizeOnCheckInStore();
        searchPage.clickOnCheckAvailabilityBtn();
        searchPage.typeStreetZonePostcode(city);
        searchPage.clickOnSearchBtnInCheckInStore();
        searchPage.markTheVivoRadioBtn();
        searchPage.clickTheCloseBtnX();
        searchPage.clickDeliveryExchangeReturnButton();
        searchPage.clickTheCloseBtnX();
        searchPage.clickOnChatButton();
        searchPage.typeInsideTheChatField(chat);
        searchPage.sendMessageInChat();
        searchPage.closingTheChatPanel();
        searchPage.closingChatConfirmation();
        driver.get(egal);
    }

}