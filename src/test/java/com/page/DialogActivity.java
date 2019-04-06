package com.page;

import com.core.CoreActivity;

public class DialogActivity extends CoreActivity{

	public void clickByButtonConfirmation() {
		clickByText("Confirmação");
	}

	public void dismiss() {
		clickByText("Sim");
	}

	public void clickByButtonOk() {
		clickByText("Ok");
	}

}
