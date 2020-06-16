package com.jbk.bdd.steps;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.jbk.bdd.CommonUtility;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TableTest extends CommonUtility {

	String loginFile = "F:\\cucumber-maven\\src\\main\\java\\com\\jbk\\bdd\\inputdata\\Login.properties";
	WebDriver driver = getDriver();

	@Given("^open users page$")
	public void open_users_page() {
		try {
			driver.get("file:///F:/Offline%20Website/index.html");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify logid \"(.*?)\"$")
	public void user_verify_logid() {
		try {
			// for (Map<String, String> data :
			// usercredentials.asMaps(String.class, String.class)) {

			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(loginFile).getProperty("UNameXpath")))
					.sendKeys(("Username"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify logpwd \"(.*?)\"$")
	public void user_verify_logpwd() {

		try {

			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(loginFile).getProperty("PassXparh")))
					.sendKeys(("Password"));

			Thread.sleep(5000);

			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(loginFile).getProperty("SubmitbtnXpath")))
					.click();

			driver.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
