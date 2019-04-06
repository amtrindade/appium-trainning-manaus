package com.page;

import org.openqa.selenium.By;

import com.core.CoreActivity;
import com.core.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class ClicksActivity extends CoreActivity{

	public void longClickByLongButton() {
		
		MobileElement longButton = DriverFactory.getDriver().findElement(By.xpath("//*[@text='Clique Longo']"));
		
		new TouchAction(DriverFactory.getDriver())
			.longPress(longButton)
			.perform();
		
	}

	public void dobleClickByDobleButton() {
		clickByText("Clique Duplo");
		clickByText("Clique Duplo");
	}

	public void clickByWaitButton() {
		clickByText("Clique Wait");
	}
}
