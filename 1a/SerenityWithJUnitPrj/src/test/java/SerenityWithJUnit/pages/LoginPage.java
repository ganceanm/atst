package SerenityWithJUnit.pages;


import SerenityWithJUnit.features.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.url)
public class LoginPage extends PageObject {

    @FindBy(xpath  = "//a[contains(.,'Create an Account')]")
    private WebElementFacade createButton;

    @FindBy(id = "email")
    private WebElementFacade email;

    @FindBy(id = "pass")
    private WebElementFacade password;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    public void openCreateAccountPage() {
        createButton.waitUntilClickable().click();
    }

    public void fillForm(){
        email.waitUntilClickable().click();
        email.type(Constants.email);

        password.waitUntilClickable().click();
        password.type(Constants.password);
    }

    public void clickLogin(){
        loginButton.waitUntilClickable().click();
    }
}
