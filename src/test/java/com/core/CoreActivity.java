package com.core;

import static com.core.DriverFactory.getDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

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
	
	public void scrool() {
		Dimension size = getDriver().manage().window().getSize();
		
		int x = size.width / 2;
		int yStart = (int) (size.height * 0.9);
		int yEnd = (int) (size.height * 0.1);
		
		new TouchAction(getDriver())
			.press(x, yStart)
			.waitAction(Duration.ofMillis(500))
			.moveTo(x, yEnd)
			.release()
			.perform();
	}
	
	public boolean existText(String value) {
		List<MobileElement> elements = getDriver().findElements(By.xpath("//*[@text='"+value+"']"));
		return elements.size() > 0;
	}
}
