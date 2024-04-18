package com.global.testclass;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.mail.EmailException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.global.library.BaseClass;
import  com.global.library.Utilities;
import com.global.pomclass.LoginPage;

public class BaseTest extends BaseClass{
	
	@BeforeSuite
	public void lunchBrowser() {
		setUpBrowser();
	}
	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(8000);
		driver.quit();
	}
	
	@BeforeTest
	public void getExtentReport() {
		setExtentReport();
	}
	
	@AfterTest
	public void viewReport() throws IOException {
		extent.flush();
		Desktop.getDesktop().browse(new File("Extent Report.html").toURI());
	}
	
	@BeforeMethod
	public void createTest(ITestResult result , Method m) {
		String testName = result.getMethod().getRealClass().getSimpleName()+ " - " + result.getMethod().getMethodName();
		test = extent.createTest(testName , result.getMethod().getDescription()); 
	}
	
	@AfterMethod
	public void getStatus(ITestResult result , Method m) throws IOException {
		if ( result.getStatus() == ITestResult.FAILURE) {
	     Utilities.CaptureScreenshots(result.getMethod().getMethodName(), driver);
	     test.log(Status.FAIL, m.getName());
		}else {
			test.log(Status.PASS, m.getName());
		}
	}
	
	
	@AfterSuite
	public void setEmail() throws EmailException {
//		MailTestClass.setAttachEmailReport();
	}
	
	@BeforeClass
	public void pomPageObject() {
	 soft = new SoftAssert(); 
	 loginPage = new LoginPage(driver);
	}
	
	protected SoftAssert soft;
	protected LoginPage loginPage;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
