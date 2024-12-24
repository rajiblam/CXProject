package TestClass;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ActionDriver.Action;
import BaseClass.BaseClass;
import MyRetryAnalyzer.MyRetryAnalyzer1;
import PageObject.CreateCampaignPagePromotional;

public class CreateCampaignPromotionalTest extends BaseClass{

	public CreateCampaignPagePromotional campaignPage;
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
		BaseClass.setUp();
		userLogin();
		campaignPage=new CreateCampaignPagePromotional();
	}
	
	@AfterMethod
	public void close()
	{
		BaseClass.tearDown();
	}
	
	@Test(priority=1)
	public void createCampaignProcress() throws InterruptedException, TimeoutException
	{
		campaignPage.ClickEngageMenu();
		campaignPage.ClickCampaignSubMenu();
		campaignPage.clickCreateCampaignButton();
		campaignPage.EnterCampaignName();
		campaignPage.SelectWhatAppChannel();
		campaignPage.SelectCampaignTypePromotional();
		campaignPage.ClickSaveAndNextButton1();
		campaignPage.SelectSegmentCheckBox();
		campaignPage.clickSaveAndNextButton2();
		campaignPage.clickSegmentFromStepThree();
		campaignPage.ClickSaveAndNextButtonStep3();
		campaignPage.ClickSaveAndNextButtonStep4();
		campaignPage.PageScrollDown();
		campaignPage.ClickSaveAsButton();
		campaignPage.ClickFinalSaveAsDraftButton();
		campaignPage.ClickPopUpOkayGotItButton();
		boolean status = driver.findElement(By.xpath("//p[text()='Engage']")).isDisplayed();
		Assert.assertTrue(status);
	}
}
