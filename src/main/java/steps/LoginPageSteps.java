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

    public CreateAccountSteps clickCreateAccountButton() {
        loginSidebarPage().createAccountButton.click();

        return new CreateAccountSteps();
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

    public LoginPageSteps loginSuccessful() {
        Assert.assertTrue(loginSidebarPage().windowTitleAfterSuccessfulLogin.getText().contains("s Account"));
        Assert.assertTrue(loginSidebarPage().singOutButton.isDisplayed());

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
                , loginSidebarPage().loginErrorMessagePassword.getText());

        return this;
    }

    public LoginPageSteps errorIncorrectPassword() {
        loginSidebarPage().sendingLoginAndPasswordButton.click();
        Assert.assertEquals("Your user name and password are incorrect."
                , loginSidebarPage().loginErrorMessagePassword.getText());

        return this;
    }
}
