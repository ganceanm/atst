package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.WishListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WishListSteps extends PageObject {


    WishListPage wishListPage;

    @Step
    public void should_see_product_in_wish_list(String productName){

        Assert.assertThat(wishListPage.getWishListProductsName(), Matchers.hasItem(Matchers.containsString(productName)));
    }

    @Step
    public void remove_product_from_shopping_cart(WebDriver webdriver){
        wishListPage.remove_product_from_shopping_cart(webdriver);

    }
    @Step
    public void should_see_no_removable_product_left(){
        Assert.assertEquals(false, wishListPage.is_remove_product_from_cart_present());
    }
}
