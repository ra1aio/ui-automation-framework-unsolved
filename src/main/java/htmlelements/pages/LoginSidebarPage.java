package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSidebarPage extends ExtendedWebPage {

    @Description("Кнопка открытия панели ввода логина и пароля")
    //@FindBy(xpath = "//button[@class='btn btn-primary qa-btn-login   btn-block']")
    @FindBy(xpath = "//button[@class='btn btn-secondary qa-btn-signin   btn-sm btn-action']")
    public WebElement singInButton;

    @Description("Поле ввода email")
    @FindBy(xpath = "//input[@class='form-control form-control form-input-username']")
    public WebElement emailInputField;

    @Description("Поле ввода пароля")
    @FindBy(xpath = "//input[@class='form-control form-control form-input-password']")
    public WebElement passwordInputField;

    @Description("Кнопка отправки логина и пароля")
    @FindBy(xpath = "//button[@class='btn btn-primary qa-btn-login   btn-block']")
    public WebElement sendingLoginAndPasswordButton;

    @Description("Сообщение об ошибки при пустом логине и пароле")
    @FindBy(xpath = "//div[@class='msgs error-msg qa-login-error-title _error-msg-headline_1e04gy']" +
            "/h6[@class='alert-header alert-danger']")
    public WebElement loginErrorMessage;

    @Description("Сообщение об ошибки при вводе пароля короче минимальной длины")
    @FindBy(xpath = "//div[@class='ember-view help-block qa-error-help-block has-error']")
    public WebElement loginErrorMessageShortPassword;
}
