package SerenityWithJUnit.features.cart;


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
public class ShoppingCartTest {

    @Managed(uniqueSession = true)
    WebDriver webdriver;

    @Steps
    NavigationSteps navigationSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    HomeSteps homeSteps;

    @Steps
    ProductSteps productSteps;

    @Steps
    ShoppingCartSteps shoppingCartSteps;


    @Test
    public  void addToCartNewProduct(){
        navigationSteps.navigateToHomepage();
        homeSteps.clickProductName();
        productSteps.addFirstProductToCart();
        headerSteps.navigateToShoppingCart();
        shoppingCartSteps.shouldSeeProductInShoppingCart("linen blazer");
    }
    @Test
    public void removeProductFromCart(){
        addToCartNewProduct();
        shoppingCartSteps.removeProductFromShoppingCart(webdriver);
        shoppingCartSteps.shouldSeeNoRemovableProductLeft();


    }

}
