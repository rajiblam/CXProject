package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ActionDriver.Action;

public class GenerateExtentReportsCX {

	public static ExtentReports CXextentReportGenerate() throws IOException
	{
		ExtentReports ententReport=new ExtentReports();
		
		File extentReportFile=new File(System.getProperty("user.dir")+"\\Report\\extentReport\\CXProjectReport.html");
		ExtentSparkReporter sparkReporter= new ExtentSparkReporter(extentReportFile);
		
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("CX WA Project Automation Report");
		sparkReporter.config().setDocumentTitle("CX Project Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		ententReport.attachReporter(sparkReporter);
		
		Properties propReport1=new Properties();
		File propFilePath1=new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigFile\\config.properties");
		FileInputStream fis=new FileInputStream(propFilePath1);
		propReport1.load(fis);
		
		ententReport.setSystemInfo("Application URL :", propReport1.getProperty("url"));
		ententReport.setSystemInfo("Browser Name :", propReport1.getProperty("browser"));
		ententReport.setSystemInfo("Username : ", propReport1.getProperty("username"));
		ententReport.setSystemInfo("Password : ", propReport1.getProperty("password"));
		
		ententReport.setSystemInfo("OS Name :", System.getProperty("os.name"));
		ententReport.setSystemInfo("Machine User Name :", System.getProperty("user.name"));
		ententReport.setSystemInfo("Java Version :", System.getProperty("java.version"));
		
		return ententReport;
	}
}
