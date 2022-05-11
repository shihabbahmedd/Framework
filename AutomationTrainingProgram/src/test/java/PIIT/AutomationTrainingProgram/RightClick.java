package PIIT.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiha\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		
		WebElement Picture = driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
		Actions ob = new Actions(driver);
		ob.contextClick(Picture);
		
	}

}
