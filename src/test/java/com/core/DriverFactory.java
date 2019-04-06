package com.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver(); 
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
		return driver;
	}

	private static void createDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "Nexus");
		desiredCapabilities.setCapability("automationName", "uiautomator");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, 
				"/home/atrindade/dev/workspace-umovme/testtrainningtarget/src/test/resources/TargetTrainning.apk");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}
}
