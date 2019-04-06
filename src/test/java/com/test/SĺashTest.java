package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.core.CoreTest;
import com.page.MenuActivity;
import com.page.SplashActivity;

public class SĺashTest extends CoreTest{
	MenuActivity menu = new MenuActivity();
	SplashActivity splash = new SplashActivity();
	
	@Test
	public void testValidateMessage() {
		menu.acessaSplash();
		splash.waitForInvisibleText("TargetTrust");
		assertTrue(splash.existText("Splash foi exibido com sucesso"));
	}

}
