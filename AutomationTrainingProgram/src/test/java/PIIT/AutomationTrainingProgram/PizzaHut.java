package PIIT.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PizzaHut 
{

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiha\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com");
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		
		WebElement Menu = driver.findElement(By.id("menu"));
		Menu.click();
		Thread.sleep(3000);
		
		WebElement Pizza = driver.findElement(By.xpath("//*[text()='Pizza']"));
		Pizza.click();
		Thread.sleep(3000);
		
		WebElement Popular = driver.findElement(By.linkText("Popular Pizzas"));
		Popular.click();
		Thread.sleep(3000);
		
		WebElement Order = driver.findElement(By.linkText("Order Now"));
		Order.click();
		Thread.sleep(3000);
		
		WebElement Deliver = driver.findElement(By.xpath("//*[text()='Delivery']"));
		Deliver.click();
		Thread.sleep(3000);
		
		WebElement Address = driver.findElement(By.id("syo-address1"));
		Address.sendKeys("1 Hausmann Rd");
		Thread.sleep(3000);
		
		WebElement City = driver.findElement(By.id("city"));
		City.sendKeys("Danbury");
		Thread.sleep(3000);
		
		/*
		WebElement State = driver.findElement(By.id("state"));
		State.click();
		State.sendKeys("c");
		*/
		
		Select State = new Select(driver.findElement(By.id("state")));
		State.selectByVisibleText("CT");
		Thread.sleep(3000);
		
		WebElement Zip = driver.findElement(By.id("zip-input"));
		Zip.sendKeys("06811");
		Thread.sleep(3000);
		
		WebElement Find = driver.findElement(By.id("ph-find-store"));
		Find.click();
		Thread.sleep(3000);
		
		
		
				
		
		

	}

}
