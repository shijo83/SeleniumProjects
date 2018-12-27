package selenium_proj2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import junit.framework.Assert;

public class TechfiosPS {

WebDriver driver;
	
	public TechfiosPS(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.ID,using="name")
	WebElement Name;
	
	@FindBy(how=How.ID,using="sales_price")
	WebElement SalesPrice;
	
	@FindBy(how=How.ID,using="item_number")
	WebElement ItemNum;
	
	@FindBy(how=How.ID,using="description")
	WebElement Description;
	
	@FindBy(how=How.ID,using="submit")
	WebElement Submit;
	
	public void FillNewProd()
	{
	Name.sendKeys("Sean testing");
	SalesPrice.sendKeys("147");
	ItemNum.sendKeys("12345");
	Description.sendKeys("just product adding test");
	Submit.click();
	}
	
	public void verifyProd(){
	
	//created boolean value isEnabled(if true condition) that the element is present/exist 
	boolean isEnabled=driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[3]/div[1]")).isEnabled();
		
	if (isEnabled) {
		System.out.println("Test add product completed");}
	else {
		System.out.println("Test add product failed");}
	}
}
