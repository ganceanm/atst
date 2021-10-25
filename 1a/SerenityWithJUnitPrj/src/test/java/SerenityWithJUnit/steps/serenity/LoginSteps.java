package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPage loginPage;

    @Step
    public void clickCreateAccount() {
        loginPage.openCreateAccountPage();
    }

    @Step
    public void fillLoginForm() {
        loginPage.fillForm();
    }

    @Step
    public void logIn() {
        loginPage.clickLogin();
    }

}
