import jdk.jfr.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;
import utils.RandomUtils;

import static main.ContextConstant.*;

public class CreatingAccountAndLoggingInTest extends BaseTest{

    @Description("Создание нового аккаунта и в ход в него с помощью scenarioContext")
    @Test
    @DisplayName("Создание аккаунта. Вход в него. Используется scenarioContext")
    @Disabled("Регистрация новых аккаунтов тоже перестала работать через тесты. Поэтому данный тест тоже падает")
    void creatingAccountAndLoggingInTestWithScenarioContext() {
        scenarioContext.put(EMAIL, RandomUtils.getEmail("gmail.com"));
        scenarioContext.put(FIRSTNAME, "Ivan");
        scenarioContext.put(PASSWORD, "Pa$$w0rd");

        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickCreateAccountButton()
                .inputEmail(scenarioContext.get(EMAIL))
                .inputFirstName(scenarioContext.get(FIRSTNAME))
                .inputLastName("Ivanov")
                .inputPassword(scenarioContext.get(PASSWORD))
                .inputConfirmPassword(scenarioContext.get(PASSWORD))
                .inputZipCode("00772")
                .selectMonth()
                .selectDay()
                .clickCheckBox()
                .clickCreateAccountButton()
                .openLoginSidebarPage()
                .clickSingOutButton();
    }
}
