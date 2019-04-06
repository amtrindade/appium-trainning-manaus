package com.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.core.CoreTest;
import com.page.MenuActivity;
import com.page.TabsActivity;

public class TabsTest extends CoreTest{
	MenuActivity menu = new MenuActivity();
	TabsActivity tabs = new TabsActivity();
	
	@Test
	public void testValidateActionTabs() {
		menu.scroolDown();
		menu.acessaTabs();
		
		tabs.selectTabThree();
		assertTrue(tabs.existText("THREE SELECTED"));
		
		tabs.selectTabTwo();
		assertTrue(tabs.existText("TWO SELECTED"));
		
		tabs.selectTabOne();
		assertTrue(tabs.existText("ONE SELECTED"));
		
	}

}
