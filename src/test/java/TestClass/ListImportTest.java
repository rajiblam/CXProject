package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObject.ListImportPage;

public class ListImportTest extends BaseClass {
	
	ListImportPage listimportpage;
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
		BaseClass.setUp();
		userLogin();
	}
	//@AfterMethod
	public void close()
	{
		BaseClass.tearDown();
	}
	@Test(priority=1)
	public void ListImport() throws InterruptedException
	{
		listimportpage=new ListImportPage();
		listimportpage.ClickAudienceMenu();
		listimportpage.ClickListMenu();
		listimportpage.ClickImportListButton();
		listimportpage.EnterListName();
		listimportpage.ClickSelectFileButton();
	}
}
