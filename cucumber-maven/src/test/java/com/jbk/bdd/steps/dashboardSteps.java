package com.jbk.bdd.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.jbk.bdd.CommonUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class dashboardSteps extends CommonUtility {

	String dashboardfile = "F:\\cucumber-maven\\src\\main\\java\\com\\jbk\\bdd\\inputdata\\dashboard.properties";
	WebDriver driver = getDriver();
	// WebDriver driver;

	@Given("^user nevigate to homepage and check title$")
	public void user_is_on_homepage() {

		try {
		
			Assert.assertEquals(driver.getTitle(),
					CommonUtility.readPropertiesFile(dashboardfile).getProperty("dashtitle"),
					"act and exp title are not equal");
driver.manage().wait(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify dashboardlabel$")
	public void user_verify_dashboardlabel() {
		
		try {

			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(dashboardfile).getProperty("dashlabel_xpath")))
					.getText(), CommonUtility.readPropertiesFile(dashboardfile).getProperty("dash_label"), "act and exp label are not equal");
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify homelabe$")
	public void user_verify_homelabe() {

		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(dashboardfile).getProperty("homelabel_xpath")))
					.getText(), CommonUtility.readPropertiesFile(dashboardfile).getProperty("home_label"), "act and exp label are not equal");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Then("^user verify neworder window$")
	public void user_verify_neworder_window() {
		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(dashboardfile).getProperty("neworder_xpath")))
					.getText(), CommonUtility.readPropertiesFile(dashboardfile).getProperty("neworder_label"), "act and exp label are not equal");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify bouncerate window$")
	public void user_verify_bouncerate_window() {
		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(dashboardfile).getProperty("bouncerate_xpath")))
					.getText(), CommonUtility.readPropertiesFile(dashboardfile).getProperty("bouncerate_label"), "act and exp label are not equal");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify userregistration window$")
	public void user_verify_userregistration_window() {
		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(dashboardfile).getProperty("userregistration_xpath")))
					.getText(), CommonUtility.readPropertiesFile(dashboardfile).getProperty("userregistration_label"), "act and exp label are not equal");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify unoquevisitors window$")
	public void user_verify_unoquevisitors_window() {
		try {
			Assert.assertEquals(driver
					.findElement(
							By.xpath(CommonUtility.readPropertiesFile(dashboardfile).getProperty("unoquevisitors_xpath")))
					.getText(), CommonUtility.readPropertiesFile(dashboardfile).getProperty("unoquevisitors_label"), "act and exp label are not equal");
		//driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}