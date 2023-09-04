package steps;

import htmlelements.pages.SearchResultsPage;

import static org.junit.Assert.*;

public class SearchResultsPageSteps extends BaseSteps{

    SearchResultsPage searchResultsPage() {

        return pageFactory.on(SearchResultsPage.class);
    }

    public SearchResultsPageSteps verifySearchResult() {
        assertTrue(!searchResultsPage().searchResultList.isEmpty());

        return this;
    }

    public SearchResultsPageSteps verifySearchResult(int expectedQuantity) {
        assertEquals(searchResultsPage().searchResultList.size(), expectedQuantity);

        return this;
    }
}
