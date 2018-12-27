package viettel.SerenityDummy.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import viettel.SerenityDummy.steps.serenity.BuySteps;

public class FptShopDefinitionSteps {

	@Steps
	BuySteps may;

	@Given("^I am on fptshop page$")
	public void i_am_on_fptshop_page() throws Exception {
		may.is_home_page();
		Thread.sleep(3000);
	}

	@When("^I select one of the best seller tablet$")
	public void i_select_one_of_the_best_seller_tablet() throws Exception {
		may.choose_menu_tablet();
		may.choose_first_tablet();
	}

	@When("^I buy that$")
	public void i_buy_that() throws Exception {
		may.buy();
	}

	@Then("^I should see product in the shopping cart \"([^\"]*)\"$")
	public void i_should_see_product_in_the_shopping_cart(String cartTile) throws Exception {
		may.should_see_title_of_cart(cartTile);
	}

}
