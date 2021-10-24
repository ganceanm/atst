package SerenityWithJUnit.features.cart;



import SerenityWithJUnit.steps.serenity.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.core.annotation.Order;

@RunWith(SerenityRunner.class)
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


    @Test @Order(1)
    public  void addToCartNewProduct(){
        navigationSteps.navigate_to_homepage();
        homeSteps.clickProductName();
        productSteps.add_first_product_to_cart();
        headerSteps.navigate_to_shopping_cart();
        shoppingCartSteps.should_see_product_in_shopping_cart("linen blazer");
    }
    @Test @Order (2)
    public void removeProductFromCart(){
        addToCartNewProduct();
        shoppingCartSteps.remove_product_from_shopping_cart(webdriver);
        shoppingCartSteps.should_see_no_removable_product_left();


    }

}
