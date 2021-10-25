package SerenityWithJUnit.features.auth;



import SerenityWithJUnit.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SignUpTest {

    @Managed(uniqueSession = true)
    WebDriver webdriver;

    @Steps
    NavigationSteps navigationSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    CreateAccountSteps createAccountSteps;

    @Steps
    DashboardSteps dashboardSteps;


    @Test
    public  void createAccount(){
        navigationSteps.navigateToHomepage();
        headerSteps.navigateToAccount();
        loginSteps.clickCreateAccount();
        createAccountSteps.fillForm();
        createAccountSteps.clickRegister();
        dashboardSteps.checkIfLoginSuccessful();
    }

    @Test
    public void logIn(){
        navigationSteps.navigateToHomepage();
        headerSteps.navigateToAccount();
        loginSteps.fillLoginForm();
        loginSteps.logIn();
        dashboardSteps.checkIfLoginSuccessful();
    }

}
