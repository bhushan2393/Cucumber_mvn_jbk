package com.jbk.bdd.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.bdd.CommonUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class operatorsStep extends CommonUtility {

	String operatorfile = "F:\\cucumber-maven\\src\\main\\java\\com\\jbk\\bdd\\inputdata\\operators.properties";
	WebDriver driver = getDriver();

	@Given("^user nevigate to operators$")
	public void user_nevigate_to_operators() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("operatorBtn"))).click();
driver.manage().wait(2000);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Then("^user check Label id$")
	public void user_check_Label_id() {
		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("id_xpath")))
					.getText(), CommonUtility.readPropertiesFile(operatorfile).getProperty("id_label"),"act and exp label are not equal");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Then("^user check Label operator$")
	public void user_check_Label_operator() {
		
		
		
		if(driver
				.findElement(By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("opedrator_xpath")))
					.getText()==CommonUtility.readPropertiesFile(operatorfile).getProperty("operator_label"));
		
		
		
		else{
			
				System.out.println("op label check failed");
				
			
		}
				
				/*Assert.assertTrue(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("opedrator_xpath")))
					.getText()==CommonUtility.readPropertiesFile(operatorfile).getProperty("operator_label"));
			*/
			
			/*Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("opedrator_xpath")))
					.getText(), CommonUtility.readPropertiesFile(operatorfile).getProperty("operator_label"), "act and exp label are not equal");*/

		
	}

	@Then("^user check Label date$")
	public void user_check_Label_date() {
		try {
			
			
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("date_xpath")))
					.getText(), CommonUtility.readPropertiesFile(operatorfile).getProperty("date_label"), "act and exp label are not equal");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Then("^user check Label status$")
	public void user_check_Label_status() {
		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("status_xpath")))
					.getText(), CommonUtility.readPropertiesFile(operatorfile).getProperty("status_label"), "act and exp label are not equal");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Then("^user check Label reason$")
	public void user_check_Label_reason() {
		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(operatorfile).getProperty("reason_xpath")))
					.getText(), CommonUtility.readPropertiesFile(operatorfile).getProperty("reason_label"), "act and exp label are not equal");
			driver.quit();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
}
