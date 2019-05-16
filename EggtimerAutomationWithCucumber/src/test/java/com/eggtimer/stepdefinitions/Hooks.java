package com.eggtimer.stepdefinitions;

import com.eggtimer.utils.DriverFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DriverFactory
{

	@Before
	public void setUp()
	{
		initializeDriver();
	}
	
	
	@After
	public void tearDown()
	{
		driver.close();
		driver = null;
	}
}
