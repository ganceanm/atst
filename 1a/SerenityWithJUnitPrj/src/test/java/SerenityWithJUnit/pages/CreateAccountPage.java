package SerenityWithJUnit.pages;


import SerenityWithJUnit.features.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.url)
public class CreateAccountPage extends PageObject {

    @FindBy(css = ".account-create")
    private WebElementFacade createAccount;

    @FindBy(id = "firstname")
    private WebElementFacade firstName;

    @FindBy(id = "lastname")
    private WebElementFacade lastName;

    @FindBy(id = "email_address")
    private WebElementFacade emailAddress;

    @FindBy(id = "password")
    private WebElementFacade password;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmation;

    @FindBy(id = "is_subscribed")
    private WebElementFacade isSubscribed;

    @FindBy(xpath = "//button[contains(.,'Register')]")
    private WebElementFacade createButton;

    public Boolean isCreateAccountPage() {
        return createAccount.waitUntilVisible().isVisible();
    }

    public void fillForm() {
        firstName.waitUntilClickable().click();
        firstName.type(Constants.firstName);

        lastName.waitUntilClickable().click();
        lastName.type(Constants.lastName);

        emailAddress.waitUntilClickable().click();
        emailAddress.type(Constants.email);

        password.waitUntilClickable().click();
        password.type(Constants.password);

        confirmation.waitUntilClickable().click();
        confirmation.type(Constants.password);

        isSubscribed.waitUntilClickable().click();
    }

    public void clickCreateButton() {
        createButton.waitUntilClickable().click();
    }

}
