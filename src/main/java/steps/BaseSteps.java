package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseSteps {

    protected static final MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private static final WebDriver driver = pageFactory.getDriver();

    protected WebElement waitUntilDisplayed(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return webElement;
    }
}
