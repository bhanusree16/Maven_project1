package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.CaptureScreenshot;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		CaptureScreenshot.Screeshot(driver, "Google_webpage");
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		CaptureScreenshot.Screeshot(driver, "searching");
		driver.quit();
		
		

	}

}
