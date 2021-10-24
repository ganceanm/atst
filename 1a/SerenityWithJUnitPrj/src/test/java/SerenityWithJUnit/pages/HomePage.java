package SerenityWithJUnit.pages;

import SerenityWithJUnit.features.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.url)
public class HomePage extends PageObject {

    @FindBy(css = ".product-name")
    private WebElementFacade productButton;

    public void openProductPage() {
        productButton.waitUntilClickable();
        productButton.click();
    }

}
