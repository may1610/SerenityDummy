package viettel.SerenityDummy.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import viettel.SerenityDummy.steps.serenity.UploadSteps;
import common.Utility;

public class UploadStepsDefinition {
	@Steps 
	UploadSteps may;
	
	@Given("^I am on upload page$")
	public void i_am_on_upload_page() throws Exception {
	    may.is_on_upload_page();
	}


	@When("^I select a file and upload$")
	public void i_select_a_file_and_upload() throws Exception {
	    may.choose_upload();
	    Utility.uploadFile("C:\\Users\\may\\Pictures\\Camera Roll\\choco_install_error.png");
	}

	@Then("^I get link download of this file below the message \"([^\"]*)\"$")
	public void i_get_link_download_of_this_file_below_the_message(String message) throws Exception {
	    may.should_see_message_upload_success(message);
	}

}
