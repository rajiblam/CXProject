package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import BaseClass.BaseClass;

public class CreateTemplatePage extends BaseClass {

	@FindBy(xpath="//p[text()='Engage']")
	private WebElement engageMenu;
	
	@FindBy(xpath ="//p[text()='Templates']")
	private WebElement templateSubMenu;
	
	@FindBy(xpath = "//button[text()='Create WhatsApp Template']")
	private WebElement createTemplateButton;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement clickTemplateProceedButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter template name']")
	private WebElement enterTemplateNameTextBox;
	
	@FindBy(xpath = "(//button[contains(@id,'popover-tri')]//p[text()='Select Language'])[2]")
	private WebElement clickSelectLanguageDropDown;
	
	@FindBy(xpath="(//input[@placeholder='Search'])[2]")
	private WebElement enterTextonSearchLanguageTextBox;
	
	@FindBy(xpath="(//p[text()='Albanian'])[2]")
	private WebElement selectLanguage;
	
	@FindBy(xpath="//button[text()='Save & Proceed']")
	private WebElement clickSaveAndNextButton;
	
	@FindBy(xpath = "(//input[@class='chakra-switch__input']//following-sibling::span)[1]")
	private WebElement templateHeaderEnable;
	
	@FindBy(id ="headerInput")
	private WebElement enterHeaderText;
	
	@FindBy(xpath = "(//input[@class='chakra-switch__input']//following-sibling::span)[2]")
	private WebElement templateEnableFooter;
	
	@FindBy(xpath = "(//input[@placeholder='Enter text in Albanian'])[2]")
	private WebElement enterFooterText;
	
	@FindBy(id = "InputBody")
	private WebElement templateBody;
	
	@FindBy(xpath = "(//input[@class='chakra-switch__input']//following-sibling::span)[3]")
	private WebElement enableButtonforQuickReplyAndCTA;
	
	@FindBy(xpath = "(//input[@class='chakra-switch__input']//following-sibling::span)[4]")
	private WebElement enableQuickReply;
	
	@FindBy(xpath = "(//div[@class='css-1mqd81m']//*[local-name()='svg'])[1]")
	private WebElement markettingOptOutButton;
	
	@FindBy(xpath="(//input[@class='chakra-switch__input']//following-sibling::span)[5]")
	private WebElement enableCallToAction;
	
	@FindBy(xpath = "(//div[@class='css-19p6jk8']//*[local-name()='svg'])[1]")
	private WebElement CTAVisitWebsiteButton;
	
	@FindBy(xpath = "//div[@class='chakra-input__group css-js4cmp']//input")
	private WebElement enterTextInCallToActionButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter Here']")
	private WebElement enterTextInWebsiteURL;
	
	@FindBy(xpath="//button[text()='Submit For Approval']")
	private WebElement submitForApprovalButton;
	
	@FindBy(xpath="//button[text()='Save As Draft']")
	private WebElement saveAsDraftButton;
	
	@FindBy(xpath="//button[text()='Okay, Got It']")
	private WebElement finalConfirmationOkayGotItButton;
	
	//====Constructor part==============================================
	public CreateTemplatePage()
	{
		PageFactory.initElements(driver, this);
	}
	//===========================================
	public void clickEngageMenu()
	{
		Action.click(driver, engageMenu);
	}
	public void clickTemplateSubMenu()
	{
		Action.explicitWait(driver, templateSubMenu, Action.expWait);
		Action.click(driver, templateSubMenu);
	}
	public void clickCreateTemplateButton()
	{
		Action.explicitWait(driver, createTemplateButton, Action.expWait);
		Action.click(driver, createTemplateButton);
	}
	public void clickProceedTemplateButton() 
	{
		Action.explicitWait(driver, clickTemplateProceedButton, Action.expWait);
		Action.click(driver, clickTemplateProceedButton);
	}
	public void enterTemplateNameTextBox()
	{
		Action.explicitWait(driver, enterTemplateNameTextBox, Action.expWait);
		Action.type(enterTemplateNameTextBox, "AutomationCX_"+Action.timeStamp1());
	}
	public void clickSelectLanguageDropDown()
	{
		Action.click(driver, clickSelectLanguageDropDown);
	}
	public void enterTextInSearchLanguageTextBox()
	{
		//Action.explicitWait(driver, enterTextonSearchLanguageTextBox, Action.expWait);
		Action.type(enterTextonSearchLanguageTextBox, "English");
	}
	public void scrollVertical()
	{
		Action.JSPageScrollDown(selectLanguage);
	}
	public void selectLanguageTemplate()
	{
		Action.explicitWait(driver, selectLanguage, Action.expWait);
		Action.click(driver, selectLanguage);
	}
	public void clickSaveAndNextTemplateButton()
	{
		Action.click(driver, clickSaveAndNextButton);
	}
	public void templateHeaderEnable()
	{
		Action.click(driver, templateHeaderEnable);
	}
	public void enterHeaderText()
	{
		Action.type(enterHeaderText, "This is demo header text");
	}
	public void templateBodyText()
	{
		Action.type(templateBody, "This is template demo body text");
	}
	public void enbleFooter()
	{
		Action.click(driver, templateEnableFooter);
	}
	public void enterTextInFooterTemplate()
	{
		Action.type(enterFooterText, "Type stop for unsubscribed ");
	}
	public void enableButtonforQRandCTA()
	{
		Action.click(driver, enableButtonforQuickReplyAndCTA);
	}
	public void enableQuickReplyButton()
	{
		Action.click(driver, enableQuickReply);
	}
	public void markettingOptOutButton()
	{
		Action.click(driver, markettingOptOutButton);
	}
	public void enableCallToActionButton()
	{
		Action.click(driver, enableCallToAction);
	}
	public void clickCallToActionVisitWebsiteButton()
	{
		Action.click(driver, CTAVisitWebsiteButton);
	}
	public void enterNameInCTAButton()
	{
		Action.type(enterTextInCallToActionButton, "Click Me");
		//Action.JSEnterText(enterTextInCallToActionButton);
	}
	public void enterURLinWebsiteURLButton()
	{
		Action.type(enterTextInWebsiteURL, "https://one.omind.ai/");
	}
	public boolean isEnableSendForApprovalButton()
	{
		return submitForApprovalButton.isEnabled();
	}
	public void clickSaveAsDraftButton()
	{
		Action.click(driver, saveAsDraftButton);
	}
	public void finalOkayGotitConfirmationButton()
	{
		Action.click(driver, finalConfirmationOkayGotItButton);
	}
	public String assertWithCreateTemplateButton()
	{
		return createTemplateButton.getText();
	}
}
