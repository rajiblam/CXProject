package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import BaseClass.BaseClass;

public class AudienceConfigurationPage extends BaseClass {

	@FindBy(xpath="//p[text()='Audience']")
	private WebElement audienceMenu;
	
	@FindBy(xpath = "//p[text()='Configurations']")
	private WebElement configurationSubMenu;
	
	@FindBy(xpath = "//button[text()='Custom Attributes']")
	private WebElement customAttributesTab;
	
	@FindBy(xpath = "//button[text()='Add Attribute']")
	private WebElement clickAddAttributeButton;
	
	@FindBy(name = "labelName")
	private WebElement enterAttributeName;
	
	@FindBy(xpath = "//textarea[@placeholder='Type description']")
	private WebElement enterDescriptionText;
	
	@FindBy(xpath = "//div[text()='Select the data type']")
	private WebElement selectDataTypeDropDown;
	
	@FindBy(xpath = "//div[text()='String']")
	private WebElement selectDataType;
	
	@FindBy(xpath = "(//input[@class='chakra-switch__input'])[2]")
	private WebElement clickEnableStatusCheckbox;
	
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement footerAddButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement footerCancelButton;
	
//===============Constructor Open============
	public AudienceConfigurationPage()
	{
		PageFactory.initElements(driver, this);
	}
	//=====================Closed===============
	
	public void clickAudienceMenu()
	{
		Action.click(driver, audienceMenu);
	}
	public void clickConfigurationSubMenu()
	{
		Action.explicitWait(driver, configurationSubMenu, Action.expWait);
		Action.click(driver, configurationSubMenu);
	}
	public void clickCustomAttributeTab()
	{
		Action.explicitWait(driver, customAttributesTab, Action.expWait);
		Action.click(driver, customAttributesTab);
	}
	public void clickAddAttributeButton()
	{
		Action.click(driver, clickAddAttributeButton);
	}
	public void enterAttributeName()
	{
		Action.explicitWait(driver, enterAttributeName, Action.expWait);
		Action.type(enterAttributeName, "Auto"+Action.timeStamp1());
	}
	public void enterDescriptionText()
	{
		Action.type(enterDescriptionText, "This is testing description of user create attribute");
	}
	public void clickDataTypeDropDown()
	{
		Action.click(driver, selectDataTypeDropDown);
	}
	public void selectDataTypeAttribute()
	{
		Action.click(driver, selectDataType);
	}
	public void clickEnableStatusCheckbox()
	{
		Action.click(driver, clickEnableStatusCheckbox);
	}
	public void scrollVertical()
	{
		Action.scrollElement(footerCancelButton);
	}
	public void ClickAddFooterButton()
	{
		Action.explicitWait(driver, footerAddButton, Action.expWait);
		Action.click(driver, footerAddButton);
	}
	public String assertionChecking()
	{
		return customAttributesTab.getText();
	}
}
