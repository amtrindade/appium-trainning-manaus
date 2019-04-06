package com.page;

import static com.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;

import com.core.CoreActivity;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class DragAndDropActivity extends CoreActivity {

	public void dragAndDrop(String origem, String destino) {

		MobileElement origin = getDriver().findElement(By.xpath("//*[@text='"+origem+"']/../android.widget.ImageView"));
		MobileElement destiny = getDriver().findElement(By.xpath("//*[@text='"+destino+"']")); 

		new TouchAction(getDriver())
		.longPress(origin)
		.moveTo(destiny)
		.release()
		.perform();
	}

	public String[] getPositionItems() {
		List<MobileElement> elements = getDriver().findElements(By.id("com.example.atrindade.targettrainning:id/text"));

		String[] list = new String[elements.size()];
		for(int i = 0; i < elements.size(); i ++) {
			list[i] = elements.get(i).getText();
		}
		return list;
	}
}
