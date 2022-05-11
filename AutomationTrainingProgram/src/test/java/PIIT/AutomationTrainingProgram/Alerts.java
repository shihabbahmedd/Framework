package PIIT.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Alerts 
{

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiha\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		WebElement Alert = driver.findElement(By.name("alert"));
		Alert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(6000);
		WebElement Confirmation = driver.findElement(By.name("confirmation"));
		Confirmation.click();
		Thread.sleep(6000);
		
		WebElement prompt = driver.findElement(By.name("prompt"));
		prompt.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
