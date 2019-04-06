package com.core;

import static com.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class CoreActivity {
	
	public void clickByText(String value) {
		getDriver().findElement(By.xpath("//*[@text='"+value+"']")).click();
	}
	
	public void clickByElement(By element) {
		getDriver().findElement(element).click();
	}
	
	public void waitTime(long value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void sendTextByElement(By element, String value) {
		getDriver().findElement(element).sendKeys(value);
	}
	
	public String getTextByElement(By element) {
		return getDriver().findElement(element).getText();
	}
	
	public String getTextTitleDialog() {
		return getTextByElement(By.id("android:id/alertTitle"));
	}
}
