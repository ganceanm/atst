package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ShoppingCartSteps extends PageObject {


    ShoppingCartPage shoppingCartPage;

    @Step
    public void shouldSeeProductInShoppingCart(String productName) {

        Assert.assertThat(shoppingCartPage.getShoppingCartProductsName(), Matchers.hasItem(Matchers.containsString(productName)));
    }

    @Step
    public void removeProductFromShoppingCart(WebDriver webdriver) {
        shoppingCartPage.removeProductFromShoppingCart(webdriver);

    }

    @Step
    public void shouldSeeNoRemovableProductLeft() {
        Assert.assertEquals(false, shoppingCartPage.isRemoveProductFromCartPresent());
    }
}
