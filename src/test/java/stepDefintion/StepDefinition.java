package stepDefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.SeleniumPage;
import util.InvokeBrowser;

public class StepDefinition {
	private static  WebDriver wd;
 
	@Given("user is in {string} page")
	public void user_is_in_page(String expTitle) {
	     InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
	       wd=obj_InvokeBrowser.enterUrl();
	       Assert.assertEquals(wd.getTitle(), expTitle);
	}

	@When("user clicks on  Selenium Example Page link")
	public void user_clicks_on_selenium_example_page_link() {
	     HomePage obj_HomePage=new HomePage(wd);
	     obj_HomePage.clickOnIt();
	}

	@Then("system should display {string} page")
	public void system_should_display_page(String expTitle) {

Assert.assertEquals(wd.getTitle(),expTitle);
	}

	@When("user enters {string} on the Form Elements")
	public void user_enters_on_the_form_elements(String text) {
	     SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
	     obj_SeleniumPage.enterDataOnIt(text);
	}

	@When("user enters   {string} on the text box")
	public void user_enters_on_the_text_box(String text) {
	    SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
	    obj_SeleniumPage.sendDataOnTextBox(text);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	     SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
	     obj_SeleniumPage.clickOnButtonSubmit();
	}


}
