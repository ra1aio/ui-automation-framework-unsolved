import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import steps.OpenPageSteps;
import utils.RandomUtils;

public class CreateAccountTest extends BaseTest{

    @Test
    @Description("Данные корректны. Позитивный кейс")
    @DisplayName("Создание нового аккаунта")
    void createNewAccount() {
        String name = "Vlad";
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickCreateAccountButton()
                .inputEmail(RandomUtils.getEmail("gmail.com"))
                .inputFirstName(name)
                .inputLastName("Ivanov")
                .inputPassword("Pa$$w0rd")
                .inputConfirmPassword("Pa$$w0rd")
                .inputZipCode("00772")
                .selectMonth()
                .selectDay()
                .clickCheckBox()
                .clickCreateAccountButton()
                .verificationAccount(name);
    }
}
