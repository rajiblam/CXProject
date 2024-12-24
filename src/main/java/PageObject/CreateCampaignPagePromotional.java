package PageObject;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import BaseClass.BaseClass;

public class CreateCampaignPagePromotional extends  BaseClass{
	
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
	
	@FindBy(xpath = "//p[text()='Promotional']")
	private WebElement selectCampaignTypePromotional;
	
	@FindBy(xpath = "//button[text()='Save & Next']")
	private WebElement clickSaveAndNextButton;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/label[1]/span[1]")
	private WebElement selectSegmentCheckBox;
	
	@FindBy(xpath = "//button[text()='Save & Next']")
	private WebElement clickSaveAndNextButton2;
	
	@FindBy(xpath = "(//p[text()='23_sep_pb']//following::div[@class='css-9p9nmu'])[1]")
	private WebElement selectTemplateFromStep3;
	
	@FindBy(xpath="//button[text()='Save & Next']")
	private WebElement saveAndNextButton3;
	
	@FindBy(xpath="//button[text()='Save & Next']")
	private WebElement saveAndNextButton4;
	
	@FindBy(xpath = "//p[text()='Draft']")
	private WebElement SaveAsdraft;
	
	@FindBy(xpath="//button[text()='Save As Draft']")
	private WebElement ClickSaveAsDraftButton;
	
	@FindBy(xpath = "//button[text()='Okay, Got It']")
	private WebElement ClickOkayGotItButton;
	
	//Constructor for initialize locators
	public CreateCampaignPagePromotional()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickEngageMenu()
	{
		Action.click(driver, engageMenu);
		Action.explicitWait(driver, campaignSubMenu, Action.expWait);
	}
	
	public void ClickCampaignSubMenu()
	{
		Action.click(driver, campaignSubMenu);
		Action.explicitWait(driver, createCampaignButton, Action.expWait);
	}
	
	public void clickCreateCampaignButton()
	{
		Action.click(driver, createCampaignButton);
	}
	
	public void EnterCampaignName()
	{
		Action.type(campaignNameBox, "Campaign_"+Action.timeStamp1());
	}
	
	public void SelectWhatAppChannel()
	{
		Action.click(driver, selectWhatsAppChannel);
	}
	
	public void SelectCampaignTypePromotional()
	{
		Action.click(driver, selectCampaignTypePromotional);
	}
	
	public void ClickSaveAndNextButton1() throws InterruptedException, TimeoutException
	{
		Action.fluentWait(driver, clickSaveAndNextButton, Action.fluentWait);
		Action.click(driver, clickSaveAndNextButton);
	}

	public void SelectSegmentCheckBox()
	{
		Action.click(driver, selectSegmentCheckBox);
	}
	
	public void clickSaveAndNextButton2()
	{
		Action.click(driver, clickSaveAndNextButton2);
	}
	
	public void clickSegmentFromStepThree() throws InterruptedException
	{
		Thread.sleep(3000);
		Action.click(driver, selectTemplateFromStep3);
	}
	
	public void ClickSaveAndNextButtonStep3() throws InterruptedException
	{
		Action.fluentWait(driver, saveAndNextButton3, Action.fluentWait);
		Action.click(driver, saveAndNextButton3);
	}
	
	public void ClickSaveAndNextButtonStep4() throws InterruptedException
	{
		Thread.sleep(2000);
		Action.click(driver, saveAndNextButton4);
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
