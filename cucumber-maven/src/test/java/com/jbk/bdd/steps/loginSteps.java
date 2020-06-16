package com.jbk.bdd.steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.jbk.bdd.CommonUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import com.jbk.bdd.CommonUtility;

public class loginSteps extends CommonUtility {

	String loginFile = "F:\\cucumber-maven\\src\\main\\java\\com\\jbk\\bdd\\inputdata\\Login.properties";
	WebDriver driver = getDriver();
	
	// @Test
	@Given("^user nevigate to url$")
	public void user_nevigate_to_url() {

		// Properties prop = readPropertiesFile(loginFile);
		// Write code here that turns the phrase above into concrete actions
		try {

			driver.get(CommonUtility.readPropertiesFile(loginFile).getProperty("URL"));
		driver.manage().wait(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@When("^title of login page verify$")
	public void title_of_login_page_is_() {
		try {
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "chromedriver79.exe"); WebDriver driver = new ChromeDriver();
			 */
			
			Assert.assertEquals(driver.getTitle(),
					CommonUtility.readPropertiesFile(loginFile).getProperty("LoninPageTitle"));
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^user validate the username$")
	public void user_validate_the_username() {
		try {
			// Thread.sleep(1000);
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(loginFile).getProperty("UNameXpath")))
					.sendKeys(CommonUtility.readPropertiesFile(loginFile).getProperty("USERNAME"));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Then("^user validate the password$")
	public void user_validate_the_password() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(loginFile).getProperty("PassXparh")))
					.sendKeys(CommonUtility.readPropertiesFile(loginFile).getProperty("PASSWORD"));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user click on  signup button$")
	public void user_click_on_signup_button() {
		try {

			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(loginFile).getProperty("SubmitbtnXpath")))
					.click();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user logged in successfully$")
	public void user_logged_in_successfully() {
		try {
			System.out.println(CommonUtility.readPropertiesFile(loginFile).getProperty("USERNAME")
					+ "is log in successfuly on AdminLTE");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
