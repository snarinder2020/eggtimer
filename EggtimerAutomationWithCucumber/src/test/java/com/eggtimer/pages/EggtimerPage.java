package com.eggtimer.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EggtimerPage {
	
			WebDriver driver;
			
			@FindBy(how=How.ID, using="start_a_timer")
			WebElement timerText;
			
			@FindBy(how=How.ID, using="progressText")
			WebElement timerExpired;
			
			@FindBy(how=How.ID, using="timergo")
			WebElement goButton;
			
			public EggtimerPage(WebDriver driver)
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);
				
			}
			
			public void setTimerText(String userName)
			{
				timerText.clear();
				timerText.sendKeys(userName);
			}
			
			public void clickOnGoButton()
			{
				goButton.click();
			}
			
			public boolean isGoButtonExists()
			{
				return goButton.isDisplayed();
			}
			
			public String getTimerExpiredText()
			{
				return timerExpired.getText();
			}
	
}
