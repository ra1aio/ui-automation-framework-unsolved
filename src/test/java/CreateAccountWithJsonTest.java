import jdk.jfr.Description;
import org.junit.Test;
import steps.OpenPageSteps;

public class CreateAccountWithJsonTest extends BaseTest{

    @Test
    @Description("Данные корректны. Позитивный кейс")
    public void createNewAccount() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickOpenLoginPanelButton()
                .clickCreateAccountButton()
                .inputEmail(profile.getEmail())
                .inputFirstName(profile.getFirstName())
                .inputLastName(profile.getLastName())
                .inputPassword(profile.getPassword())
                .inputConfirmPassword(profile.getPassword())
                .inputZipCode(profile.getZipCode())
                .selectMonth()
                .selectDay()
                .clickCheckBox()
                .clickCreateAccountButton()
                .verificationAccount(profile.getFirstName());
    }
}
