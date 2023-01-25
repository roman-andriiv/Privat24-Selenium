package andriiv.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static andriiv.constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

public class BasePage {
    public WebDriver driver;
    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * The method for navigating to a specific URL
     */
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * Wait for the element visibility on DOM model
     */
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void isAuthWidgetPresent(){
        WebElement authWidgetFrame = driver.findElement(authWidget);
        waitElementIsVisible(authWidgetFrame);
    }
}
