package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.CommonMethods;

public class HomePage {
	private static WebDriver wd;
	CommonMethods obj_CommonMethods=new CommonMethods();

	public HomePage(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}
	@FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]")
	WebElement click_On_The_Link_SeleniumExamplePage;

	public void clickOnIt() {
		obj_CommonMethods.click_On_It(click_On_The_Link_SeleniumExamplePage);
	}
}