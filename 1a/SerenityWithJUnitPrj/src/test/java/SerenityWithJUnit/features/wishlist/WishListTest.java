package SerenityWithJUnit.features.wishlist;


import SerenityWithJUnit.features.Constants;
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
public class WishListTest {

    @Managed(uniqueSession = true)
    WebDriver webdriver;

    @Steps
    NavigationSteps navigationSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    LoginSteps loginSteps;

    @Steps
    DashboardSteps dashboardSteps;

    @Steps
    ProductsSteps productsSteps;

    @Steps
    WishListSteps wishListSteps;


    @Test
    public  void addProductToWishList(){
        logIn();
        navigationSteps.navigateToHomepage();
        headerSteps.searchProduct(Constants.productName);
        productsSteps.addFirstProductToWishList();
        headerSteps.navigateToWishList();
        wishListSteps.shouldSeeProductInWishList(Constants.productName);
    }
    @Test
    public void removeProductFromWishList(){
        addProductToWishList();
        wishListSteps.removeProductFromWishList(webdriver);
        wishListSteps.shouldSeeNoRemovableProductLeft();

    }

    private void logIn(){
        navigationSteps.navigateToHomepage();
        headerSteps.navigateToAccount();
        loginSteps.fillLoginForm();
        loginSteps.logIn();
        dashboardSteps.checkIfLoginSuccessful();
    }
}
