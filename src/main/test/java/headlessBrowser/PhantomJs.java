package headlessBrowser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import utility.CaptureScreenshot;

public class PhantomJs {

	public static void main(String[] args) {
		/**
		 * This piece of code doesn't work for me so i used line no 20 t0 22
		File src = new File("C:\\eclipse\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path",src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
 */
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\eclipse\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver(capabilities);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		CaptureScreenshot.Screeshot(driver, "googlepageopen");
		driver.quit();
		System.out.println("passed");

	}

}
