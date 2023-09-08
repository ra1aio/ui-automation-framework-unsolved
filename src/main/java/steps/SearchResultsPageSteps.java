package steps;

import htmlelements.pages.SearchResultsPage;

import static org.junit.Assert.*;

public class SearchResultsPageSteps extends BaseSteps{

    SearchResultsPage searchResultsPage() {

        return pageFactory.on(SearchResultsPage.class);
    }

    public SearchResultsPageSteps verifySearchResultNotEmpty() {
        assertFalse(searchResultsPage().searchResultList.isEmpty());

        return this;
    }

    public SearchResultsPageSteps verifySearchResult(int expectedQuantity) {
        assertEquals(expectedQuantity, searchResultsPage().searchResultList.size());

        return this;
    }
}
