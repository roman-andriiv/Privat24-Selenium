package andriiv.pages.telecomunications;

import andriiv.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePhoneReplenishmentPage extends BasePage {
    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");

    public MobilePhoneReplenishmentPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }
}
