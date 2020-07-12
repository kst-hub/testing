package Test;

import org.openqa.selenium.WebDriver;

public class Testing extends Parent{

	public void testing() {
		
	}

	public void testing(WebDriver driver) throws Exception {
		// TODO Auto-generated method stub
		 
		driver.switchTo().activeElement().sendKeys(s);
		Thread.sleep(2000);
		  driver.quit();

		
	}
	
}
