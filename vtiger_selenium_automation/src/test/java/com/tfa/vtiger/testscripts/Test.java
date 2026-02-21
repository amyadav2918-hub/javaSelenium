package com.tfa.vtiger.testscripts;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports extentReports=new ExtentReports();
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("vtiger_report.html");
		extentReports.attachReporter(extentSparkReporter);
	ExtentTest extentTest=	extentReports.createTest("vt001VerifyLeadCreation");
		
	extentTest.log(Status.PASS,"User name correct");
	extentTest.log(Status.PASS,"Password is  incorrect");
	extentTest.log(Status.INFO,"User name correct");
	}
}