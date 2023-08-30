package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BaseSteps {

    protected static final MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private static final WebDriver driver = pageFactory.getDriver();

    protected Wait<WebDriver> waitFor = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(5))
            .pollingEvery(Duration.ofMillis(300))
            .ignoring(ElementNotInteractableException.class);

}
