package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {

		@Test
		public void test1() 
		{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://d3lslnw17kc5b9.cloudfront.net/login");
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("demo@omind.com");
		driver.findElement(By.name("password")).sendKeys("Apple@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.close();
		String dash = driver.findElement(By.xpath("//p[text()='Dashboard']")).getText();
		Assert.assertEquals("Dashboard1", dash);
		System.out.println("Teting assert");
		System.out.println("This is new code change");
		System.out.println("New changes part II");
		System.out.println("This is new chnages 31 July");
		System.out.println("This is new chnages 31 July - 2");
	
		}
}
