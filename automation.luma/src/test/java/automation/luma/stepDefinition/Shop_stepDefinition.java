package automation.luma.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import Pages.yogaPage;


public class Shop_stepDefinition {
	
	yogaPage yogapage = new yogaPage();
	
	@Given("I am on the Magento demo store homepage")
	public void i_am_on_the_magento_demo_store_homepage() {
		
	yogapage.LaunchBrowser();	
	   
	}
	@When("I navigate to the Shop page")
	public void i_navigate_to_the_shop_page()  
	{
		
		yogapage.navigateToShopPage();
	   
	}
	
	
	@When("I filter products by category and I see list of products")
	public void i_filter_products_by_category_and_i_see_list_of_products() {
		yogapage.selectCategory();
	}
	
	@When("I click on the required product am directed to product details page")
	public void i_click_on_the_required_product_am_directed_to_product_details_page() {
	   yogapage.productDetails();
	}
	
	@Then("I add  quantities of the product to the cart")
	public void i_add_quantities_of_the_product_to_the_cart() throws InterruptedException {
		yogapage.proceedToCart();
	    
	}
	@When("I proceed to checkout")
	public void i_proceed_to_checkout() {
		yogapage.proceedTocheckOut();
	    
	}
	@Then("I am on the checkout page")
	public void i_am_on_the_checkout_page() {
		yogapage.shippingAddress();

	}
	@Then("I can successfully complete the purchase")
	public void i_can_successfully_complete_the_purchase() {
	
	}
	@Then("I receive a confirmation order")
	public void i_receive_a_confirmation_order() {
	   
	}

}
