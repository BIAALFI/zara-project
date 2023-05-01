package pages.searchpage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;


public class SearchPage extends BasePage {

    private SearchPage() {

    }

    public static SearchPage getInstance() {
        if (instance == null) {
            instance = new SearchPage();
        }
        return instance;
    }

    public static SearchPage instance;


    private final By searchFieldOnSearchPage = By.id("search-products-form-combo-input");
    private final By CoatItem = By.xpath("//img[@alt='Image 0 of TRENCH COAT WITH TABS AND BELT from Zara']");
    private final By selectXsSize = By.xpath("(//span[@class='product-size-info__main-label'])[1]");
    private final By clickAddToBagButton = By.xpath("(//div[@class='zds-button__lines-wrapper'])[1]");
    private final By checkInStoreAvailability = By.xpath("(//button[@class='product-detail-actions__action-button'])[2]");
    private final By selectXsSizeOnCheckInStoreAv = By.xpath("(//div[@class='form-input__wrapper'])[2]");
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
        LOG.info("Type coat on search field");
        driver.findElement(searchFieldOnSearchPage).sendKeys(item);
    }

    public void clickOnTheCoat() {
        LOG.info("The white dress is selected");
        driver.findElement(CoatItem).click();
    }

    public void clickOnXsSize() {
        LOG.info("Selecting xs size for the dress");
        driver.findElement(selectXsSize).click();
    }

    public void clickOnAddToBagButton() {
        LOG.info("Clicking on add to bag button");
        driver.findElement(clickAddToBagButton).click();
    }

    public void clickOnCheckInStoreAvailability() {
        LOG.info("Clicking on the check in store availability button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkInStoreAvailability));
        driver.findElement(checkInStoreAvailability).click();
    }

    public void selectXsSizeOnCheckInStore() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(selectXsSizeOnCheckInStoreAv));
        BasePage.sleep(2000);
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
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(radioButton));
        LOG.info("Marking the Vivo Cluj Napoca radio button");
        driver.findElement(radioButton).click();
    }

    public void clickTheCloseBtnX() {
        LOG.info("Clicking the close button x ");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(closeBtnX));
        BasePage.sleep(3000);
        driver.findElement(closeBtnX).click();
    }

    public void clickDeliveryExchangeReturnButton() {
        LOG.info("Clicking the deliveryExchangeReturnButton");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        BasePage.sleep(4000);
        wait.until(ExpectedConditions.presenceOfElementLocated(deliveryExchangeReturnButton));
        driver.findElement(deliveryExchangeReturnButton).click();
    }

    public void clickOnChatButton() {
        LOG.info("Clicking the chat button");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(chatButton));
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