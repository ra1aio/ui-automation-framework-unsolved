import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.OpenPageSteps;

public class SearchTest extends BaseTest{

    @Test
    @Description("Поиск заранее известного количества")
    @DisplayName("Поиск заранее известного количества товара")
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
    @Description("Поиск заранее не известного количества")
    @DisplayName("Поиск заранее не известного количества товара")
    void searchForAnUnknownQuantityInAdvance() {
        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickSearchButton()
                .inputSearchString("0195")
                .clickSearchButton()
                .verifySearchResultNotEmpty();
    }
}
