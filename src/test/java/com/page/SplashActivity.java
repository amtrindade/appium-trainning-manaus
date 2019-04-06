package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.core.CoreActivity;
import com.core.DriverFactory;

public class SplashActivity extends CoreActivity{

	public void waitForInvisibleText(String value) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='"+value+"']")));
		
	}

}
