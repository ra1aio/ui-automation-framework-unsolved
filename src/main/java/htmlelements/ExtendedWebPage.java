package htmlelements;

import org.hamcrest.Matcher;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

/**
 * This is a wrapper class to avoid issues.
 * It can be also used for extending or overriding WebPage behavior
 */
public abstract class ExtendedWebPage {

    WebDriver driver;

    void isAt(Matcher<String> url) {
        //TODO: напишите метод проверки на какой странице мы находимся и сравнение этого с url - используйте assertEquals
    }

    public void openURL(String url) {
        //TODO: Напишите реализацию метода, который будет открывать страницу с адресом url
    }
}
