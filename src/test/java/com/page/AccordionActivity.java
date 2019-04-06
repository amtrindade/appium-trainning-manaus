package com.page;

import com.core.CoreActivity;

public class AccordionActivity extends CoreActivity {

	public void openSoftwareTest() {
		clickByText("Teste de Software");
	}

	public void openDeveloper() {
		clickByText("Desenvolvedor");
	}

	public void openAgile() {
		clickByText("Metodologias Ágeis");
	}
	
}
