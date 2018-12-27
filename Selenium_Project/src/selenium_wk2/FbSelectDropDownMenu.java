package selenium_wk2;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.BrowserFactory;

public class FbSelectDropDownMenu {

	@Test
	public void selectMonths() throws IOException, InterruptedException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		
		Select month_dd=new Select(month_dropdown);
		
		
		//**Three different methods**
		
		//month_dd.selectByIndex(4); //will select April
		//Thread.sleep(2000);
		
		//month_dd.selectByValue("10"); //will select October
		//Thread.sleep(2000);
		
		WebElement selected_value=month_dd.getFirstSelectedOption();
		//it should return/verify what month it was at 
		System.out.println("Before Selection, selected values/month was "+selected_value.getText());
		
		month_dd.selectByVisibleText("Aug"); //will select August
		Thread.sleep(2000);
		
		WebElement selected_value1=month_dd.getFirstSelectedOption();
		//it should return/verify which month selected
		System.out.println("After Selection, selected values/month is "+selected_value1.getText());
		
		driver.close();
		driver.quit();
	}
}
