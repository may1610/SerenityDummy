package viettel.SerenityDummy.pages;

import java.util.List;

import org.openqa.selenium.WebElement;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;

@DefaultUrl("https://fptshop.com.vn")
public class FptShopHomePage extends PageObject{
	@FindBy(xpath="//ul[contains(@class,'fs-mnul')]//a[@href='/may-tinh-bang']")
	private WebElementFacade mnuTablet;
	
	@FindBy(xpath="//a[@href='/may-tinh-bang']/following-sibling::div//p[contains(text(),'Bán chạy nhất')]/following-sibling::ul//a[@class='fs-mnspimg']")
	private List<WebElementFacade> lstBestSellerTablet;
	
	@FindBy(xpath="//p[contains(text(),'MUA NGAY')]")
	private WebElementFacade btnBuy;
	
	@FindBy(xpath="//p[@class='ghg-hds']")
	private WebElementFacade lblCart;
	
	public void chooseMenuTablet()
	{	
		withAction().moveToElement(mnuTablet).perform();		
	}
	
	public void buy()
	{	
		btnBuy.click();
	}
	
	public void chooseFirstTablet()
	{
		lstBestSellerTablet.get(0).click();
	}
	
	public String getTitleOfCart()
	{
		System.out.println("go to hell " + lblCart.getText());
		return lblCart.getText();
	}

}
