package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ExtendedWebPage {


    @Description("Модальное окно о принятии печенек")
    @FindBy(xpath = "//div[@class='ot-sdk-container']")
    public WebElement modalWindowAcceptCookies;

    @Description("Кнопка входа в аккаунт")
    @FindBy(xpath = "//a[@class='clickable qa-show-sidetray-account sidetray-account']")
    public WebElement accountButton;

    @Description("Кнопка поиска")
    @FindBy(xpath = "//a[@class='clickable qa-show-sidetray-search sidetray-search']")
    public WebElement searchButton;

    @Description("Кнопка корзины")
    @FindBy(xpath = "//li[@class='relative _utilities-list-item_1eddlt _utilities-cart_1eddlt']")
    public WebElement bagIcon;
}