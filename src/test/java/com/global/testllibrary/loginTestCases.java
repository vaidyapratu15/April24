package com.global.testllibrary;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import com.global.library.Utilities;
import com.global.testclass.BaseTest;

public class loginTestCases extends BaseTest {
	
	
	@Test (priority = 0)
	public void seturl() throws IOException, ParseException {
		driver.get(Utilities.getJsonData("url"));
	}
	
	@Test (priority = 1)
	public void userLogin() throws IOException, ParseException {
		loginPage.getLoginPageUn(Utilities.getJsonData("username"));
		loginPage.getLoginPagepwd(Utilities.getJsonData("password"));	
		loginPage.clickOnLoginbutton();
	}
	
	@Test (priority = 2)
	public void actionOnDashbord() throws InterruptedException {
		Thread.sleep(10000);
		//loginPage.clickOnDashoard();
	}
	@Test (priority = 3)
	public void reportBtn() {
		loginPage.clickOnreportBtn();
	}
	@Test (priority = 4)
	public void clicOnEnrollmentReport() throws InterruptedException {
		Thread.sleep(5000);
		loginPage.clicOnEnrollmentReport();
		Thread.sleep(10000);
	}
	@Test(priority = 5)
	public void selectPolicy() {
		loginPage.selectYear();
	}
	
	
    
	
	
	
	
	
	

	
	
	
	
	
	

}
