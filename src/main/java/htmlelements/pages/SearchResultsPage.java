package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends ExtendedWebPage {

    @Description("Список результатов поиска")
    @FindBy(xpath = "//div[@class='results-list qa-search-results-list']")
    public List<WebElement> searchResultList;
}