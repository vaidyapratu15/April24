package com.global.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	

	
	public static String CaptureScreenshots(String testCaseName, WebDriver driver) throws IOException {
	//	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File xyz = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		String datestamp = new SimpleDateFormat("yyyy_MM_dd").format(new Date());
		String timestamp = new SimpleDateFormat("hh_mm_ss").format(new Date());
		File distination = new File(System.getProperty("user.dir") + "//ScreenShots//" + datestamp + "//" + testCaseName
				+ timestamp + ".png");
		FileUtils.copyFile(xyz, distination);

		return System.getProperty("user.dir") + "//Screenshots//" + datestamp + "//" + testCaseName + timestamp
				+ ".png";
	}
	
	public static String getJsonData(String key) throws IOException, ParseException {
		JSONParser json = new JSONParser();
		String userDir = System.getProperty("user.dir");
		String filePath = userDir + "/Json/UIJsonData/data.json";
		JSONObject jsonObj = (JSONObject) json.parse(new FileReader(filePath));
		String value = (String) jsonObj.get(key);
		return value;
	}
	
	
	
	

}
