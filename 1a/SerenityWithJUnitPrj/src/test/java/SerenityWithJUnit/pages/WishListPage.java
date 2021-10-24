package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class WishListPage extends PageObject {


    @FindBy(css = ".block block-cart")
    private WebElementFacade modal;

    @FindBy(id = "wishlist-table")
    private WebElementFacade productsElementsContainer;
    //*[@id="item_248"]/td[2]/h3
    public List<String> getWishListProductsName(){//*[@id="item_248"]/td[2]/h3/a
        WebElementFacade items = find("//*[@id='wishlist-table']");
        productsElementsContainer.waitUntilVisible();
        return productsElementsContainer.findElements(By.cssSelector(".product-name, h3")).stream().map(element->element.getText().toLowerCase()).collect(Collectors.toList());
    }

    @FindBy(css = "block block-cart, a.remove")
    private WebElementFacade removeProductCardButton;

    public void remove_product_from_shopping_cart(WebDriver webdriver){
        removeProductCardButton.waitUntilVisible().click();

        webdriver.switchTo().alert().accept();
        waitABit(2000);

    }
    public Boolean is_remove_product_from_cart_present(){
        return removeProductCardButton.isVisible();
    }
}
