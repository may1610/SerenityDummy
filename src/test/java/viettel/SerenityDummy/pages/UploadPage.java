package viettel.SerenityDummy.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://uploadfiles.io/")
public class UploadPage extends PageObject{

	@FindBy(xpath="//form[@id='upload-window']/div")
	private WebElementFacade btnUpload;
	
	@FindBy(xpath="//div[@id='edit']//h3")
	private WebElementFacade lblUploadSuccess;
	
	public void chooseUpload()
	{
		btnUpload.click();
		lblUploadSuccess.waitUntilPresent();
	}
	
	public String getUploadedMessage()
	{
		return lblUploadSuccess.getText();
	}
}
