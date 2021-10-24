package SerenityWithJUnit.pages;


import SerenityWithJUnit.features.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.url)
public class HeaderPage extends PageObject {

    @FindBy(className = "skip-account")
    private WebElementFacade accountButton;

    @FindBy(id = "account-header")
    private WebElementFacade account;

    @FindBy(className = "skip-cart")
    private WebElementFacade cart;

    @FindBy(partialLinkText = "My Wishlist")
    private WebElementFacade wishList;

    @FindBy(partialLinkText = "My Account")
    private WebElementFacade accountLink;

    public Boolean my_account_is_visible() {
        return accountButton.waitUntilVisible().isVisible();
    }

    public Boolean my_cart_is_visible() {
        return cart.waitUntilVisible().isVisible();
    }


    @FindBy(id = "search")
    private WebElementFacade searchBox;

    @FindBy(className = "search-button")
    private WebElementFacade searchButton;

    public void type_keyword(String keyword) {
        searchBox.type(keyword);
    }

    public void search() {
        searchButton.waitUntilClickable();
        searchButton.click();
    }



    public void go_to_cart() {
        cart.waitUntilClickable().click();
    }


    public void goToWishList() {
        accountButton.waitUntilClickable().click();

        wishList.waitUntilClickable().click();
    }

    public void goToAccount(){
        accountButton.waitUntilClickable().click();

        accountLink.waitUntilClickable().click();
    }
}
