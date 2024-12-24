package ActionDriver;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.BaseClass;

public class Action extends BaseClass{
	
	public static final int expWait=10;
	public static final int impWait=10;
	public static final int fluentWait=30;
	
	public static JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void click(WebDriver driver, WebElement ele) 
	{

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}
	
	public static boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Locator Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}
	
	public static void explicitWait(WebDriver driver, WebElement element, int timeOut ) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static String timeStamp1()
	{
		Date d=new Date();
		return d.toString().replace(" ", "_").replace(":", "_");
	}
	
	public static void JSClick(WebElement ele)
	{
		js.executeScript("arguments[0].click();", ele);
	}
	
	public static void JSPageScrollDown(WebElement ele)
	{
		js.executeScript("arguments[0].scrollIntoView();", ele);
		//js.executeScript("window.scrollBy(0,100)", "");
	}
	
	public static void ZoomOutChrome()
	{
		String zoom="document.body.style.zoom='50.0%'";
		js.executeScript(zoom);
	}
	
	public static void JSPageScrollDownPage()
	{
		js.executeScript("window.scrollBy(0,100)", "");
	}
	
	public static void scrollElement(WebElement ele) 
	{
		Actions act = new Actions(driver);
		act.scrollToElement(ele);
	}
	
	public static void JSEnterText(WebElement ele)
	{
		js. executeScript("var element = document. getElementById('ele'); element. value = 'My text'");
	}
	
	public static void fluentWait(WebDriver driver,WebElement ele, int timeWait)
	{
		Wait<WebDriver> wait =null;
		try {
			   wait = new FluentWait<WebDriver>(driver)
              .withTimeout(Duration.ofSeconds(timeWait))
              .pollingEvery(Duration.ofSeconds(3))
              .ignoring(TimeoutException.class);
			   //wait till element to be clickable
		       wait.until(ExpectedConditions.elementToBeClickable(ele));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
