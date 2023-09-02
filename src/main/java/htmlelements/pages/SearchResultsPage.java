package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends ExtendedWebPage {

    @FindBy(xpath = "//div[@class='results-list qa-search-results-list']")
    public List<WebElement> searchResultList;
}