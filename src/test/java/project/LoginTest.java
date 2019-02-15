package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void LoginTest() {
	  System.out.println("Login Test");
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\IBM_ADMIN\\Videos\\AllfilesfromTrainer\\chromedriver_win32\\chromedriver.exe"); // to access the chrome exe file

				WebDriver driver = new ChromeDriver(); 		//Launches chrome driver as proxy
				driver.get("https://www.google.com"); 		//open google.com
				
				System.out.println(driver.getTitle());
				driver.close(); 	
  }
}
