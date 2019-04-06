package com.page;

import org.openqa.selenium.By;

import com.core.CoreActivity;
import com.core.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class ComponentsActivity extends CoreActivity {

	public void sendText(String name) {
		sendTextByElement(By.id("com.example.atrindade.targettrainning:id/edtTextNome"), name);
	}

	public String getValueByEditText() {
		return getTextByElement(By.id("com.example.atrindade.targettrainning:id/edtTextNome"));
	}

	public void selectValueToSpinnerCountry(String string) {
		clickByText("Brazil");
		waitTime(1000L);
		clickByText("Italy");
	}

	public void save() {
		clickByText("Salvar");
	}

	public String getLabelFirst() {
		return getTextByElement(By.id("com.example.atrindade.targettrainning:id/txtMeuNome"));
	}

	public String getLabelSecond() {
		return getTextByElement(By.id("com.example.atrindade.targettrainning:id/txtPaisOrigem"));
	}

	public void clickSeekBar(double value) {
		int margem = 40;
		
		MobileElement seek = DriverFactory.getDriver().findElement(By.xpath("//android.widget.SeekBar"));
		
		int y = seek.getLocation().y + (seek.getSize().getHeight() / 2);
		int startX = seek.getLocation().x + margem;
		int endX = (int) (startX + (seek.getSize().getWidth() - (margem /2)) * value);
		
		new TouchAction(DriverFactory.getDriver())
			.tap(endX, y)
			.perform();
		
	}

	public String getLabelThird() {
		return getTextByElement(By.id("com.example.atrindade.targettrainning:id/txtMeuSentimento"));
	}

}
