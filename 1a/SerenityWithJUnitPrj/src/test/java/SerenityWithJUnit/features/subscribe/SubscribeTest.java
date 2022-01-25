package SerenityWithJUnit.features.subscribe;


import SerenityWithJUnit.features.Constants;
import SerenityWithJUnit.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SubscribeTest {

    @Managed(uniqueSession = true)
    WebDriver webdriver;

    @Steps
    NavigationSteps navigationSteps;

    @Steps
    HomeSteps homeSteps;

    @TestData
    public static Collection<Object[]> testData(){
        return Arrays.asList(new Object[][]{
                {"7"},
                {"8"},
                {"9"},
                {"10"},
                {"11"},
                {"12"},
                {"13"},
        });
    }

    private final String email;

    public SubscribeTest(String id) {
        this.email = Constants.subscribeMailFirst + id + Constants.subscribeMailSecond;
    }

    @Test
    public void subscribeToNewsletter(){
        navigationSteps.navigateToHomepage();
        homeSteps.subscribeEmailToNewsletter(this.email);
        homeSteps.shouldSeeSuccessMessage();
    }
}
