package com.eggtimer.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eggtimer.pages.EggtimerPage;
import com.eggtimer.utils.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EggtimerStepDefinition extends DriverFactory {

	EggtimerPage timerPage;
	
	
	@Given("user open the browser and load the URL")
	public void user_open_the_browser_and_load_the_URL() 
	{
			timerPage = new EggtimerPage(driver);
	}

	@Then("home page should be appear")
	public void home_page_should_be_appear() 
	{
		Assert.assertTrue(timerPage.isGoButtonExists());
		
	}
	
	@When("enter time text {string}")
	public void enter_time_text(String userName) {
		timerPage.setTimerText(userName);
	}

	@When("click on go button")
	public void click_on_go_button() {
		timerPage.clickOnGoButton();
	}

	@Then("timer should start and shows remaining time")
	public void timer_should_start_and_shows_remaining_time() {
			WebDriverWait driverWait = new WebDriverWait(driver, 60);
			driverWait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertEquals(alert.getText(), message_timer_text);
			alert.accept();
			String currentUrl = driver.getCurrentUrl();
			String url = configProperties.getPropertyValue(key_url);
			Assert.assertEquals(url+url_25seconds, currentUrl);
			Assert.assertEquals(timerPage.getTimerExpiredText(), message_timer_text);
	}

	
	
}
