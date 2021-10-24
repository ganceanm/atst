package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.GlobalNavigationPage;
import SerenityWithJUnit.pages.HeaderPage;
import SerenityWithJUnit.pages.SearchResultsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HeaderSteps {

    HeaderPage headerPage;
    GlobalNavigationPage navigationPage;
    SearchResultsPage searchResultsPage;

    @Step
    public void global_header_elements_should_be_visible(){
        Assert.assertEquals(true, headerPage.my_account_is_visible());
        Assert.assertEquals(true, headerPage.my_cart_is_visible());
    }

    @Step
    public void global_navigation_elements_should_be_visible(){
        Assert.assertEquals(true,navigationPage.products_link_is_visible());
    }


    @Step
    public void search_product(String productName){
            headerPage.type_keyword(productName);
            headerPage.search();
            Assert.assertEquals("SEARCH RESULTS FOR '" + productName.toUpperCase()+"'", searchResultsPage.get_search_results_page_term().toUpperCase() );
    }


    @Step
    public void navigate_to_shopping_cart(){
        headerPage.go_to_cart();
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
