package TestClass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import MyRetryAnalyzer.MyRetryAnalyzer1;
import PageObject.AudienceConfigurationPage;

public class AudienceConfigurationTest extends BaseClass {

public AudienceConfigurationPage audienceconfigpage;
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
		BaseClass.setUp();
		userLogin();
		audienceconfigpage=new AudienceConfigurationPage();
	}
	@AfterMethod
	public void close()
	{
		BaseClass.tearDown();
	}
	@Test(priority=1)
	public void createUserCustomAttribute() 
	{
		audienceconfigpage.clickAudienceMenu();
		audienceconfigpage.clickConfigurationSubMenu();
		audienceconfigpage.clickCustomAttributeTab();
		audienceconfigpage.clickAddAttributeButton();
		audienceconfigpage.enterAttributeName();
		audienceconfigpage.enterDescriptionText();
		audienceconfigpage.clickDataTypeDropDown();
		audienceconfigpage.selectDataTypeAttribute();
		audienceconfigpage.clickEnableStatusCheckbox();
		audienceconfigpage.scrollVertical();
		audienceconfigpage.ClickAddFooterButton();
		Assert.assertEquals("Custom Attributes", audienceconfigpage.assertionChecking());
	}
}
