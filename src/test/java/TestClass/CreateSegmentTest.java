package TestClass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import MyRetryAnalyzer.MyRetryAnalyzer1;
import PageObject.CreateSegmentPage;

public class CreateSegmentTest extends BaseClass{
	
	public CreateSegmentPage createsegpage;
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
		BaseClass.setUp();
		userLogin();
		createsegpage=new CreateSegmentPage();
	}
	@AfterMethod
	public void close()
	{
		BaseClass.tearDown();
	}

	@Test(priority=1)
	public void createSegmentCX() throws InterruptedException
	{
		createsegpage.clickAudienceMnu();
		createsegpage.clickSegmentSubMenu();
		createsegpage.clickCreateSegmentButton();
		createsegpage.clickNewBlankSegment();
		createsegpage.clickSaveAndNextButton();
		createsegpage.clickAddFilterOption();
		createsegpage.clickUserDetailsOption();
		createsegpage.clickFirstName1();
		createsegpage.clickSelectOpt();
		createsegpage.clickContains();
		createsegpage.enterFirstName();
		createsegpage.clickSaveAndNextStep2();
		createsegpage.enterSegmentname();
		createsegpage.selectSegmentType();
		createsegpage.segmentSaveButton();
		createsegpage.okGotItConfiramtionBtn();
	}
}
