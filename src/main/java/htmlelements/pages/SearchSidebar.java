package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchSidebar extends ExtendedWebPage {

    @Description("Кнопка открытия поиска")
    @FindBy(xpath = "//input[contains(@class, 'form-control form-control form-input-search')]")
    public WebElement inputSearch;

    @Description("Кнопка поиска")
    @FindBy(xpath = "//button[contains(@class, 'btn-link    btn search-btn')]")
    public WebElement searchButton;
}