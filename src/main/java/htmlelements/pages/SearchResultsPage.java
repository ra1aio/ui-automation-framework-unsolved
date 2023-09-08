package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends ExtendedWebPage {

    @Description("Список результатов поиска")
    @FindBy(xpath = "//div[@class='product-tile qa-product-tile __eadf2']")
    public List<WebElement> searchResultList;
}