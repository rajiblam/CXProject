package TestClass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObject.CreateCampaignPageTransactional;

public class CreateCampaignTransactionalTest extends BaseClass{
	
public CreateCampaignPageTransactional campaignPageTran;
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
		BaseClass.setUp();
		userLogin();
		campaignPageTran=new CreateCampaignPageTransactional();
	}
	@AfterMethod
	public void close()
	{
		BaseClass.tearDown();
	}
	
	@Test(priority=1)
	public void createCampaignTransactionalType() throws InterruptedException
	{
		campaignPageTran.clickEngageMenu();
		campaignPageTran.clickCampaignSubMenu();
		campaignPageTran.clickCreateCampaignButton();
		campaignPageTran.enterValueInCampaignNameBox();
		campaignPageTran.selectWhatAppChannel();
		campaignPageTran.selectCampaignTypeTransactional();
		campaignPageTran.clickSaveAndNextButtonStepOne();
		campaignPageTran.selectSegmentInStepTwo();
		campaignPageTran.clickSaveAndNextButtonStepTwo();
		campaignPageTran.selectAutheticationTempFromStepThree();
		campaignPageTran.clickSaveAndNextButtonStepThree();
		campaignPageTran.clickSaveAndNextButtonStepFour();
		campaignPageTran.PageScrollDown();
		campaignPageTran.ClickSaveAsButton();
		campaignPageTran.ClickFinalSaveAsDraftButton();
		campaignPageTran.ClickPopUpOkayGotItButton();
		boolean status = driver.findElement(By.xpath("//p[text()='Engage']")).isDisplayed();
		Assert.assertTrue(status);
	}
}
