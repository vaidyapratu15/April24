package com.global.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchbrowser {
	
	 public static WebDriver driver;
    
	public void setbrowser() throws InterruptedException{
		
      //  WebDriver driver = null;
        
            // Setup ChromeDriver using WebDriverManager
            WebDriverManager.chromedriver().setup();

            // Set Chrome options
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-dev-shm-usage"); // Add this argument


            // Create an instance of ChromeDriver with options
            driver = new ChromeDriver(options);

            // Open a website
            String url = "https://www.example.com";
            driver.get(url);
            
            // Print current URL
            System.out.println("Current URL: " + driver.getCurrentUrl());

            // Maximize the browser window
            driver.manage().window().maximize();

            // Wait for a few seconds
            Thread.sleep(5000); // Wait for 5 seconds

       
           
                // Close the browser
                driver.quit();
           
        
    }
}