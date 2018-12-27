package selenium_proj2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class TechfiosBC {
	
WebDriver driver;
	
	public TechfiosBC(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="account")
	WebElement AcctTitle;
	
	@FindBy(how=How.ID,using="description")
	WebElement Description;
	
	@FindBy(how=How.ID,using="balance")
	WebElement Balance;
	
	@FindBy(how=How.XPATH,using=".//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement Submit;
	
	public void FillNewAcct()
	{
	AcctTitle.sendKeys("Superv testing");
	Description.sendKeys("test");
	Balance.sendKeys("500");
	Submit.click();
	}
	
	public void verifyAcct(){
		//verifying the page title
		String result=driver.getPageSource(); //captures the title of the page and return the String
		System.out.println("The verification is "+result); //to print the String after test result
		String expected_result="Accounts- TechFios Test Application - Billing"; //expected return of String/title
		Assert.assertEquals(result, expected_result); //to verify if both are same or not (actual and expected)
		System.out.println("Added new account test");  //this will print if verification pass
		
		/*
		 boolean isEnabled=driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[3]/div[1]")).isEnabled();
		
		if (isEnabled) {
			System.out.println("Test add account completed");}
		else {
			System.out.println("Test add account failed");}
		*/
		}
}
