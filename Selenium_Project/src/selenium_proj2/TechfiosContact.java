package selenium_proj2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosContact {

WebDriver driver;
	
	public TechfiosContact(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="account")
	WebElement FullName;
	
	@FindBy(how=How.ID,using="company")
	WebElement Company;
	
	@FindBy(how=How.ID,using="email")
	WebElement Email;
	
	@FindBy(how=How.ID,using="phone")
	WebElement Phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement Address;
	
	@FindBy(how=How.ID,using="city")
	WebElement City;
	
	@FindBy(how=How.ID,using="state")
	WebElement State;
	
	@FindBy(how=How.ID,using="zip")
	WebElement Postal;
	
	@FindBy(how=How.ID,using="submit")
	WebElement Submit;
	
	public void FillContactForm()
	{
	FullName.sendKeys("This Name");
	Company.sendKeys("Home");
	Email.sendKeys("yes@gmail.com");
	Phone.sendKeys("987654321");
	Address.sendKeys("123 street dr");
	City.sendKeys("Dallas");
	State.sendKeys("Texas");
	Postal.sendKeys("75050");
	Submit.click();
	}
}
