package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.GlobalNavigationPage;
import SerenityWithJUnit.pages.HomePage;
import SerenityWithJUnit.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeSteps {

    HomePage headerPage;

    @Step
    public void clickProductName(){
        headerPage.openProductPage();
    }


}
