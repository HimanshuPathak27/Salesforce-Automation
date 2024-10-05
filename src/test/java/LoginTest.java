import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

   public static Locators locators;

    public static void main(String[] args) {

        // This is a login test created for accessing the salesforce platform

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login.salesforce.com/");
       
        driver.findElement(By.xpath(locators.usernameXpath)).sendKeys("himanshupathak2910@resilient-raccoon-k4buyy.com");
        driver.findElement(By.xpath(locators.passwordXpath)).sendKeys("HomoSapiens@1998");
        driver.findElement(By.xpath(locators.loginButtonXpath)).click();
       
        driver.quit();
    }
}
