package com.eggtimer.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.eggtimer.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory implements Constants
{
	
		public static WebDriver driver;
		
		public String browser = "";
		
		
		public ReadProperties configProperties = new ReadProperties("./src/test/resources/config/config.properties");
		
		
		public void initializeDriver()
		{
			browser = configProperties.getPropertyValue(key_browser);
			String url = configProperties.getPropertyValue(key_url);
			if(driver == null)
			{
				if(browser.equalsIgnoreCase(browser_firefox))
				{
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				else if(browser.equalsIgnoreCase(browser_chrome))
				{
					WebDriverManager.chromedriver().setup();
				    driver = new ChromeDriver();
				}
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    driver.get(url);
			    
			}
		}
}
