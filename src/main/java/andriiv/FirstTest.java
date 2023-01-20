package andriiv;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void testSearchGoogle(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        WebElement btnAccept = driver.findElement(By.id("L2AGLb"));
        btnAccept.click();

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium WebDriver");
        searchField.submit();

        driver.quit();
    }
}
