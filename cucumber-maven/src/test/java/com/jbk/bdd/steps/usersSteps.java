package com.jbk.bdd.steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.jbk.bdd.CommonUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class usersSteps extends CommonUtility {

	String userfile = "F:\\cucumber-maven\\src\\main\\java\\com\\jbk\\bdd\\inputdata\\user.properties";
	WebDriver driver = getDriver();

	@Given("^user nevigate to user page$")
	public void user_nevigate_to_user_page() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("users_xpath"))).click();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify title$")
	public void user_verify_title() {
		try {
			Assert.assertEquals(driver.getTitle(), CommonUtility.readPropertiesFile(userfile).getProperty("userstitle"),
					"act and exp title are not same");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user click on add user$")
	public void user_click_on_add_user() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("adduserBtn_xpath")))
					.click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user verify horizontalform label$")
	public void user_verify_horizontalform_label() {
		try {
			Assert.assertEquals(
					driver.findElement(
							By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("horizontal_xpath")))
							.getText(),
					CommonUtility.readPropertiesFile(userfile).getProperty("horizontal_label"),
					"act and exp label are not same");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user put username$")
	public void user_put_username() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("username_xpath")))
					.sendKeys(CommonUtility.readPropertiesFile(userfile).getProperty("put_uname"));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user put mobile$")
	public void user_put_mobile() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("mobile_xpath")))
					.sendKeys(CommonUtility.readPropertiesFile(userfile).getProperty("put_mobileno"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user put email$")
	public void user_put_email() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("email_xpath")))
					.sendKeys(CommonUtility.readPropertiesFile(userfile).getProperty("put_email"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user select gender$")
	public void user_select_gender() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("gender_xpath")))
					.click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user select state$")
	public void user_select_state() {
		try {
			WebElement state = driver
					.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("state_xpath")));

			Select select = new Select(state);
			select.selectByVisibleText(CommonUtility.readPropertiesFile(userfile).getProperty("sel_state"));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user set password$")
	public void user_set_password() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("password_xpath")))
					.sendKeys(CommonUtility.readPropertiesFile(userfile).getProperty("put_pwd"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() {
		try {
			driver.findElement(By.xpath(CommonUtility.readPropertiesFile(userfile).getProperty("submitBtn_xpath")))
					.click();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Then("^user click on popup$")
	public void user_click_on_popup() {
		try {
			Alert popup = driver.switchTo().alert();
			popup.accept();
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}