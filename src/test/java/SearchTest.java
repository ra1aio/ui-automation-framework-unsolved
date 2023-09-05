import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;

public class SearchTest extends BaseTest{

    @Test
    @Description("Поиск заранее известного количества")
    void searchForPreKnownQuantity() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickSearchButton()
                .inputSearchString("0195-2078")
                .clickSearchButton()
                .verifySearchResult(1);
    }

    @Test
    @Description("Поиск заранее известного количества")
    void searchForAnUnknownQuantityInAdvance() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickSearchButton()
                .inputSearchString("0195")
                .clickSearchButton()
                .verifySearchResult();
    }
}
