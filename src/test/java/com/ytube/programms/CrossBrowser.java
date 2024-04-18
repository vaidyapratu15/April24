package com.ytube.programms;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser {
	
    WebDriver driver;
    
   @Test
   @Parameters("browser")
	public void name (String browsername) {
    	
    	if (browsername.equals("chrome")) {
    	   driver = new ChromeDriver();
    	}
	    	
    	if (browsername.equals("edge")) {
    	   driver = new FirefoxDriver();
    	} 
    	
    	
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	
	
	
	
		
		
	

}
