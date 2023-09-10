package steps;

import htmlelements.pages.AccountSidebarPage;
import htmlelements.pages.HomePage;

public class AccountSidebarSteps extends BaseSteps{

    AccountSidebarPage accountSidebarPage() {

        return pageFactory.on(AccountSidebarPage.class);
    }

    public HomePage clickSingOutButton() {
        accountSidebarPage().singOutButton.click();

        return new HomePage();
    }
}
