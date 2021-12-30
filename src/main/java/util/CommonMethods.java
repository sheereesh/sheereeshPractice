package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
public void click_On_It(WebElement web) {
	web.click();
}

public void send_Text_On_It( WebElement   web,String text) {
	web.sendKeys(text);
}
}
