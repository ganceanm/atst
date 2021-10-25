package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.HeaderPage;
import SerenityWithJUnit.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HeaderSteps {

    HeaderPage headerPage;
    SearchResultsPage searchResultsPage;

    @Step
    public void searchProduct(String productName){
            headerPage.typeKeyword(productName);
            headerPage.search();
            Assert.assertEquals("SEARCH RESULTS FOR '" + productName.toUpperCase()+"'", searchResultsPage.getSearchResultsPageTerm().toUpperCase() );
    }


    @Step
    public void navigateToShoppingCart(){
        headerPage.goToCart();
    }

    @Step
    public void navigateToWishList(){
        headerPage.goToWishList();
    }

    @Step
    public void navigateToAccount(){
        headerPage.goToAccount();
    }

}
