package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import PageObject.LoginPage;

public class BaseClass {

	public static WebDriver driver=null;
	public LoginPage loginpage;
	public static Properties prop;
	
	@BeforeTest
	public void loadPropertiesFile() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigFile\\config.properties");
		prop.load(fis);
	}

	public static void setUp() //using singleton pattern for initialize browser.
	{
			String browserName=prop.getProperty("browser");		
			ChromeOptions options;
			//String browserName=bName;
			if(driver==null)
			{
				if(browserName.equalsIgnoreCase("chrome"))
				{
					options = new ChromeOptions();
					options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
////			        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));)
					Map<String, Object> prefs = new HashMap<>();
			        prefs.put("profile.password_manager_enabled", false);  //Disabling Password Manager:
			        prefs.put("credentials_enable_service", false); //Disabling Credentials Service:
			        options.setExperimentalOption("prefs", prefs);  // Setting Chrome Options:
					driver= new ChromeDriver(options);
				}
				else if(browserName.equalsIgnoreCase("firefox"))
				{
					driver=new FirefoxDriver();
				}
				
				else if(browserName.equalsIgnoreCase("edge"))
				{
					driver=new EdgeDriver();
				}
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(prop.getProperty("url"));
	}
	
	public static void tearDown()
	{
		driver.close();
		driver.quit();
		driver=null;
	}
	
	public void userLogin() throws InterruptedException
	{
		loginpage=new LoginPage();
		loginpage.userName();
		loginpage.password();
		loginpage.loginButton();
	}
}

