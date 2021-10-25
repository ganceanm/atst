package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SearchResultsPage extends PageObject {

    @FindBy(className = "page-title")
    private WebElementFacade searchTermHeading;


    public String getSearchResultsPageTerm() {
        return searchTermHeading.getText();
    }
}
