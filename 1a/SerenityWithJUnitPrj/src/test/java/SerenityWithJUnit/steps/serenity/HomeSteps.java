package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage;

    @Step
    public void clickProductName() {
        homePage.openProductPage();
    }

    @Step
    public void subscribeEmailToNewsletter(String email){
        homePage.subscribe(email);
    }

    @Step
    public void shouldSeeSuccessMessage() {
        Assert.assertEquals(true, homePage.isSuccessMessagePresent());
    }

}
