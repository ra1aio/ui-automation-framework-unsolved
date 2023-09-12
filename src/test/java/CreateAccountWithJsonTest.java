import jdk.jfr.Description;
import main.ProfileClass;
import org.junit.Test;
import steps.OpenPageSteps;

import java.io.FileNotFoundException;

import static main.ProfileClass.createProfileFromJson;

public class CreateAccountWithJsonTest extends BaseTest{

    ProfileClass profile;

    {
        try {
            profile = createProfileFromJson("src/main/resources/accounts.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

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
