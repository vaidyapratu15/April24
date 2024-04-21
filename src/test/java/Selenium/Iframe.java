package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseTest_Selenium.BaseTest;

public class Iframe extends BaseTest{

    @Test (priority = 0)
    public void switchToFrame(){

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

       // driver.switchTo().frame(1);  //index
        driver.switchTo().frame("iframeResult");    //frameName
       // driver.switchTo().frame("iframeResult");    //FramwID

       driver.findElement(By.xpath("//button[contains(text() , 'Click me to display')]")).click();



       // Switch to home  page

     //  driver.switchTo().parentFrame();
       driver.switchTo().defaultContent();

       driver.findElement(By.xpath("//a[id='tryhome']")).click();


    }

    

    
    
}
