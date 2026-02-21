package com.tfa.vtiger.testscripts;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.tfa.vtiger.utils.WebUtil;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;

import net.bytebuddy.implementation.bytecode.Throw;

public class BeseTest {
	
protected WebUtil webUtil ;
private static ExtentReports extentReports;
protected ExtentTest extentTest;
@BeforeSuite
public void BeforeSuit() {
	 extentReports =new ExtentReports();
	ExtentSparkReporter sparkReporter=	new ExtentSparkReporter("vtiger_automation_report.html");
	extentReports.attachReporter(sparkReporter);
}
@Parameters("browser")
@BeforeMethod
public void beforeMethod ( String browserName,Method method ) {
	 webUtil=new WebUtil();
	 String testNameString=method.getName();
	  extentTest=extentReports.createTest(method.getName());
	 webUtil.setExtentTest(extentTest);
	webUtil.launchBrowser(browserName);
	
	}
@AfterMethod
public void  afterMethod () {
	webUtil.browserClose();
}
@AfterSuite
public void afterSuite() {
	extentReports.flush();	
}
}
