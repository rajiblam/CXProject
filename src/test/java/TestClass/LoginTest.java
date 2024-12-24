package TestClass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class LoginTest extends BaseClass {
	
		

	@BeforeMethod
	public void start() throws InterruptedException
	{
		BaseClass.setUp();
		userLogin();
	}
	@AfterMethod
	public void close()
	{
		BaseClass.tearDown();
	}
	
	@Test(priority=1)
	public void userLoginAndLogOut() throws InterruptedException
	{
//		Thread.sleep(3000);
		loginpage.clickProfileAvatar();
		loginpage.clickLogoutOption();
		loginpage.clickConfirmationOption();
		Assert.assertTrue(loginpage.homePageTextDisplay());
		//Assert.fail();
	}
	

}
