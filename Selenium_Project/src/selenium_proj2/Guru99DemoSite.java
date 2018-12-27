package selenium_proj2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Guru99DemoSite {

WebDriver driver;
	
	public Guru99DemoSite(WebDriver ldriver){
		
		this.driver=ldriver;
	}

	@FindBy(how=How.NAME,using="firstName")
	WebElement FirstName;
	
	@FindBy(how=How.NAME,using="lastName")
	WebElement LastName;
	
	@FindBy(how=How.NAME,using="phone")
	WebElement Phone;
	
	@FindBy(how=How.ID,using="userName")
	WebElement Email;
	
	@FindBy(how=How.NAME,using="address1")
	WebElement Address;
	
	@FindBy(how=How.NAME,using="city")
	WebElement City;
	
	@FindBy(how=How.NAME,using="state")
	WebElement State;
	
	@FindBy(how=How.NAME,using="postalCode")
	WebElement PostalCode;
	
	@FindBy(how=How.ID,using="email")
	WebElement UserName;
	
	@FindBy(how=How.NAME, using="password")
	WebElement Password;
	
	@FindBy(how=How.NAME,using="confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(how=How.NAME,using="submit")
	WebElement Submit;
	
	public void FillRegister()
	{
	FirstName.sendKeys("ASD");
	LastName.sendKeys("LKJ");
	Phone.sendKeys("987654654");
	Email.sendKeys("ASD@guru99.com");
	Address.sendKeys("123 Laklsdfl");
	City.sendKeys("laksjdf");
	State.sendKeys("Alkjlkj");
	PostalCode.sendKeys("655452");
	Select drpCountry = new Select(driver.findElement(By.name("country")));
	drpCountry.selectByVisibleText("UNITED STATES");
	UserName.sendKeys("ASD@guru99.com");
	Password.sendKeys("Daxton25");
	ConfirmPassword.sendKeys("Daxton25");
	Submit.click();
	
	}
	

	}

