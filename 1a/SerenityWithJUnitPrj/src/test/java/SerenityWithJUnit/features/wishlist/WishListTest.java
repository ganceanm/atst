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
import org.springframework.core.annotation.Order;

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


    @Test @Order(1)
    public  void addProductToWishList(){
        logIn();
        navigationSteps.navigate_to_homepage();
        headerSteps.search_product(Constants.productName);
        productsSteps.addFirstProductToWishList();
        headerSteps.navigateToWishList();
        wishListSteps.should_see_product_in_wish_list(Constants.productName);
    }
//    @Test @Order (2)
//    public void removeProductFromWishList(){
//        addProductToWishList();
//        wishListSteps.remove_product_from_shopping_cart(webdriver);
//        wishListSteps.should_see_no_removable_product_left();
//
//
//    }

    private void logIn(){
        navigationSteps.navigate_to_homepage();
        headerSteps.navigateToAccount();
        loginSteps.fillLoginForm();
        loginSteps.logIn();
        dashboardSteps.checkIfLoginSuccessful();
    }
}
