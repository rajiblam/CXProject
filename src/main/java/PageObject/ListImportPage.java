package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;
import ActionDriver.Action;

public class ListImportPage extends BaseClass {
	
	@FindBy(xpath="//span[text()='Audience']")
	WebElement clickAudienceMenu;
	
	@FindBy(xpath="//span[text()='List']")
	WebElement listMenu;
	
	@FindBy(xpath="//button[text()='Import List']")
	WebElement importListButton;
	
	@FindBy(xpath="//input[@id='listName']")
	WebElement enterListName;
	
	@FindBy(xpath="//button[text()='Select file']")
	WebElement slectFileButton;
	
	public ListImportPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void ClickAudienceMenu()
	{
		Action.click(driver, clickAudienceMenu);
		Action.explicitWait(driver, listMenu, 10);
	}
	
	public void ClickListMenu()
	{
		Action.click(driver, listMenu);
	}
	
	public void ClickImportListButton()
	{
		Action.click(driver, importListButton);
	}
	
	public void EnterListName() throws InterruptedException
	{
		Action.type(enterListName, "listname13July");
		Action.explicitWait(driver, slectFileButton, 10);
	}
	
	public void ClickSelectFileButton()
	{
		
		WebElement iframePath = driver.findElement(By.xpath("//iframe[contains(@src,'mocambo.omindtech')]"));
		driver.switchTo().frame(iframePath);
		Action.click(driver, slectFileButton);
		//Action.JSClick(slectFileButton);
	}
}
