package com.page;

import org.openqa.selenium.By;

import com.core.CoreActivity;

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

}
