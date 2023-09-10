import jdk.jfr.Description;
import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.Test;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest{

    @Test
    @Description("Данные корректны. Позитивный кейс")
    @DisplayName("Успешный вход в ЛК")
    @Ignore("Как мне кажется, тест должен выглядеть как-то так. Но из-за ошибки при входе проверить это не получается")
    public void successfulLogin() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .refreshPage()
                .clickOpenLoginPanelButton()
                .clickSingInButton()
                .inputLoginAndPass(cfg.getEmail(), cfg.getPassword())
                .sendingLoginAndPassword()
                .loginSuccessful();
    }

    @Test
    @Description("Вход с пустым логином и паролем. Негативный кейс")
    @DisplayName("ход с пустым логином и паролем")
    public void unSuccessfulLogin() {
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
    @DisplayName("Вход с паролем недопустимой длины")
    public void unSuccessfulLoginShotPassword() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickSingInButton()
                .inputLoginAndPass(cfg.getEmail(), "1")
                .sendingLoginAndPassword()
                .errorShotPassword();
    }

    @Test
    @Description("Вход с неверным паролем. Негативный кейс")
    @DisplayName("Вход с неверным паролем")
    @Ignore("Здесь та же самая ситуация, что и с тестом на вход")
    public void unSuccessfulLoginIncorrectPassword() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickSingInButton()
                .inputLoginAndPass(cfg.getEmail(), "sdf1asdwerdfs")
                .sendingLoginAndPassword()
                .errorIncorrectPassword();
    }
}
