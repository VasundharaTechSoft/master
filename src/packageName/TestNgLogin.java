package packageName;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgLogin {
	String url="https://in.yahoo.com/?p=us";
	String path= "E:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	@BeforeTest
	public void openUrl()
	{
		System.setProperty("webdriver.chrome.driver", path);
	 driver = new ChromeDriver();
		driver.get(url);


	}
@Test(priority=0)
	public void verifyTitle() {
		String expectedTitle = "Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	@Test(priority=1)
	public void verifySignUp() throws InterruptedException
	{
	
		WebElement signupButton =driver.findElement(By.xpath("//a[@id=\"uh-signin\"]"));
		signupButton.click();
		String expected="Yahoo – login";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected);
		Thread.sleep(5000);	
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#createacc\").click();");
		WebElement createButton =driver.findElement(By.xpath("//a[@id=\"createacc\"]"));
		createButton.click();
		String expected1="Yahoo";
		String actual1=driver.getTitle();
		Assert.assertEquals(actual1, expected1);
		
		
		
	}

}
