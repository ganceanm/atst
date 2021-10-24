package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.ProductPage;
import net.thucydides.core.annotations.Step;

public class ProductSteps {


    ProductPage productPage;

    @Step
    public void add_first_product_to_cart(){
//        Assert.assertEquals(true,productsPage.is_products_page());
        productPage.add_to_cart();
    }
}
