import main.ScenarioContext;
import main.ScenarioContextProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import selenium.WebDriverFactory;
import selenium.WebDriverFactoryProvider;
import tasks.ConfigObjectProvider;

import java.time.Duration;

public class BaseTest {

    static final ConfigObjectProvider cfg = new ConfigObjectProvider();

    private static WebDriverFactory webDriverFactory = WebDriverFactoryProvider.getInstance();

    public ScenarioContext scenarioContext = ScenarioContextProvider.getInstance();

    @BeforeEach
    public void setUpWebDriver() {
        webDriverFactory.initialize(cfg.getBrowser(), cfg.getChromeDriver());
        webDriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriverFactory.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @AfterEach
    public void endWebDriver() {
        scenarioContext.removeAll();
        webDriverFactory.end();
    }
}
