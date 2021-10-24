package SerenityWithJUnit.pages;


import SerenityWithJUnit.features.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Constants.url)
public class GlobalNavigationPage extends PageObject {

    @FindBy(className = "nav-primary")
    private WebElementFacade productSeeAllLink;

    public Boolean products_link_is_visible(){
        return productSeeAllLink.waitUntilVisible().isVisible();
    }
}
