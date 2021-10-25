package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.ProductsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductsSteps {


    ProductsPage productsPage;

    @Step
    public void addFirstProductToWishList() {
        Assert.assertEquals(true, productsPage.isProductsPage());
        productsPage.addToWishList();
    }
}
