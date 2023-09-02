package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrivacySettingsModal extends ExtendedWebPage {

    @FindBy(xpath = "//div[@class='banner-actions-container']/button[@id='onetrust-accept-btn-handler']")
    public WebElement cookiesAcceptButton;
}