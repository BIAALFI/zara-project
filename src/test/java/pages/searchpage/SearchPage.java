package pages.searchpage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;


public class SearchPage extends BasePage {
    public static SearchPage getInstance() {
        if (instance == null) {
            instance = new SearchPage();
        }
        return instance;
    }

    public static final Logger LOG = LoggerFactory.getLogger(SearchPage.class);
    public static SearchPage instance;


    private final By searchFieldOnSearchPage = By.id("search-products-form-combo-input");
    private final By redDressItem = By.xpath("//img[contains(@alt, 'Image 0 of DRESS WITH A SWEETHEART')]/parent::div");
    private final By selectXsSize = By.xpath("(//span[@class='product-size-info__main-label'])[1]");
    private final By clickAddToBagButton = By.xpath("(//div[@class='zds-button__lines-wrapper'])[1]");
    private final By checkInStoreAvailability = By.xpath("(//button[@class='product-detail-actions__action-button'])[2]");
    private final By selectXsSizeOnCheckInStoreAv = By.xpath("(//div[@class='form-input multi-size-selector__size'])[1]");
    private final By checkAvailabilityBtn = By.xpath("(//div[@class='zds-button__lines-wrapper'])[3]");
    private final By streetZonePostcode = By.xpath("(//input[@class='form-input-label__input form-input-text__input'])[2]");
    private final By searchButtonInCheckInStore = By.xpath("//button[@class='zds-button location-search-form__submit zds-button--secondary']");
    private final By radioButton = By.xpath("(//div[@class='form-input-radio__icon'])[2]");
    private final By closeBtnX = By.xpath("(//button[@aria-label='close'])[3]");
    private final By deliveryExchangeReturnButton = By.xpath("(//button[@class='product-detail-actions__action-button'])[3]");
    private final By chatButton = By.xpath("//button[@class='tray__button']");
    private final By typeInChatField = By.xpath("//input[@name='chat-message-box']");
    private final By sendMsgInChatField = By.xpath("(//button[@class='chat-writer__button'])[2]");
    private final By chatPanelCloseBtn = By.xpath("//button[@class='chat-panel__close']");
    private final By closeConversation = By.xpath("(//div[@class='zds-button__lines-wrapper'])[4]");


    public void isSearchFieldOnSearchPageDisplayed() {
        LOG.info("Search field is displayed");
        Assert.assertTrue(driver.findElement(searchFieldOnSearchPage).isDisplayed());
    }

    public void typeOnSearchField(String item) {
        LOG.info("Type dress on search field");
        driver.findElement(searchFieldOnSearchPage).sendKeys(item);
    }

    public void clickOnTheRedDress() {
        LOG.info("The white dress is selected");
        driver.findElement(redDressItem).click();
    }

    public void clickOnXsSize() {
        LOG.info("Selecting xs size for the white dress");
        driver.findElement(selectXsSize).click();

    }

    public void clickOnAddToBagButton() {
        LOG.info("Clicking on add to bag button");
        driver.findElement(clickAddToBagButton).click();
    }

    public void clickOnCheckInStoreAvailability() {
        LOG.info("Clicking on the check in store availability button");
        driver.findElement(checkInStoreAvailability).click();
    }

    public void selectXsSizeOnCheckInStore() {
        LOG.info("Select xs size on the check in store availability");
        driver.findElement(selectXsSizeOnCheckInStoreAv).click();
    }

    public void clickOnCheckAvailabilityBtn() {
        LOG.info("Click on check availability button");
        driver.findElement(checkAvailabilityBtn).click();
    }

    public void typeStreetZonePostcode(String city) {
        LOG.info("Typing the street, zone or postcode");
        driver.findElement(streetZonePostcode).sendKeys(city);
    }

    public void clickOnSearchBtnInCheckInStore() {
        LOG.info("Clicking the search button in the check in store section");
        driver.findElement(searchButtonInCheckInStore).click();
    }

    public void markTheVivoRadioBtn() {
        LOG.info("Marking the vivo cluj napoca radio button");
        driver.findElement(radioButton).click();
    }

    public void clickTheCloseBtnX() {
        LOG.info("Clicking the close button x ");
        driver.findElement(closeBtnX).click();
    }

    public void clickDeliveryExchangeReturnButton() {
        LOG.info("Clicking the deliveryExchangeReturnButton");
        driver.findElement(deliveryExchangeReturnButton).click();
    }

    public void clickOnChatButton() {
        LOG.info("Clicking the chat button");
        driver.findElement(chatButton).click();
    }

    public void typeInsideTheChatField(String chat) {
        LOG.info("Typing in the chat field");
        driver.findElement(typeInChatField).sendKeys(chat);
    }

    public void sendMessageInChat() {
        LOG.info("Sending the msg in the chat");
        driver.findElement(sendMsgInChatField).click();
    }

    public void closingTheChatPanel() {
        LOG.info("Closing the chat panel");
        driver.findElement(chatPanelCloseBtn).click();
    }

    public void closingChatConfirmation() {
        LOG.info("Confirm closing chat");
        driver.findElement(closeConversation).click();
    }

}