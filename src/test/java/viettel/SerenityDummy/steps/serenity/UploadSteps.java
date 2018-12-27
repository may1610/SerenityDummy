package viettel.SerenityDummy.steps.serenity;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;

import viettel.SerenityDummy.pages.UploadPage;

public class UploadSteps {

	UploadPage uploadPage;
	
	public void is_on_upload_page()
	{
		uploadPage.open();
	}
	
	public void choose_upload()
	{
		uploadPage.chooseUpload();
	}
	
	public void should_see_message_upload_success(String message)
	{
		MatcherAssert.assertThat(uploadPage.getUploadedMessage().equalsIgnoreCase(message), Is.is(true));		
	}

}
