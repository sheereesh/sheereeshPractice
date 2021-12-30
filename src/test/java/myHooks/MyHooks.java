package myHooks;

 
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.InvokeBrowser;

public class MyHooks {
	
private static WebDriver wd;

	
	@Before(order=1)
	public void invokeBrowser() {
		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		  wd=obj_InvokeBrowser.invokeBrowser();
	}
	
	@Before(order=2)
	public void enterUrl() {
		InvokeBrowser obj_InvokeBrowser=new InvokeBrowser();
		obj_InvokeBrowser.enterUrl();
	}
	 @Before(order=3)
	 public void delayTime() {
		 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	 @After
public void closeBrowser() {
	wd.close();
	wd.quit();
}
	 
	 
}
