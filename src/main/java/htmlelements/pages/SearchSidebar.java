package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchSidebar extends ExtendedWebPage {

    @FindBy(xpath = "//input[contains(@class, 'form-control form-control form-input-search')]")
    public WebElement inputSearch;

    @FindBy(xpath = "//button[contains(@class, 'btn-link    btn search-btn')]")
    public WebElement searchButton;
}