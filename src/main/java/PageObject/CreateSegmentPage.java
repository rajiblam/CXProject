package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import BaseClass.BaseClass;

public class CreateSegmentPage extends BaseClass{
	
	@FindBy(xpath="//div[contains(@class,'SidebarV2_modul')]//p[text()='Audience']")
	private WebElement clickAudienceMenu;
	
	@FindBy(xpath ="//p[text()='Segments']")
	private WebElement clickSegmentSubMenu;
	
	@FindBy(xpath="//button[text()='Create Segment']")
	private WebElement clickCreateSegmentBtn;
	
	@FindBy(xpath = "//p[text()='New blank segment']")
	private WebElement clickNewBlankSegment;
	
	@FindBy(xpath = "//button[text()='Save & Next']")
	private WebElement clickSaveAndNextBtn;
	
	@FindBy(xpath = "//img[@alt='arrow']")
	private WebElement clickAddFilterOption;
	
	@FindBy(xpath="//p[normalize-space()='User Details']")
	private WebElement clickUserDetailsOption;
	
	@FindBy(xpath="//section[contains(@id,'popover-content')]//input[@placeholder='Search']")
	private WebElement searchBox1;
	
	@FindBy(xpath="//p[text()='First Name']")
	private WebElement clickFirstName;
	
	@FindBy(xpath = "//p[text()='Select']")
	private WebElement clickSelectOption;
	
	@FindBy(xpath = "//p[text()='Contains']")
	private WebElement clickContains;
	
	@FindBy(xpath = "//div[@class='css-6hisoy']//input")
	private WebElement enterFirstName;
	
	@FindBy(xpath="//button[text()='Save & Next']")
	private WebElement clickSaveAndNextBtnStep2;
	
	@FindBy(xpath = "//input[@name='segmentName']")
	private WebElement enterSegmentName;
	
	@FindBy(xpath="//p[text()='Dynamic']")
	private WebElement selectDynamicSegmentType;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement clickSavebtn;
	
	@FindBy(xpath = "//button[text()='Okay, Got It']")
	private WebElement clickOkGotItConfirmationButton;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	private WebElement dashboard;
	
	public CreateSegmentPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAudienceMnu()
	{
		Action.click(driver, clickAudienceMenu);
	}
	
	public void clickSegmentSubMenu()
	{
		Action.click(driver, clickSegmentSubMenu);
	}
	
	public void clickCreateSegmentButton()
	{
		Action.click(driver, clickCreateSegmentBtn);
	}
	
	public void clickNewBlankSegment()
	{
		Action.click(driver, clickNewBlankSegment);
	}
	
	public void clickSaveAndNextButton()
	{
		Action.click(driver, clickSaveAndNextBtn);
	}
	
	public void clickAddFilterOption() throws InterruptedException
	{
		Action.click(driver, clickAddFilterOption);
		Action.explicitWait(driver, clickUserDetailsOption, Action.expWait);
	}
	
	public void clickUserDetailsOption() throws InterruptedException
	{
		Action.click(driver, clickUserDetailsOption);
		Action.explicitWait(driver, clickFirstName, Action.expWait);
	}
		
	/*public void enterTextInSeachBox() throws InterruptedException
	{
		//js.executeScript("document.getElementById('searchBox1').value='Mobile'");
		searchBox1.sendKeys("Mobile");
		Thread.sleep(3000);
		
	}
	public void pageScrollDown() throws InterruptedException
	{
		WebElement lastName = driver.findElement(By.xpath("//p[text()='Last Name']"));
		Action.JSPageScrollDown(lastName);
		Thread.sleep(3000);
	}*/
	
	public void clickFirstName1()
	{
		Action.click(driver, clickFirstName);
	}
	
	public void clickSelectOpt()
	{
		Action.click(driver, clickSelectOption);
	}
	
	public void clickContains()
	{
		Action.click(driver, clickContains);
	}

	public void enterFirstName() throws InterruptedException
	{
		Action.type(enterFirstName, "raj");
		Action.explicitWait(driver, clickSaveAndNextBtnStep2, Action.expWait);
	}
	
	public void clickSaveAndNextStep2()
	{
		Action.click(driver, clickSaveAndNextBtnStep2);
	}
	
	public void enterSegmentname()
	{
		Action.type(enterSegmentName, "Segment_Auto_"+Action.timeStamp1());
	}
	
	public void selectSegmentType()
	{
		Action.click(driver, selectDynamicSegmentType);
	}
	
	public void segmentSaveButton()
	{
		Action.click(driver, clickSavebtn);
	}
	
	public void okGotItConfiramtionBtn()
	{
		Action.click(driver, clickOkGotItConfirmationButton);
	}
	
	public void clickDashboard()
	{
		Action.click(driver, dashboard);
	}
}
