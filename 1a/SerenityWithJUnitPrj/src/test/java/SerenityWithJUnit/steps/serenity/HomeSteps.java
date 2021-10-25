package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    HomePage headerPage;

    @Step
    public void clickProductName() {
        headerPage.openProductPage();
    }


}
