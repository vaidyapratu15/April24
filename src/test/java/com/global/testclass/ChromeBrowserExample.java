package com.global.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowserExample {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
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

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                // Close the browser
                driver.quit();
            }
        }
    }
}