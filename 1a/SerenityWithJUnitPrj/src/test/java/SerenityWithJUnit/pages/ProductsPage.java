package SerenityWithJUnit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductsPage extends PageObject {


    @FindBy(className = "products-grid")
    private WebElementFacade productData;


    @FindBy(css=".link-wishlist")
    private WebElementFacade buttonAddToWishList;

    public Boolean isProductsPage(){
        return productData.waitUntilVisible().isVisible();
    }

    public void addToWishList(){
        productData.waitUntilClickable();

        buttonAddToWishList.waitUntilClickable().click();

    }

}
