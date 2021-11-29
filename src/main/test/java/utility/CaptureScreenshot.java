package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {

	public static String  Screeshot(WebDriver Driver,String screenshotname) {
		TakesScreenshot ts = (TakesScreenshot)Driver;
		File src = (ts.getScreenshotAs(OutputType.FILE));
		String dest = "./screenshots/"+screenshotname+".png";
		try {
			
			FileUtils.copyFile(src, new File(dest));
			
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest;
		
		

	}

}
