package PIIT.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;


public class Signout extends Utility
{
	@Test(priority = 1)
	public void f() throws InterruptedException, IOException
	{
		Home ob = new Home(driver);
		ob.Email();
		Pictures();
		ob.PsswordField();
		Pictures();
	  
		Thread.sleep(3000);
		ob.Forgot();
		ForgotPasswordPage id = new ForgotPasswordPage(driver);
		id.IdsSendKeys();
		id.SearchButtonClick();
		Thread.sleep(3000);

	}
  
	@Test(priority = 2, dependsOnMethods = "f")
	public void TextVerify()  throws InterruptedException
	{
		driver.navigate().back();
	  	Thread.sleep(3000);
	  	ForgotPasswordPage id = new ForgotPasswordPage(driver);
	  	String Questions = id.QuestionOfText();
	  	id.QuestionOfText();
	  	SoftAssert softit = new SoftAssert();
	  	softit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
	  	System.out.println("This is after assertion");
	  	softit.assertAll();
	}
  
}
