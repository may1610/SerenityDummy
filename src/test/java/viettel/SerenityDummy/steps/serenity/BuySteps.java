package viettel.SerenityDummy.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;

import net.thucydides.core.annotations.Step;
import viettel.SerenityDummy.pages.FptShopHomePage;
import static org.hamcrest.core.Is.is;

public class BuySteps {

	FptShopHomePage fptPage;
	
	@Step
	public void is_home_page()
	{
		fptPage.open();
	}
	
	@Step
	public void choose_menu_tablet()
	{
		fptPage.chooseMenuTablet();
	}
	
	@Step
	public void choose_first_tablet()
	{
		fptPage.chooseFirstTablet();
	}

	@Step
	public void buy()
	{	
		fptPage.buy();
	}
	
	@Step
	public void should_see_title_of_cart(String content)
	{
		assertThat(fptPage.getTitleOfCart().contains(content), is(true));
	}
	
}
