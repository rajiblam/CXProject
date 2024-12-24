package TestClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.BaseClass;
import PageObject.CreateTemplatePage;

public class CreateTemplateTest extends BaseClass{

	public CreateTemplatePage createtemplatepage;
	SoftAssert sAssert=new SoftAssert();
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
		BaseClass.setUp();
		userLogin();
		createtemplatepage=new CreateTemplatePage();
	}
	
	@AfterMethod
	public void close()
	{
		BaseClass.tearDown();
	}
	
	@Test(priority=1)
	public void createTemplate() 
	{
		createtemplatepage.clickEngageMenu();
		createtemplatepage.clickTemplateSubMenu();
		createtemplatepage.clickCreateTemplateButton();
		createtemplatepage.clickProceedTemplateButton();
		createtemplatepage.enterTemplateNameTextBox();
		createtemplatepage.clickSelectLanguageDropDown();
		createtemplatepage.selectLanguageTemplate();
		createtemplatepage.clickSaveAndNextTemplateButton();
		createtemplatepage.templateHeaderEnable();
		createtemplatepage.enterHeaderText();
		createtemplatepage.templateBodyText();
		createtemplatepage.enbleFooter();
		createtemplatepage.enterTextInFooterTemplate();
		createtemplatepage.enableButtonforQRandCTA();
		createtemplatepage.enableQuickReplyButton();
		createtemplatepage.markettingOptOutButton();
		createtemplatepage.enableCallToActionButton();
		createtemplatepage.clickCallToActionVisitWebsiteButton();
		createtemplatepage.enterURLinWebsiteURLButton();
		createtemplatepage.enterNameInCTAButton();
		sAssert.assertTrue(createtemplatepage.isEnableSendForApprovalButton());
		createtemplatepage.clickSaveAsDraftButton();
		createtemplatepage.finalOkayGotitConfirmationButton();
		sAssert.assertEquals("Create WhatsApp Template", createtemplatepage.assertWithCreateTemplateButton());
		sAssert.assertAll();
	}
}
