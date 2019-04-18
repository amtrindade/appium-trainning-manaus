package com.page;

import org.openqa.selenium.By;

import com.core.CoreActivity;

public class WebViewActivity extends CoreActivity{

	public String getValueByEditTextUser() {
		return getTextByElement(By.xpath("//android.widget.EditText[2]"));
	}

}
