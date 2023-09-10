package steps;

import htmlelements.pages.AccountPage;
import org.junit.Assert;

public class AccountVerificationSteps extends BaseSteps{

    AccountPage accountPage() {

        return pageFactory.on(AccountPage.class);
    }

    public AccountVerificationSteps verificationAccount(String name) {
        Assert.assertEquals(name + "'s Account", accountPage().accountName.getText());

        return this;
    }

    public AccountSidebarSteps openLoginSidebarPage() {
        accountPage().accountIcon.click();
        return new AccountSidebarSteps();
    }
}
