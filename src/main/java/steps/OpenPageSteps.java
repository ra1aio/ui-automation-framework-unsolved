package steps;

import htmlelements.pages.HomePage;

public class OpenPageSteps extends BaseSteps {

    private HomePage homePage() { return pageFactory.on(HomePage.class); } // use .on method of MyPageFactoryProvider

    public HomePageSteps openHomepage() {
        pageFactory.getDriver().get("https://www.ae.com/us/en"); //TODO: реализуйте добавление значения URL через конфиг провайдер
        System.out.println("Home page opened");
        return new HomePageSteps();  /*since homepage is opened after opening page, openHomepage() will give you access
         to HomePageSteps*/ }
}
