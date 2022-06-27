package testNGListener;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class ScreenShotTest extends Base
{

	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	
	@Test
	public void takeScreenshotTest1()
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
	}
	
	@Test
	public void takeScreenshotTest2()
	{
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	}
	
	@Test
	public void takeScreenshotTest3()
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	
	@Test
	public void takeScreenshotTest4()
	{
		driver.findElement(By.xpath("//input[@val='10']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
