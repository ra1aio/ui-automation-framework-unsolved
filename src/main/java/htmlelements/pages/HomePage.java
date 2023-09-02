package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ExtendedWebPage {

    @FindBy(xpath = "//a[@class='clickable qa-show-sidetray-account sidetray-account']")
    public WebElement accountButton;

    @FindBy(xpath = "//li[@class='tnav-myaeo hidden-on-affix _utilities-list-item_1eddlt _utilities-account_1eddlt']")
    public WebElement accountIcon;

    @FindBy(xpath = "//a[@class='clickable qa-show-sidetray-search sidetray-search']")
    public WebElement searchButton;

    @FindBy(xpath = "//li[@class='relative _utilities-list-item_1eddlt _utilities-cart_1eddlt']incl")
    public WebElement bagIcon;
}