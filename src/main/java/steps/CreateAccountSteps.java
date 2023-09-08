package steps;

import htmlelements.pages.CreateAccountPage;

public class CreateAccountSteps extends BaseSteps {

    CreateAccountPage createAccountPage() {

        return pageFactory.on(CreateAccountPage.class);
    }

    public CreateAccountSteps inputEmail(String email) {
        createAccountPage().emailInputField.sendKeys(email);

        return this;
    }

    public CreateAccountSteps inputFirstName(String firstName) {
        createAccountPage().firstNameInputField.sendKeys(firstName);

        return this;
    }

    public CreateAccountSteps inputLastName(String lastName) {
        createAccountPage().lastNameInputField.sendKeys(lastName);

        return this;
    }

    public CreateAccountSteps inputPassword(String password) {
        createAccountPage().passwordInputField.sendKeys(password);

        return this;
    }

    public CreateAccountSteps inputConfirmPassword(String password) {
        createAccountPage().confirmPasswordInputField.sendKeys(password);

        return this;
    }

    public CreateAccountSteps inputZipCode(String zipCode) {
        createAccountPage().zipCodeInputField.sendKeys(zipCode);

        return this;
    }

    public CreateAccountSteps selectMonth() {
        createAccountPage().monthOfBirthSelectionList.click();

        return this;
    }

    public CreateAccountSteps selectDay() {
        createAccountPage().dayOfBirthSelectionList.click();

        return this;
    }

    public CreateAccountSteps clickCheckBox() {
        createAccountPage().acceptTermsCheckBox.click();

        return this;
    }

    public AccountVerificationSteps clickCreateAccountButton() {
        createAccountPage().createAccountButton.click();

        return new AccountVerificationSteps();
    }
}
