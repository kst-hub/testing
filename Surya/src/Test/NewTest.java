package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws Exception {
  System.out.println("Hiiii....");
	  
	  System.setProperty("webdriver.chromo.driver", "/Users/suryateja/eclipse-workspace/Surya/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  Testing t = new Testing();
	  t.testing(driver);
	  
	  
	  
  }
  
  public static void main(String[] args) throws Exception {
		NewTest t = new NewTest();
		t.f();
		
	}
  
  
  
}
