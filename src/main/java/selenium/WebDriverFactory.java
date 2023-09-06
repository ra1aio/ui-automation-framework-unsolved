package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import tasks.ConfigObjectProvider;

import java.time.Duration;

public class WebDriverFactory {

    public WebDriver webDriver;

    ConfigObjectProvider cfg = new ConfigObjectProvider();

    public void initialize(String typeOfBrowser, String version) {

        if (typeOfBrowser.equals("Chrome")) {
            webDriver = Chrome.getWebDriver(version);
            webDriverSetup();
        }
        if (typeOfBrowser.equals("Firefox")) {
            webDriver = Firefox.getWebDriver(version);
            webDriverSetup();
        }
        if (webDriver == null) {
            System.out.println("WebDriver not set up"); //TODO: Change with log4j logger
        }
    }

    public WebDriver getDriver() {

        return webDriver;
    }

    public void end() {
        webDriver.quit();
        System.out.println("WebDriver is quit");
    }

    private void webDriverSetup() {
        webDriver.manage().window().setSize(new Dimension(cfg.getBrowserWidth(), cfg.getBrowserHeight()));
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(cfg.getTimeout()));
        System.out.println("Web-driver set up"); //TODO: Change with log4j logger
    }
}