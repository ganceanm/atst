package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.HomePage;
import SerenityWithJUnit.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage;

    @Step
    public void clickCreateAccount(){
        loginPage.openCreateAccountPage();
    }

    @Step
    public void fillLoginForm(){
        loginPage.fillForm();
    }

    @Step
    public void logIn(){
        loginPage.clickLogin();
    }

    @Step
    public void checkIfLoginSuccessful(){
        String URL = loginPage.getDriver().getCurrentUrl();
        Assert.assertEquals("http://qa1.dev.evozon.com/customer/account/", URL);
    }
}
