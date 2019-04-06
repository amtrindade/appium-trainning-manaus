package com.core;

import static com.core.DriverFactory.getDriver;
import static com.core.DriverFactory.quitDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;


public class CoreTest {
	
	@Rule
	public TestName testName = new TestName();
	
	@After
	public void tearDown() {
		takeScreenshot();
		getDriver().resetApp();
	}
	
	@AfterClass
	public static void tearDownClass() {
		quitDriver();
	}
	
	public void takeScreenshot() {		
		try {
			File screenshotAs = getDriver().getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
	

}
