package ActionDriver;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenShotTakingCX {

	public static void takesScreenshot2(WebDriver driver, ITestResult result)
	{
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String rootPath=System.getProperty("user.dir");
        try {
            // Specify the destination path and copy the screenshot there
            FileHandler.copy(srcFile, new File(rootPath+"//Screenshots//"+result.getName()+ Action.timeStamp1()+".png"));
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        }
	}
	
}
