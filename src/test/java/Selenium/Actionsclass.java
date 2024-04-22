package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseTest_Selenium.BaseTest;

public class Actionsclass  extends BaseTest{

   

   // @Test(priority = 1)
    public void actions(){

        driver.get("https://www.flipkart.com/");
        test.info("get url : " + driver.getCurrentUrl());

       WebElement loginBtn = driver.findElement(By.xpath("//a[@title='Login']"));

        Actions action = new Actions(driver);

        action.moveToElement(loginBtn).perform();

        driver.findElement(By.xpath("//img[@alt='Gift Cards']")).click();

    }
   // @Test(priority = 2)
    public void doubleMouseclick(){
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        test.info("get url : " + driver.getCurrentUrl());
        Actions action = new Actions(driver);
      WebElement ele= driver.findElement(By.xpath("//button[contains(text(),'Double')]"));

      action.doubleClick(ele).perform();

      test.info("used double click function");
    }


    @Test(priority = 3)
    public void drag_drop(){
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        test.info("get url : " + driver.getCurrentUrl());
        Actions action = new Actions(driver);

      WebElement drag= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));  //source
      WebElement drop= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]")); //distination

      action.dragAndDrop(drag, drop).perform();

     // action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();

      test.info("used drag -drop function");
    }



    
}
