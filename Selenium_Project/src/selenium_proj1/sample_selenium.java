package selenium_proj1;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample_selenium {

@Test
public void first_test()
{
//Configuration process: browser settings		
System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe"); //declaring to open chromedriver and giving location 
WebDriver driver=new ChromeDriver(); //driver objects access all the webdriver functions and opens the browser
driver.manage().window().maximize(); //maximizes the window screen

//Test steps
driver.get("https://www.qtptutorial.net/automation-practice/"); //goes to the url
driver.findElement(By.id("idExample")).click();  //clicks the button
driver.findElement(By.className("main_title")).isDisplayed();  //validates if this element is present or not. if the element is not preset it means page did not load		


driver.close(); // Tear down process: closes the current browser 
driver.quit();  // Tear down process: closes the all the browser and ends the test case
}

@Test
public void second_test()
{
System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize();

driver.get("https://www.qtptutorial.net/automation-practice/");
driver.findElement(By.className("buttonClassExample")).click();  
driver.findElement(By.className("main_title")).isDisplayed(); 

driver.close();
driver.quit();
}
	
@Test
public void third_test()
{
System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize();

driver.get("https://www.qtptutorial.net/automation-practice/");
driver.findElement(By.name("NameExample")).click();  
driver.findElement(By.className("main_title")).isDisplayed(); 

//driver.close();
//driver.quit();
}
	
@Test
public void Email_Address_Test() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize();

driver.get("https://www.qtptutorial.net/automation-practice/");
driver.findElement(By.id("et_pb_signup_firstname")).sendKeys("Me");  
driver.findElement(By.id("et_pb_signup_email")).sendKeys("me@gmail.com");
driver.findElement(By.className("et_pb_newsletter_button_text")).click();

Thread.sleep(3000);

driver.close();
driver.quit();
}
	
@Test
public void Demo_login() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize();

driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
driver.findElement(By.id("user_login")).sendKeys("admin");  
driver.findElement(By.id("user_pass")).sendKeys("demo123");
driver.findElement(By.className("button-primary")).click();
driver.findElement(By.id("content")).isDisplayed();
System.out.println("page was successfull");

Thread.sleep(3000);

driver.close();
driver.quit();
}
	}
