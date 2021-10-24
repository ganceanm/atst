package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.DashboardPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class DashboardSteps {

    DashboardPage dashboardPage;

    @Step
    public void checkIfLoginSuccessful(){
        Assert.assertEquals(true, dashboardPage.isOnDashboard());
    }
}
