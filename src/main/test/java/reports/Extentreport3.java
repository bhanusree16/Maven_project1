package reports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.CaptureScreenshot;

public class Extentreport3 {
	
	WebDriver driver;
	ExtentHtmlReporter Htmlreport;
	@Test
	public void report3() throws IOException
	{
		Htmlreport = new ExtentHtmlReporter("C:\\eclipse\\ReportTools\\report3.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(Htmlreport);
		ExtentTest logger = report.createTest("test1");
		
		
		System.setProperty("webdriver.chrome.driver", "C:/eclipse/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://learn-automation.com");
		System.out.println("started");
		CaptureScreenshot.Screeshot(driver, "report3");
		logger.log(Status.INFO, "browser started");
		report.flush();
		
		ExtentTest logger1 = report.createTest("test2");
		
		logger1.fail("title verification failed", MediaEntityBuilder.createScreenCaptureFromPath("C:/eclipse/Javaprojects/Maven_project1/screenshots/report3.png").build());
		report.flush();
		driver.get("C:\\eclipse\\ReportTools\\report3.html");
		driver.close();
	}

}
