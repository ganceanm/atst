package SerenityWithJUnit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductPage extends PageObject {

    @FindBy(css = ".swatch-link")
    private WebElementFacade colorField;

    @FindBy(id = "option79")
    private WebElementFacade sizeField;

    @FindBy(css = ".add-to-cart")
    private WebElementFacade buttonAddToCart;

    public void add_to_cart() {

        sizeField.waitUntilClickable().click();
        colorField.waitUntilClickable().click();

        buttonAddToCart.click();

    }

}
