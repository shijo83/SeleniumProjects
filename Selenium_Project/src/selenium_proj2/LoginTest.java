package selenium_proj2;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import util.BrowserFactory;

public class LoginTest {

	@Test
	public void loginTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
		driver.manage().window().maximize();
		
		// call page factory to make connection with the test class
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login_demo("admin", "demo123");
		
		
		Homepage home = PageFactory.initElements(driver, Homepage.class);
		home.publish();
		home.validatehomepage();
		
		driver.close();
		driver.quit();
	}
	
	@Test
	public void TechFiosContact() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.login_demo("techfiosdemo@gmail.com", "abc123");
		
		
		TechfiosHomePage home= PageFactory.initElements(driver, TechfiosHomePage.class);
		
		home.GoToAddContact();
		
		TechfiosContact contact=PageFactory.initElements(driver, TechfiosContact.class);
		
		contact.FillContactForm();
		
		//driver.close();
		//driver.quit();
	}
	
	@Test
	public void TechFiosBC() throws IOException, InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login_demo("techfiosdemo@gmail.com", "abc123");
		
		TechfiosHomePage home= PageFactory.initElements(driver, TechfiosHomePage.class);
		home.FillNewAcct();
		
		TechfiosBC account=PageFactory.initElements(driver, TechfiosBC.class);
		account.FillNewAcct();
		account.verifyAcct();
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}
	
	@Test
	public void TechFiosPS() throws IOException, InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.login_demo("techfiosdemo@gmail.com", "abc123");
		
		TechfiosHomePage home= PageFactory.initElements(driver, TechfiosHomePage.class);
		home.FillNewProd();
		
		TechfiosPS product=PageFactory.initElements(driver, TechfiosPS.class);
		product.FillNewProd();
		product.verifyProd();
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}
	@Test
	public void Guru99DemoSite() throws IOException, InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		
		Guru99DemoSite account=PageFactory.initElements(driver, Guru99DemoSite.class);
		account.FillRegister();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}
	
}
