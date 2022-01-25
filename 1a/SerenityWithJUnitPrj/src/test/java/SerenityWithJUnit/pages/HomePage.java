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

    @FindBy(id = "newsletter")
    private WebElementFacade newsletterInput;

    @FindBy(id = "newsletter-validate-detail")
    private WebElementFacade newsletterForm;

    @FindBy(className = "success-msg")
    private WebElementFacade successMessage;

    public void openProductPage() {
        productButton.waitUntilClickable();
        productButton.click();
    }

    public void subscribe(String mail){
        newsletterForm.waitUntilVisible();
        newsletterInput.waitUntilClickable();
        newsletterInput.type(mail);
        newsletterForm.submit();
    }

    public Boolean isSuccessMessagePresent(){
        return successMessage.isVisible();
    }

}
