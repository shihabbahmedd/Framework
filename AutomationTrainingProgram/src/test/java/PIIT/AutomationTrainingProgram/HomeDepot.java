package PIIT.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot 
{

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiha\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com");
		driver.manage().window().maximize();
		
		WebElement Account = driver.findElement(By.id("headerMyAccount"));
		Account.click();
		Thread.sleep(3000);
		
		WebElement Register = driver.findElement(By.xpath("//*[text()='Register']"));
		Register.click();
		Thread.sleep(3000);
		
		WebElement Personal = driver.findElement(By.xpath("//*[text()='Select & Continue']"));
		Personal.click();
		Thread.sleep(3000);
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("test@test.com");
		Thread.sleep(3000);
		
		WebElement Password = driver.findElement(By.id("password-input-field"));
		Password.sendKeys("test");
		Thread.sleep(3000);
		
		WebElement ZipCode = driver.findElement(By.id("zipCode"));
		ZipCode.sendKeys("90210");
		Thread.sleep(3000);
		
		WebElement Phone = driver.findElement(By.id("phone"));
		Phone.sendKeys("1234567890");
		Thread.sleep(3000);
		
		WebElement SignIn = driver.findElement(By.xpath("//*[text()='Keep me signed in']"));
		SignIn.click();
		Thread.sleep(3000);
		
		WebElement Verify = driver.findElement(By.xpath("//*[text()='Verify my mobile number via text message or phone call']"));
		Verify.click();
		Thread.sleep(3000);
		
		/*	
		WebElement Robot = driver.findElement(By.xpath("//*[text()='I'm not a robot']"));
		Robot.click();
		Thread.sleep(3000);
		*/
		
		System.out.println("About to press create account");
		
		WebElement Create = driver.findElement(By.xpath("(//*[text()='Create an Account'])[2]"));
		Create.click();
		Thread.sleep(3000);

		System.out.println("Created account");
		

	}

}
