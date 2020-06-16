package com.jbk.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.jbk.bdd.CommonUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class logoutSteps extends CommonUtility{

	String logoutFile = "F:\\cucumber-maven\\src\\main\\java\\com\\jbk\\bdd\\inputdata\\logout.properties";
	WebDriver driver = getDriver();
	
	
	
@Given("^user click on logout button$")
public void user_click_on_logout_button()  {

	
	try {
driver.findElement(By.xpath(CommonUtility.readPropertiesFile(logoutFile).getProperty("logout_xpath"))).click();
	
	driver.manage().wait(2000);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}

@Then("^user check logout message$")
public void user_check_logout_message()  {

	
	try {

		Assert.assertEquals(driver.findElement(By.xpath(CommonUtility.readPropertiesFile(logoutFile).getProperty("msg_xpath"))).getText(), CommonUtility.readPropertiesFile(logoutFile).getProperty("logout_msg"), "exp and actual msg are not same ");
	driver.quit();
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
}