package selenium_proj2;

import org.junit.Assert;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {

WebDriver driver;
	
	public Homepage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="title")
	WebElement title;
	
	@FindBy(how=How.ID,using="content")
	WebElement content;
	
	@FindBy(how=How.ID, using="publish")
	WebElement publish;
	
     public void publish(){
		
		title.sendKeys("my test");
		content.sendKeys("Hi. only testing this..");
		publish.click();
	}


   public void validatehomepage(){
    	
	  if (driver.findElement(By.id("title")).isDisplayed())
	  
	  {
		  System.out.println("Home page opened");
		  
	  }
    
    	 
     }


}
