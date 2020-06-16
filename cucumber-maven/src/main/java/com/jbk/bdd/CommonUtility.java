package com.jbk.bdd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonUtility {
	
protected static WebDriver driver;
protected static WebDriver getDriver(){
	System.setProperty("webdriver.chrome.driver", "chromedriver83.exe");
	if(driver==null){
		
		driver=new ChromeDriver();
	}
	return driver;
}
	

	public static Properties  readPropertiesFile(String fileName)  {
		FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      }  finally {
	         try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      }
	      return prop;
	   }

	
	public static String getReportConfigPath(){
	// properties = null;
	 String extpath= "C:\\Users\\king\\Desktop\\cucumber'\\cucumber-maven\\target\\extent-config.xml";
		String reportConfigPath = CommonUtility.readPropertiesFile(extpath).getProperty("extentpath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
}
