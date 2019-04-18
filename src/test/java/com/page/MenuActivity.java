package com.page;

import com.core.CoreActivity;

public class MenuActivity extends CoreActivity{

	public void acessaComponents() {
		 clickByText("Components");
	}

	public void acessaDialogs() {
		clickByText("Dialogs");
	}

	public void acessaTabs() {
		clickByText("Tabs");
	}
	
	public void acessaClicks() {
		clickByText("Clicks");
	}

	public void acessaSplash() {
		clickByText("Splash");
	}

	public void acessaAccordion() {
		clickByText("Accordion");
	}

	public void acessaDragAndDrop() {
		clickByText("Drag and Drop");
	}

	public void acessaWebView() {
		clickByText("WebView");
	}

}
