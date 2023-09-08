package htmlelements.pages;

import htmlelements.ExtendedWebPage;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends ExtendedWebPage {

    @Description("Поле ввода email")
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailInputField;

    @Description("Поле ввода имени")
    @FindBy(xpath = "//input[@class='form-control form-control form-input-firstname']")
    public WebElement firstNameInputField;

    @Description("Поле ввода фамилии")
    @FindBy(xpath = "//input[@class='form-control form-control form-input-lastname']")
    public WebElement lastNameInputField;

    @Description("Поле ввода пароля")
    @FindBy(xpath = "//div[@class='form-group aeo-input qa-input-password']" +
            "/input[@class='form-control form-control form-input-password']")
    public WebElement passwordInputField;

    @Description("Поле ввода подтверждения пароля ")
    @FindBy(xpath = "//input[@class='form-control form-control form-input-confirm-password']")
    public WebElement confirmPasswordInputField;

    @Description("Поле ввода zipCode")
    @FindBy(xpath = "//input[@class='form-control form-control form-input-postal-code']")
    public WebElement zipCodeInputField;

    @Description("Список выбора месяца рождения")
    @FindBy(xpath = "//select[@name='month']/option[text()='April']")
    public WebElement monthOfBirthSelectionList;

    @Description("Список выбора дня рождения")
    @FindBy(xpath = "//select[@name='day']/option[text()='1']")
    public WebElement dayOfBirthSelectionList;

    @Description("Чек-бокс согласия с условиями")
    @FindBy(xpath = "//label[@class='aeo-checkbox-label clickable']")
    public WebElement acceptTermsCheckBox;

    @Description("Кнопка создания учетной записи")
    @FindBy(xpath = "//button[@name='register']")
    public WebElement createAccountButton;
}
