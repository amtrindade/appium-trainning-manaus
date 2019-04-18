package com.test;

import static com.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;

import com.core.CoreTest;
import com.page.MenuActivity;
import com.page.WebViewActivity;

public class WebViewTest extends CoreTest{
	
	MenuActivity menu = new MenuActivity();
	WebViewActivity web = new WebViewActivity();
	
	@Test
	public void testValidateUser() {
		menu.acessaWebView();
		
		Set<String> contextHandles = getDriver().getContextHandles();
		for(String valor: contextHandles) {
			System.out.println(valor);
		}
		getDriver().context((String) contextHandles.toArray()[1]);
		
		
		
		web.sendTextByElement(By.name("authorization.username"), "target");
		assertEquals("target", web.getValueByEditTextUser());
		
	}

}
