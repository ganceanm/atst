package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.CreateAccountPage;
import SerenityWithJUnit.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CreateAccountSteps {

    CreateAccountPage createAccountPage;

    @Step
    public void fillForm(){
        Assert.assertEquals(true,createAccountPage.isCreateAccountPage());
        createAccountPage.fillForm();
    }

    @Step
    public void clickRegister(){
        createAccountPage.clickCreateButton();
    }

}
