import jdk.jfr.Description;
import org.junit.Test;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest{

    @Test
    @Description("Данные корректны. Позитивный кейс")
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
