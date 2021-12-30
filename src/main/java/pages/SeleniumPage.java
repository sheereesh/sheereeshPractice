package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class SeleniumPage {

	private static WebDriver wd;
	CommonMethods obj_CommonMethods=new CommonMethods();
	public SeleniumPage(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//input[@type='text'and @name='text']  ")
	WebElement  enterDataOnFormELements;


	public void enterDataOnIt(String text) {
		obj_CommonMethods.send_Text_On_It(enterDataOnFormELements, text);

	try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		 System.out.println(e);
	}
	}

	@FindBy(xpath = "//textarea[@name='textarea']")
	WebElement enterDataOn_TextBox;

	public void sendDataOnTextBox(String text) {
		obj_CommonMethods.send_Text_On_It(enterDataOn_TextBox, text);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			 System.out.println(e);
		}
	}

	@FindBy(xpath = "//input[@type='submit']")
	WebElement clickOnSubmitButton;
	public void clickOnButtonSubmit() {
		obj_CommonMethods.click_On_It(clickOnSubmitButton);
	}

}
