package selenium_proj2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dry_selenium {

@Test
public void Login(){
	
	
System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); // Object command for locating chrome driver
	
    WebDriver driver = new ChromeDriver();
   //driver object reference access all the built in function in selenium.
		
    driver.manage().window().maximize(); // maximizes window
	
    driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");	
    
    driver.findElement(By.id("user_login")).sendKeys("admin");
    
    driver.findElement(By.id("user_pass")).sendKeys("demo123");
    
    driver.findElement(By.id("wp-submit")).click();
	
	
	driver.close();
	driver.quit();
	
	
	
	
	
}
















}
