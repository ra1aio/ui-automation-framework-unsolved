package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends ExtendedWebPage {

    @Description("Поле отображения имени аккаунт")
    @FindBy(xpath = "//div[@class='text-bold qa-list-menu-header _account-menu-header_1g7qxv']")
    public WebElement accountName;

    @Description("Account icon")
    @FindBy(xpath = "aeo-icon aeo-icon-account _header-icon-default_1eddlt")
    public WebElement accountIcon;
}
