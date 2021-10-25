package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.GlobalNavigationPage;
import net.thucydides.core.annotations.Step;

public class NavigationSteps {

    GlobalNavigationPage navigationPage;


    @Step
    public void navigateToHomepage() {
        navigationPage.open();
    }
}
