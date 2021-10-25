package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.ProductPage;
import net.thucydides.core.annotations.Step;

public class ProductSteps {

    ProductPage productPage;

    @Step
    public void addFirstProductToCart() {
        productPage.addToCart();
    }
}
