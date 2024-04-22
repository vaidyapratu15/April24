package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import BaseTest_Selenium.BaseTest;

public class customizeListBox extends BaseTest {

  // if we want to handle the list box but without select tagname  then by using action class we can handle.
   
  @Test
  public void end_Key() throws InterruptedException{

  driver.get("https://www.facebook.com/");
  test.info("getURL"+ " : " + driver.getCurrentUrl());


  WebElement  ele= driver.findElement(By.xpath("//div//a[text()='Create new account']"));
  JavascriptExecutor js = (JavascriptExecutor)driver;
  js.executeScript("arguments[0].click();", ele);
    
   WebElement month= driver.findElement(By.id("month"));
  

   Actions action = new Actions(driver);

   action.click(month).perform();

   action.sendKeys(Keys.END).perform();

   //navigate dec to aug 
   for (int i=1; i<=4; i++){
    action.sendKeys(Keys.ARROW_UP).perform(); 
   }

   Thread.sleep(2000);
   action.sendKeys(Keys.ENTER).perform(); // Select the currently focused option


}

public void home_Key() throws InterruptedException{

  driver.get("https://www.facebook.com/");
  test.info("getURL"+ " : " + driver.getCurrentUrl());


  WebElement  ele= driver.findElement(By.xpath("//div//a[text()='Create new account']"));
  JavascriptExecutor js = (JavascriptExecutor)driver;
  js.executeScript("arguments[0].click();", ele);
    
   WebElement month= driver.findElement(By.id("month"));
  

   Actions action = new Actions(driver);

   action.click(month).perform();

   action.sendKeys(Keys.HOME).perform();

   //navigate jan to aug 
   for (int i=1; i<=7; i++){
    action.sendKeys(Keys.ARROW_DOWN).perform(); // Navigate down one option
   }

   Thread.sleep(2000);
   action.sendKeys(Keys.ENTER).perform(); // Select the currently focused option


}
public void handleListBox() throws InterruptedException{

    driver.get("https://www.facebook.com/");
    test.info("getURL"+ " : " + driver.getCurrentUrl());


    WebElement  ele= driver.findElement(By.xpath("//div//a[text()='Create new account']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", ele);
      
     WebElement month= driver.findElement(By.id("month"));
     month.click();

     Actions action = new Actions(driver);
   
 
     // Perform a sequence of actions
     action.sendKeys(Keys.ARROW_DOWN).perform(); // Navigate down one option

     Thread.sleep(1000); // Add a small delay for the dropdown to respond

     action.sendKeys(Keys.ENTER).perform(); // Select the currently focused option  

}







}
