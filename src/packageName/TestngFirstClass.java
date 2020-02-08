package packageName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngFirstClass {
	/*
	 * @ Test
	 * 
	 * public void verifyRegForm() { System.setProperty("webdriver.chrome.driver",
	 * "E:\\Selenium\\chromedriver_win32\\chromedriver.exe"); WebDriver driver= new
	 * ChromeDriver(); driver.get("http://facebook.com/"); WebElement TextBox1=
	 * driver.findElement(By.name("email")); TextBox1.sendKeys("9860335137");
	 * WebElement TextBox2= driver.findElement(By.name("pass"));
	 * TextBox2.sendKeys("Jitumsnap"); WebElement Button1=
	 * driver.findElement(By.xpath("//input[@value=\"Log In\"]")); Button1.click();
	 * WebElement cbutton=
	 * driver.findElement(By.xpath("//*[@id=\"checkpointSubmitButton\"]"));
	 * cbutton.click(); WebElement radio= driver.findElement(By.
	 * xpath("//div[@class=\"uiInputLabel clearfix\"]//input[@value=\"2\"]"));
	 * radio.click(); WebElement button1=
	 * driver.findElement(By.xpath("//*[@id=\"checkpointSubmitButton\"]"));
	 * button1.click(); }
	 * 
	 */ 
	@Test
	public void VerifyTitle() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();

	}

}
