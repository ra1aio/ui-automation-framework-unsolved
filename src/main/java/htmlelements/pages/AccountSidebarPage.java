package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSidebarPage extends ExtendedWebPage {

    @Description("Кнопка выхода из личного кабинета")
    @FindBy(xpath = "//div[@class='modal-body']/button[@class='btn btn-secondary    btn-sign-out']")
    public WebElement singOutButton;
}
