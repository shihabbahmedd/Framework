package PIIT.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiha\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		WebElement droppable = driver.findElement(By.linkText("Droppable"));
		droppable.click();
		driver.switchTo().frame(0);
		
		Thread.sleep(6000);
		WebElement ElementToDrag = driver.findElement(By.id("draggable"));
		WebElement DropToHere = driver.findElement(By.id("droppable"));
		Actions ob = new Actions(driver);
		ob.dragAndDrop(ElementToDrag,DropToHere).build().perform();
		
		Thread.sleep(6000);
		driver.switchTo().parentFrame();
		WebElement Sorting = driver.findElement(By.linkText("Sortable"));
		Sorting.click();
		
		
		
		
		
	}

}
