package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import BaseClass.BaseClass;

public class CreateCampaignPageTransactional extends BaseClass{

	@FindBy(xpath="//p[text()='Engage']")
	private WebElement engageMenu;
	
	@FindBy(xpath="//p[text()='Campaign']")
	private WebElement campaignSubMenu;
	
	@FindBy(xpath = "//button[text()='Create Campaign']")
	private WebElement createCampaignButton;
	
	@FindBy(name = "campaignName")
	private WebElement campaignNameBox;
	
	@FindBy(xpath = "//p[text()='WhatsApp']")
	private WebElement selectWhatsAppChannel;
	
	@FindBy(xpath="//p[text()='Transactional']")
	private WebElement selectCampaignTypeTransactional;
	
	@FindBy(xpath="//button[text()='Save & Next']")
	private WebElement saveAndNextButtonStepOne;

	@FindBy(xpath = "//tbody/tr[2]/td[4]/div[1]/label[1]/span[1]")
	private WebElement selectSegmentStepTwo;
	
	@FindBy(xpath="//button[text()='Save & Next']")
	private WebElement saveAndNextButtonStepTwo;
    ////tbody/tr[5]/td[8]/div[1]/div[1]
	@FindBy(xpath="(//p[text()='pushpi_27']//following::div[@class='css-9p9nmu'])[2]")
	private WebElement selectAuthTemplateFromStepThree;
	
	@FindBy(xpath="//button[text()='Save & Next']")
	private WebElement saveAndNextButtonStepThree;
	
	@FindBy(xpath="//input[@placeholder='Enter value or select attribute']")
	private WebElement enterValueInTemplateHeadervariable;
	
	@FindBy(xpath="//button[text()='Save & Next']")
	private WebElement saveAndNextButtonStepFour;
	
   //=================Constructor open
	public CreateCampaignPageTransactional()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//p[text()='Draft']")
	private WebElement SaveAsdraft;
	
	@FindBy(xpath="//button[text()='Save As Draft']")
	private WebElement ClickSaveAsDraftButton;
	
	@FindBy(xpath = "//button[text()='Okay, Got It']")
	private WebElement ClickOkayGotItButton;
	
	//===============Constructor closed
	
	public void clickEngageMenu()
	{
		Action.click(driver, engageMenu);
	}
	public void clickCampaignSubMenu()
	{
		Action.explicitWait(driver, campaignSubMenu, Action.expWait);
		Action.click(driver, campaignSubMenu);
	}
	public void clickCreateCampaignButton()
	{
		Action.explicitWait(driver, createCampaignButton, Action.expWait);
		Action.click(driver, createCampaignButton);
	}
	public void enterValueInCampaignNameBox()
	{
		Action.type(campaignNameBox, "auto_"+Action.timeStamp1());
	}
	public void selectWhatAppChannel()
	{
		Action.click(driver, selectWhatsAppChannel);
	}
	public void selectCampaignTypeTransactional()
	{
		Action.click(driver, selectCampaignTypeTransactional);
	}
	public void clickSaveAndNextButtonStepOne()
	{
		Action.fluentWait(driver, saveAndNextButtonStepOne, Action.fluentWait);
		Action.click(driver, saveAndNextButtonStepOne);
	}
	public void selectSegmentInStepTwo() throws InterruptedException
	{
		Action.click(driver, selectSegmentStepTwo);
	}
	public void clickSaveAndNextButtonStepTwo()
	{
		Action.click(driver, saveAndNextButtonStepTwo);
	}
	public void selectAutheticationTempFromStepThree() throws InterruptedException
	{
		//Action.explicitWait(driver, selectAuthTemplateFromStepThree, Action.expWait);
		Thread.sleep(2000);
		Action.click(driver, selectAuthTemplateFromStepThree);
	}
	public void clickSaveAndNextButtonStepThree()
	{
		Action.click(driver, saveAndNextButtonStepThree);
	}
	public void entervalueInTemplateHeaderVariable()
	{
		Action.explicitWait(driver, enterValueInTemplateHeadervariable, Action.expWait);
		Action.type(enterValueInTemplateHeadervariable, " Ominders");
	}
	public void clickSaveAndNextButtonStepFour() throws InterruptedException
	{
		Thread.sleep(2000);
		//Action.explicitWait(driver, saveAndNextButtonStepFour, Action.expWait);
		Action.click(driver, saveAndNextButtonStepFour);
	}
	public void PageScrollDown()
	{
		Action.JSPageScrollDownPage();
	}
	
	public void ClickSaveAsButton()
	{
		Action.click(driver, SaveAsdraft);
	}
	
	public void ClickFinalSaveAsDraftButton()
	{
		Action.click(driver, ClickSaveAsDraftButton);
	}
	
	public void ClickPopUpOkayGotItButton()
	{
		Action.explicitWait(driver, ClickOkayGotItButton, Action.expWait);
		Action.click(driver, ClickOkayGotItButton);
	}
}
