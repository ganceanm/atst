package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class WishListPage extends PageObject {

    @FindBy(id = "wishlist-table")
    private WebElementFacade productsElementsContainer;

    public List<String> getWishListProductsName() {
        productsElementsContainer.waitUntilVisible();
        return productsElementsContainer.findElements(By.cssSelector(".product-name, h3")).stream().map(element -> element.getText().toLowerCase()).collect(Collectors.toList());
    }

    @FindBy(css = ".btn-remove")
    private WebElementFacade removeProductButton;

    public void removeItemFromWishList(WebDriver webdriver) {
        removeProductButton.waitUntilVisible().click();

        webdriver.switchTo().alert().accept();
        waitABit(2000);

    }

    public Boolean isRemoveFromWishListPresent() {
        return removeProductButton.isVisible();
    }
}
