import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Teja {
  @Test
  public void f() throws InterruptedException {
	  System.out.println("Hiiii....");
	  
	  System.setProperty("webdriver.chromo.driver", "/Users/suryateja/eclipse-workspace/Surya/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.quit();
  }
  
  public static void main(String[] args) throws InterruptedException {
	Teja t = new Teja();
	t.f();
}
}
