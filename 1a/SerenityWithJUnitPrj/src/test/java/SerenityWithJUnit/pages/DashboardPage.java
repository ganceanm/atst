package SerenityWithJUnit.pages;


import SerenityWithJUnit.features.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.url)
public class DashboardPage extends PageObject {

    @FindBy(css = ".my-account")
    private WebElementFacade myAccount;

    public Boolean isOnDashboard() {
        return myAccount.waitUntilVisible().isVisible();
    }
}
