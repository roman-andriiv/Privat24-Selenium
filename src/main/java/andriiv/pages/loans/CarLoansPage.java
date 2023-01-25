package andriiv.pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {
    WebDriver driver;
    public final By agreementsTab = By.xpath("//div[contains(text(), 'Agreements')]");

    public CarLoansPage(WebDriver driver) {
        this.driver = driver;
    }

    public CarLoansPage selectAgreementsTab(){
        driver.findElement(agreementsTab).click();
        return this;
    }

}
