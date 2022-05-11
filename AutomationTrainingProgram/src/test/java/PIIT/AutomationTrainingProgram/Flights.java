package PIIT.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights 
{
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiha\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		
		WebElement depart = driver.findElement(By.id("d1-btn"));
		depart.click();
		
		Thread.sleep(3000);
		WebElement departdate = driver.findElement(By.xpath("//*[@aria-label='May 16, 2022']"));
		departdate.click();
		
		Thread.sleep(3000);
		WebElement returndate = driver.findElement(By.xpath("//*[@aria-label='May 20, 2022']"));
		returndate.click();
		
		Thread.sleep(3000);
		WebElement done = driver.findElement(By.xpath("(//*[@type='button'])[80]"));
		done.click();
		
		
		
		
		

	}

}
