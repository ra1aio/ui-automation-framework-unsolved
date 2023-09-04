package steps;

import htmlelements.pages.HomePage;
import tasks.ConfigObjectProvider;

public class OpenPageSteps extends BaseSteps {

    ConfigObjectProvider configObjectProvider = new ConfigObjectProvider();

    private HomePage homePage() {

        return pageFactory.on(HomePage.class);
    }

    public HomePageSteps openHomepage() {
        pageFactory.getDriver().get(configObjectProvider.getHomepageUrl());
        System.out.println("Home page opened");

        return new HomePageSteps();
    }
}