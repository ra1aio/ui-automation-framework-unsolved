package htmlelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.WebDriverFactoryProvider;

public class MyPageFactory {

    public <T extends ExtendedWebPage> T on(Class<T> webpage) {
        WebDriver wd = getDriver();

        return PageFactory.initElements(wd, webpage);
    }

    public WebDriver getDriver() {

        return WebDriverFactoryProvider.getInstance().getDriver();
    }
}