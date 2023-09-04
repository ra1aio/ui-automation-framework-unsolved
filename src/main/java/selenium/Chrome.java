package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    static WebDriver getWebDriver(String version) {
        WebDriverManager.chromedriver().driverVersion(version).setup();
        System.out.println("Chrome driver successfully set up");

        return new ChromeDriver();
    }
}