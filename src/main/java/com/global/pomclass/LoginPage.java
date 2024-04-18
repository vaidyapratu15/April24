package com.global.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.global.library.BaseClass;

public class LoginPage extends BaseClass {
	
	Actions act = new Actions(driver);
	
	
	@FindBy(id="username")
	private WebElement id;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	
	@FindBy( xpath = "//div//a//span[text()='Dashboard']")
	private WebElement dashboardBtn;
	
	@FindBy( xpath = "//a//span[text()='Reports']")
	private WebElement reportBtn;
	
	@FindBy( xpath = "(//li[@class='p-menuitem'])[2]")
	private WebElement enrollmentreport;
	
	@FindBy( xpath = "//a//span[text()='Product Wise Enrollment Report']")
	private WebElement productWisereport;
	
	@FindBy(xpath ="//div[@id='pv_id_144']")
	private WebElement selectYr;
	
	
   
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   
	public String getLoginPageUn(String UN) {
		id.sendKeys(UN);
		return UN;
	}
	
	public String getLoginPagepwd(String password) {
		pass.sendKeys(password);
		return password;
	}
	
	public void clickOnLoginbutton() {
	  login.click();
	}
	
	public void clickOnDashoard() {
		dashboardBtn.click();
	}
	
    public void clickOnreportBtn() {
    	reportBtn.click();	
    }
    
    public void clicOnEnrollmentReport() throws InterruptedException {
    	act.moveToElement(enrollmentreport).perform();
    	Thread.sleep(1000);
    	act.moveToElement(productWisereport).perform();
    	productWisereport.click();
    }
	public void selectYear() {
		act.moveToElement(selectYr).perform();
		act.click(selectYr).perform();
		
	}
	
	
	
	

}
