package htmlelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyPageFactory {

    public <T extends ExtendedWebPage> T on(Class<T> webpage) {
        WebDriver wd = getDriver();
        return PageFactory.initElements(wd, webpage);
    }

    public WebDriver getDriver() {
        return null; //TODO: Here you need to pass WebDriver instance from WebDriverFactory.get();
    }
}
