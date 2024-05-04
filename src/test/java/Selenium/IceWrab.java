package Selenium;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IceWrab {

    WebDriver driver ; 
    SoftAssert soft = new SoftAssert();

    
    @Test (priority = 1)
    public void setBrowser(){

     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.manage().deleteAllCookies();
     driver.get("http://www.icewarp.co.in/");
     driver.findElement(By.xpath("//a[text()='Accept']")).click();

    }
    @Test (priority = 2)
    public void setProduct_download(){
       WebElement ele= driver.findElement(By.xpath("//ul//li//a[text()='Product']"));
       ele.click();
        System.out.println("click on product");
        driver.findElement(By.xpath("//div[text()='Download']")).click();
        System.out.println("Clicked on download button");

    }
    @Test (priority = 3)
    public void get3Sections(){
        List<WebElement> sections = driver.findElements(By.xpath("//div//h3[@class='downloads-main-card-title']"));

        System.out.println("Total sections found: " + sections.size());
        
        List<String> expectedTexts = Arrays.asList("New installation", "Update", "Apps");
        
        boolean allTextsFound = true;
        
        for (WebElement section : sections) {
            String sectionText = section.getText();
            System.out.println("Text: " + sectionText);
            
            if (!expectedTexts.contains(sectionText)) {
                System.out.println("ERROR: Unexpected text found - " + sectionText);
                allTextsFound = false;
            }
        }
        
        if (allTextsFound) {
            System.out.println("All expected section were found.");
        } else {
            System.out.println("Not all expected section were found.");
        }

    }

    @Test (priority = 4)
    public void clickOnApp(){
        driver.findElement(By.xpath("(//a[text()='Continue'])[2]")).click();
        System.out.println("clicked on app");
    }

    @Test (priority = 5)
    public void get10Items(){
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='download-box-app-left-title']"));

        System.out.println("Total sections found: " + items.size());
        
        List<String> expectedTexts = Arrays.asList(
        "IceWarp Mobile",
        "IceChat Mobile",
        "Authenticator",
        "Desktop Client",
        "IceWarp Desktop Suite",
        "Outlook Sync",
        "FileSync",
        "ChatGPT",
        "Remote Management Console",
        "Microsoft Exchange Migration Tool"
    );

        boolean allTextsFound = true;
        
        for (WebElement item : items) {
            String itemText = item.getText();
            System.out.println("Text: " + itemText); 
      
            if (!expectedTexts.contains(itemText)) {
                System.out.println("ERROR: Unexpected text found - " + itemText);
                allTextsFound = false;
            }
        }
        
        if (allTextsFound) {
            System.out.println("All expected items were found.");
        } else {
            System.out.println("Not all expected items were found."); 
        }

    }

    
    @Test(priority = 6)
    public void verifyDownloadOption() {
    SoftAssert soft = new SoftAssert();

    verifyDownloadOption("IceWarp Mobile", "(//div[@class='download-box-app app-mobile'])[1]//a[contains(@class,'download-box-app-apple-img') or contains(@class,'download-box-app-android-img')]", soft);
    verifyDownloadOption("IceChat Mobile", "(//div[@class='download-box-app app-mobile'])[2]//a[contains(@class,'download-box-app-apple-img') or contains(@class,'download-box-app-android-img')]", soft);
    verifyDownloadOption("Authenticator", "(//div[@class='download-box-app app-mobile'])[3]//a[contains(@class,'download-box-app-apple-img') or contains(@class,'download-box-app-android-img')]", soft);
    verifyDownloadOption("Desktop Client", "(//div[@class='download-box-app app-desktop'])[1]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]", soft);
    verifyDownloadOption("IceWarp Desktop Suite", "(//div[@class='download-box-app app-desktop'])[2]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]", soft);
    verifyDownloadOption("Outlook Sync", "(//div[@class='download-box-app app-desktop'])[3]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]", soft);
    verifyDownloadOption("FileSync", "(//div[@class='download-box-app app-desktop'])[4]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]", soft);
    verifyDownloadOption("ChatGPT", "//div[@class='download-box-app app-integrations']//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-android-img')]", soft);
    verifyDownloadOption("Remote Management Console", "(//div[@class='download-box-app app-admin'])[1]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]", soft);
    verifyDownloadOption("Microsoft Exchange Migration Tool", "(//div[@class='download-box-app app-admin'])[2]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]", soft);

    soft.assertAll();
}

    private void verifyDownloadOption(String optionName, String xpath, SoftAssert soft) {
    try {
        WebElement option = driver.findElement(By.xpath(xpath));
        System.out.println("In '" + optionName + "' Download option is present: " + option.isEnabled());
    } catch (Exception e) {
        System.out.println("In '" + optionName + "' Download option is NOT present " );
        soft.assertTrue(false, "In '" + optionName + "' Download option is not present.");
    }
}
@Test (priority = 7)
public void homePage(){
    driver.navigate().back();
    driver.navigate().back();

}

