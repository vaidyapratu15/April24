package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseTest_Selenium.BaseTest;

public class Tab extends BaseTest {

    @Test (priority = 0)
    public void openBrowse(){  // this program weote in file.html
        driver.get("https://skpatro.github.io/demo/links/");
        test.info(driver.getCurrentUrl());

    }

    @Test (priority = 1)
    public void switchToTab() throws InterruptedException{
        //click on new tab
        driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();

        //get child window
       Set<String> getallIds= driver.getWindowHandles();
       ArrayList<String> al = new ArrayList<>(getallIds);

       //get child id - for child id index is 1 and for main [0]
       driver.switchTo().window(al.get(1));
       test.info("get child url " +driver.getCurrentUrl());

       // click on training link from childWindow
       driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

      //click on main page
      driver.switchTo().window(al.get(0));
      test.info("getMain page url " +driver.getCurrentUrl());




      Thread.sleep(6000);
      driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();


    }
    
}
