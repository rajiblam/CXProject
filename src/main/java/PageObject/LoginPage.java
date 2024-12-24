package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import BaseClass.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath = "//h2[text()='Start your remarkable journey with us!']")
	private WebElement homePageText;
	
	@FindBy(xpath="//input[@name='userId']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//label[@id='verificationCode-label']//parent::div//div//input[1]")
	private WebElement otp1;
	
	@FindBy(xpath="//label[@id='verificationCode-label']//parent::div//div//input[2]")
	private WebElement otp2;
	
	@FindBy(xpath="//label[@id='verificationCode-label']//parent::div//div//input[3]")
	private WebElement otp3;
	
	@FindBy(xpath="//label[@id='verificationCode-label']//parent::div//div//input[4]")
	private WebElement otp4;
	
	@FindBy(xpath="//label[@id='verificationCode-label']//parent::div//div//input[5]")
	private WebElement otp5;
	
	@FindBy(xpath="//label[@id='verificationCode-label']//parent::div//div//input[6]")
	private WebElement otp6;
	
	@FindBy(xpath = "//button[text()='Verify']")
	private WebElement clickVerifyBtn;
	
	@FindBy(xpath = "//div[@class='css-1n2mv2k']//button")
	private WebElement clickAvatar;
	
	@FindBy(xpath = "//p[text()='Logout']")
	private WebElement clickLogout;
	
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement clickYesConfirmation;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean homePageTextDisplay()
	{
		return homePageText.isDisplayed();
	}
	
	public void userName()
	{
		Action.type(userName, prop.getProperty("username"));
	}
	
	public void password()
	{
		Action.type(password, prop.getProperty("password"));
	}
	
	public void loginButton()
	{
		Action.explicitWait(driver, loginBtn, Action.expWait);
		Action.click(driver, loginBtn);
	}
	
	public void otp1()
	{
		Action.type(otp1, prop.getProperty("OTP1"));
	}
	public void otp2()
	{
		Action.type(otp2, prop.getProperty("OTP2"));
	}
	public void otp3()
	{
		Action.type(otp3, prop.getProperty("OTP3"));
	}
	public void otp4()
	{
		Action.type(otp4, prop.getProperty("OTP4"));
	}
	public void otp5()
	{
		Action.type(otp5, prop.getProperty("OTP5"));
	}
	public void otp6()
	{
		Action.type(otp6, prop.getProperty("OTP6"));
	}
	public void clickVerifyButton()
	{
		Action.click(driver, clickVerifyBtn);
	}
	public void clickProfileAvatar()
	{
		Action.click(driver, clickAvatar);
	}
	public void clickLogoutOption()
	{
		Action.explicitWait(driver, clickLogout, Action.expWait);
		Action.click(driver, clickLogout);
	}
	public void clickConfirmationOption() 
	{
		Action.explicitWait(driver, clickYesConfirmation, Action.expWait);
		Action.click(driver, clickYesConfirmation);
	}
}
