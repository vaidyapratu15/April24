package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import BaseTest_Selenium.BaseTest;

public class ListBox extends BaseTest{
   

    @Test (priority = 0)
    public void openBrowse(){  // this program weote in file.html
        driver.get("http://127.0.0.1:5500/src/test/java/ListBox/file.html");
        test.info(driver.getCurrentUrl());
   
    }

    @Test (priority = 1)
    public void selectOptionFromMultiselectBox() throws InterruptedException{

       WebElement selectCountry= driver.findElement(By.id("1234"));

       Select s = new Select(selectCountry);

        s.selectByVisibleText("IND");
        s.selectByIndex(2);   
        s.selectByVisibleText("Sri");
       // s.selectByValue("11"); here no value present 
       Thread.sleep(4000);

       test.info("----Check is multiple or not ----");


       boolean result = s.isMultiple();
       if (result ==true){
        test.info("is multiSlectable");
       }else{
        test.info("is singly Slectable"); 
       }
       Thread.sleep(4000);


       test.info("---- Get first selected option ----");
       String text = s.getFirstSelectedOption().getText();
       test.info(text);
     
      Thread.sleep(4000);

      test.info("---- Get all selected option ----");
       List<WebElement> alloption = s.getAllSelectedOptions();
       
       for (WebElement xx : alloption){
        test.info(xx.getText());
       }
     
      Thread.sleep(4000);

    }
   

    @Test (priority = 2)
    public void deSelectOptionFromMultiselectBox() throws InterruptedException{
    
       WebElement selectCountry= driver.findElement(By.id("1234"));

       Select s = new Select(selectCountry);

        s.selectByIndex(1);   
        s.selectByIndex(2);  
        s.selectByVisibleText("Sri");    Thread.sleep(4000);
       // s.selectByValue("11"); here no value present   
      

       s.deselectByIndex(1);   Thread.sleep(4000);

       s.deselectAll();

       test.info("---- Get all option present ----");
       List<WebElement> alloption = s.getOptions();
       
       for (WebElement xx : alloption){
       test.info(xx.getText());
       }



    }

// for facebook
public  void useSelectMethod() throws InterruptedException{
    driver.get("https://www.facebook.com/");

    WebElement  ele= driver.findElement(By.xpath("//div//a[text()='Create new account']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", ele);
      
     WebElement month= driver.findElement(By.id("month"));

     Select s = new Select(month);

    // s.selectByIndex(10);
     //s.selectByValue("11");
     s.selectByVisibleText("Nov");
     Thread.sleep(4000);
}






    
}
