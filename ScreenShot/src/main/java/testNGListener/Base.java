package testNGListener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{

	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mS\\Documents\\MonaQAjars\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	} 
	
	public void failed(String testMethodName) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\mS\\Documents\\Mona_Practice_QA"
				+ "\\ScreenShot\\ScreenshotsForFailedTest\\" + testMethodName + "_" + ".jpg"));
	}
	public void passed(String testMethod) throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\mS\\Documents\\Mona_Practice_QA"
				+ "\\ScreenShot\\ScreenshotsForPassedTest\\" + testMethod + "_" + ".jpg"));
	}
}
