package steps;

import htmlelements.pages.HomePage;

public class HomePageSteps extends BaseSteps{

    private HomePage homePage() {

        return pageFactory.on(HomePage.class);
    }

    public HomePageSteps acceptPrivacyModal() {
        waitUntilDisplayed(homePage().acceptCookiesButton).click();

        return this;
    }

    public SearchSteps clickSearchButton() {
        homePage().searchButton.click();

        return new SearchSteps();
    }

    public LoginPageSteps clickOpenLoginPanelButton() {
        homePage().openingAccountControlPanelButton.click();

        return new LoginPageSteps();
    }
}
