package selenium_proj1;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demosite {

	
	@Test
	public void post() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","c:\\auto\\chromedriver.exe"); 
	WebDriver driver=new ChromeDriver(); 
	driver.manage().window().maximize();

	driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");
	driver.findElement(By.id("user_login")).sendKeys("admin");  
	driver.findElement(By.id("user_pass")).sendKeys("demo123");
	driver.findElement(By.className("button-primary")).click();
	//driver.findElement(By.linkText("Posts")).click();
	//driver.findElement(By.linkText("Add New")).click();
	driver.findElement(By.id("title")).sendKeys("my Post");  
	driver.findElement(By.id("content")).sendKeys("Hi. Just testing here");
	//type in body
		/*
		driver.switchTo().frame("content_ifr"); //switch to frame command (WebDriver supports moving between named frame using the “switchTo” method)
        WebElement body = driver.findElement(By.xpath("//body"));  //user input webElement for body and to find the element of the body
        body.click(); //to click in the body of the post
        JavascriptExecutor executor = (JavascriptExecutor)driver; //executor to perform an desired operation on a web element.
        String body_text = "Hi, just testing that's all";  //creating String object and inputed characters 
		executor.executeScript("arguments[0].innerHTML = '"+ body_text +"'", body); //executing body text script
        driver.switchTo().defaultContent(); //switch to default content
        */
    driver.findElement(By.id("save-post")).click();
    Thread.sleep(1000);
    
    driver.close();
    driver.quit();

    System.out.println("published post successfully");
	}
}
