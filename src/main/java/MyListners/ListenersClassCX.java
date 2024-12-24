package MyListners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ActionDriver.Action;
import ActionDriver.ScreenShotTakingCX;
import BaseClass.BaseClass;
import Utility.GenerateExtentReportsCX;

public class ListenersClassCX extends BaseClass implements ITestListener{

	String testName;
	ExtentReports extentReport1;
	ExtentTest extentTest1;
	
	@Override
	public void onStart(ITestContext context) {
		try {
			extentReport1 = GenerateExtentReportsCX.CXextentReportGenerate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		testName=result.getName();
		extentTest1 = extentReport1.createTest(testName);
		extentTest1.log(Status.INFO, "Test Execution started : "+testName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		testName=result.getName();
		extentTest1.log(Status.PASS, "Passed test cases : "+testName);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		testName=result.getName();
		
		ScreenShotTakingCX.takesScreenshot2(driver, result);
		String rootPath=System.getProperty("user.dir");
		extentTest1.addScreenCaptureFromPath(rootPath+"//Screenshots//"+result.getName()+Action.timeStamp1()+".png");
		extentTest1.log(Status.INFO, result.getThrowable());
		extentTest1.log(Status.FAIL, "Failed Test Case :"+testName);
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		testName=result.getName();
		extentTest1.log(Status.INFO, result.getThrowable());
		extentTest1.log(Status.SKIP, "Skipped test cases :"+testName);
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport1.flush();
		//open report after complete test execution automatically
				String rootPath=System.getProperty("user.dir")+"\\Report\\extentReport\\CXProjectReport.html";
				File extentReportPath=new File(rootPath);
				
				try {
					Desktop.getDesktop().browse(extentReportPath.toURI());
					}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
	}
	
	

}
