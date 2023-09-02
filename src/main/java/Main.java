import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;

public class Main {

    public static void main(String[] args) {

        WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();

        webDriverFactory.initialize("Chrome", "116.0.5845.96");
        webDriverFactory.end();
        webDriverFactory.initialize("Firefox", "116.0.3");
        webDriverFactory.end();
    }
}
