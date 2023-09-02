package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    static WebDriver getWebDriver(String version) {
        WebDriverManager.firefoxdriver().driverVersion(version).setup();
        System.out.println("Firefox driver successfully set up");

        return new FirefoxDriver();
    }
}
