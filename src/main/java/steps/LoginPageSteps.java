package steps;

import htmlelements.pages.LoginSidebarPage;
import org.junit.Assert;

public class LoginPageSteps extends BaseSteps{

    LoginSidebarPage loginSidebarPage() {

        return pageFactory.on(LoginSidebarPage.class);
    }

    public LoginPageSteps clickSingInButton() {
        loginSidebarPage().singInButton.click();

        return this;
    }

    public LoginPageSteps inputLoginAndPass(String email, String password) {
        loginSidebarPage().emailInputField.sendKeys(email);
        loginSidebarPage().passwordInputField.sendKeys(password);


        return this;
    }

    public LoginPageSteps sendingLoginAndPassword() {
        loginSidebarPage().sendingLoginAndPasswordButton.click();

        return this;
    }

    public LoginPageSteps errorEmptyLoginAndPassword() {
        loginSidebarPage().sendingLoginAndPasswordButton.click();
        Assert.assertEquals("Hold up, there's a problem.", loginSidebarPage().loginErrorMessage.getText());

        return this;
    }

    public LoginPageSteps errorShotPassword() {
        loginSidebarPage().sendingLoginAndPasswordButton.click();
        Assert.assertEquals("Please enter a password that contains 8-25 characters with at least one letter and one number."
                , loginSidebarPage().loginErrorMessageShortPassword.getText());

        return this;
    }
}
