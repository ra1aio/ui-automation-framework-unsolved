import jdk.jfr.Description;
import org.junit.Test;
import steps.OpenPageSteps;

public class TestTest extends BaseTest{

    @Test
    @Description("Поиск заранее известного количества")
    public void searchForPreKnownQuantity() {
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
    public void searchForAnUnknownQuantityInAdvance() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickSearchButton()
                .inputSearchString("0195")
                .clickSearchButton()
                .verifySearchResultNotEmpty();
    }
}
