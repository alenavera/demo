package com.app.step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.app.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks {
	@Before
	public void setUp(Scenario scenario) {
		WebDriver driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			 scenario.attach(data, "image/png", scenario.getName());
		}
		Driver.closeDriver();
	}
}
