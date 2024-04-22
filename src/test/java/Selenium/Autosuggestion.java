package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import BaseTest_Selenium.BaseTest;

public class Autosuggestion extends BaseTest {
 
   
@Test
 public void handleAutoSuggestion() {
    driver.get("https://www.google.com/");
    test.info("URL = : " + driver.getCurrentUrl());

    driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("iphone15");

    List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
    test.info("GetSize " + allElements.size());


    // Iterate through auto-suggestions and click on the expected one
    String expected = "iPhone 15 Pro";
    for (WebElement e : allElements) {
        String actual = e.getText();
        test.info(actual);

        if (actual.contains(expected)) { // Use contains instead of equals to match partial text
            test.info("Actual : " + actual + " : " + "expected :" + expected); 
            // Scroll to the element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
            // Click on the element
            e.click();
            test.info("clicked");
            break;
        }
    }
}

    
    public void ahandleAutosuggestion(){
        driver.get("https://www.google.com/");
        test.info("URL = : " + driver.getCurrentUrl());

        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("macbook");

       List<WebElement> allElement = driver.findElements(By.xpath("//li[@class='sbct PZPZlf sbre']"));
       test.info("GetSize " + allElement.size());
   


       String expected = "macbook air m2 Apple MacBook Air 2020 — Laptop";

       for (WebElement e : allElement){
       
         test.info(e.getText());
         String actual = e.getText();
       
        
         if (expected.equals(actual)){
            test.info("Actual : " + actual + " : " + "expected :" + expected); 
            e.click();
            test.info("clicked");
            break;
         }
         
       }

    
    

    


    }

  

  
    
}
