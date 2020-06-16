package com.jbk.bdd.cucumber_maven;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;
import com.jbk.bdd.CommonUtility;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
// html // json //xml
@RunWith(Cucumber.class)
@CucumberOptions(
monochrome = true, 
format = {  "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 

 
glue = {"com.jbk.bdd.steps"},
features = { "classpath:cucumber/tabletest.feature"},
tags={"@tag7"}
)
public class RunWebsiteTest {
	
	
	/*@AfterClass
	public static void writeExtentReport() {
//		String extentfile = "C:\\Users\\king\\Desktop\\cucumber'\\cucumber-maven\\target\\extent-config.xml";
		Reporter.loadXMLConfig(new File(CommonUtility.getReportConfigPath()));
		  Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		     Reporter.setSystemInfo("Machine", "Windows 7" + "64 Bit");
		     Reporter.setSystemInfo("Selenium", "3.7.0");
		     Reporter.setSystemInfo("Maven", "3.5.2");
		     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	
	}*/

}





/**
 * format = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"}, 
 */












