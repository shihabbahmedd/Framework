package PIIT.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	static WebDriver driver; 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiha\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		WebElement SearchFieldTxt = driver.findElement(By.name("field-keywords"));
		SearchFieldTxt.sendKeys("computer");
		driver.findElement(By.id("nav-search-submit-button"));
		WebElement SearchIcon = driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon.click();
		WebElement LinkTxt = driver.findElement(By.linkText("Registry"));
		LinkTxt.click();

	}

}
