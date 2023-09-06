package steps;

import htmlelements.pages.SearchSidebar;

public class SearchSteps extends BaseSteps{

    SearchSidebar searchSidebar() {

        return pageFactory.on(SearchSidebar.class);
    }

    public SearchSteps inputSearchString(String text){
        waitUntilDisplayed(searchSidebar().inputSearch).sendKeys(text);

        return this;
    }

    public SearchResultsPageSteps clickSearchButton() {
        searchSidebar().searchButton.click();

        return new SearchResultsPageSteps();
    }
}