@Test(priority = 10)
public void  tearDown() throws InterruptedException{
    Thread.sleep(5000);
    driver.quit();
}


    public void verifyDownloadOption1(){
       
        try {
            WebElement option1 = driver.findElement(By.xpath("(//div[@class='download-box-app app-mobile'])[1]//a[contains(@class,'download-box-app-apple-img') or contains(@class,'download-box-app-android-img')]"));
            System.out.println("In 'IceWarp Mobile' Download button is enabled." + option1.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'IceWarp Mobile' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'IceWarp Mobile' Download option is not present " );
        }

        try {
            WebElement option2 = driver.findElement(By.xpath("(//div[@class='download-box-app app-mobile'])[2]//a[contains(@class,'download-box-app-apple-img') or contains(@class,'download-box-app-android-img')]"));
            System.out.println("In 'IceChat Mobile' Download button is enabled." + option2.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'IceChat Mobile' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'IceChat Mobile' Download option is not present " );
        }

        try {
            WebElement option3 = driver.findElement(By.xpath("(//div[@class='download-box-app app-mobile'])[3]//a[contains(@class,'download-box-app-apple-img') or contains(@class,'download-box-app-android-img')]"));
            System.out.println("In 'Authenticator' Download button is enabled." + option3.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'Authenticator' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'Authenticator' Download option is not present " );
        }

        try {
            WebElement option4 = driver.findElement(By.xpath("(//div[@class='download-box-app app-desktop'])[1]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]"));
            System.out.println("In 'Desktop Client' Download button is enabled." + option4.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'Desktop Client' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'Desktop Client' Download option is not present " );
        }

        try {
            WebElement option5 = driver.findElement(By.xpath("(//div[@class='download-box-app app-desktop'])[2]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]"));
            System.out.println("In 'IceWarp Desktop Suite' Download button is enabled." + option5.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'IceWarp Desktop Suite' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'IceWarp Desktop Suite' Download option is not present " );
        }

        try {
            WebElement option6 = driver.findElement(By.xpath("(//div[@class='download-box-app app-desktop'])[3]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]"));
            System.out.println("In 'Outlook Sync' Download button is enabled." + option6.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'Outlook Sync' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'Outlook Sync' Download option is not present " );
        }

        try {
            WebElement option7 = driver.findElement(By.xpath("(//div[@class='download-box-app app-desktop'])[4]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]"));
            System.out.println("In 'FileSync' Download button is enabled." + option7.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'FileSync' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'FileSync' Download option is not present " );
        }

        try {
            WebElement option8 = driver.findElement(By.xpath("//div[@class='download-box-app app-integrations']//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-android-img')]"));
            System.out.println("In 'ChatGPT' Download button is enabled." + option8.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'ChatGPT' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'ChatGPT' Download option is not present " );
        }

        try {
            WebElement option9 = driver.findElement(By.xpath("(//div[@class='download-box-app app-admin'])[1]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]"));
            System.out.println("In 'Remote Management Console' Download button is enabled." + option9.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'Remote Management Console' Download option is not present " );
           soft.assertTrue(false, "In 'Remote Management Console' Download option is not present " );
        }

        try {
            WebElement option10 = driver.findElement(By.xpath("(//div[@class='download-box-app app-admin'])[2]//a[contains(@class,'download-box-app-apple-button') or contains(@class,'download-box-app-windows-button')]"));
            System.out.println("In 'Microsoft Exchange Migration Tool' Download button is enabled." + option10.isEnabled());
         
        } catch (Exception e) {
           System.out.println("In 'Microsoft Exchange Migration Tool' Download option is not present : " + e.getMessage());
           soft.assertTrue(false, "In 'Microsoft Exchange Migration Tool' Download option is not present " );
        }


        soft.assertAll();
    
}

    
}
