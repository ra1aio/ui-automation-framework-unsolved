import org.junit.After;
import org.junit.Before;

public class BaseTest {
    //TODO: создайте private static final ConfigObjectProvider

    //TODO: Задайте инстанс WebDriverFactory

    @Before
    public void setUpWebDriver() {
        //TODO: Реализуйте инициализацию вебДрайвера

        //Рекомендую применить таймаут webDriverFactory.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @After
    public void endWebDriver() {
        //TODO: Реализуйте закрытие вебДрайвера
    }

}
