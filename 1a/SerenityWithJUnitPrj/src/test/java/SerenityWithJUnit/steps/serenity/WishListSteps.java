package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.WishListPage;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WishListSteps {


    WishListPage wishListPage;

    @Step
    public void shouldSeeProductInWishList(String productName) {
        Assert.assertThat(wishListPage.getWishListProductsName(), Matchers.hasItem(Matchers.containsString(productName)));
    }

    @Step
    public void removeProductFromWishList(WebDriver webdriver) {
        wishListPage.removeItemFromWishList(webdriver);

    }

    @Step
    public void shouldSeeNoRemovableProductLeft() {
        Assert.assertEquals(false, wishListPage.isRemoveFromWishListPresent());
    }
}
