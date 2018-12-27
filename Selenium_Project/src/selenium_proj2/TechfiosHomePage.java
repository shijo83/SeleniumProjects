package selenium_proj2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosHomePage {

WebDriver driver;
	
	public TechfiosHomePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[2]/a")
	WebElement CRM;
	
	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[2]/ul/li[1]/a")
	WebElement AddContact;
	
	public void GoToAddContact()
	{
		CRM.click();
		AddContact.click();
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/a")
	WebElement BA;
	
	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[5]/ul/li[1]/a")
	WebElement NA;
	
	public void FillNewAcct()
	{
		BA.click();
		NA.click();
	}
	
	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[6]/a")
	WebElement PS;
	
	@FindBy(how=How.XPATH,using=".//*[@id='side-menu']/li[6]/ul/li[2]/a")
	WebElement NP;
	
	public void FillNewProd()
	{
		PS.click();
		NP.click();
	}
}
