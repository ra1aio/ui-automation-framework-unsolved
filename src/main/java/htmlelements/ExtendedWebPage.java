package htmlelements;

import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactoryProvider;

import static org.junit.Assert.assertEquals;

/**
 * This is a wrapper class to avoid issues.
 * It can be also used for extending or overriding WebPage behavior
 */
public abstract class ExtendedWebPage {

    WebDriver driver = WebDriverFactoryProvider.getInstance().getDriver();

    void isAt(Matcher<String> url) {
        assertEquals(driver.getCurrentUrl(), url);
    }

    public void openURL(String url) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized");
        }
        driver.get(url);
    }
}