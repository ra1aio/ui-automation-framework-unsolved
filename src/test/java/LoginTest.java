import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest{

    @Test
    @Description("Данные корректны. Позитивный кейс")
    void successfulLogin() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickSingInButton()
                .inputLoginAndPass(cfg.getEmail(), cfg.getPassword());
    }

    @Test
    @Description("Вход с пустым логином и паролем. Негативный кейс")
    void unSuccessfulLogin() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickSingInButton()
                .sendingLoginAndPassword()
                .errorEmptyLoginAndPassword();
    }

    @Test
    @Description("Вход с паролем недопустимой длины. Негативный кейс")
    void unSuccessfulLoginShotPassword() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickSingInButton()
                .inputLoginAndPass(cfg.getEmail(), "1")
                .sendingLoginAndPassword()
                .errorShotPassword();
    }
}
