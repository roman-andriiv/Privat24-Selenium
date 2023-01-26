package andriiv.pages.telecomunications;

import andriiv.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePhoneReplenishmentPage extends BasePage {
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By inputFromCardNumber = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputExpireDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By buttonAddToCard = By.xpath("//button[@data-qa-node='submit']");


    /**
     * Choose the card from the wallet
     */
    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     *  Enter phone number excluding country code
     *  @param number phone number
     */
    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    /**
     * Enter the amount of money to transfer
     * @param amount the amount of money
     */
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputAmount).clear();
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     * Enter the card number from which you want to make a transfer
     * @param number card number
     */
    public MobilePhoneReplenishmentPage enterCardNumber(String number){
        driver.findElement(inputFromCardNumber).sendKeys(number);
        return this;
    }

    /**
     * Enter CVV Card Code
     * @param cvv CVV Card Code
     */
    public MobilePhoneReplenishmentPage enterCvv(String cvv){
        driver.findElement(inputCvv).sendKeys(cvv);
        return this;
    }

    /**
     * Enter expire date of credit card
     * @param date expire date of credit card
     */
    public MobilePhoneReplenishmentPage enterExpireDate(String date){
        driver.findElement(inputExpireDate).sendKeys(date);
        return this;
    }

    /**
     * Submit transfer
     */
    public MobilePhoneReplenishmentPage submitAddToCard(){
        driver.findElement(buttonAddToCard).click();
        return this;
    }
}
