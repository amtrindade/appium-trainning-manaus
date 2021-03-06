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
		menu.scrollDown();
		menu.acessaTabs();
		
		tabs.selectTabThree();
		assertTrue(tabs.existText("THREE SELECTED"));
		
		tabs.selectTabTwo();
		assertTrue(tabs.existText("TWO SELECTED"));
		
		tabs.selectTabOne();
		assertTrue(tabs.existText("ONE SELECTED"));
	}
	
	@Test
	public void testValidateTextBySwipe() {
		menu.scrollDown();
		menu.acessaTabs();
		assertTrue(tabs.existText("ONE SELECTED"));
		
		tabs.swipeRight();
		assertTrue(tabs.existText("TWO SELECTED"));
		
		tabs.swipeRight();
		assertTrue(tabs.existText("THREE SELECTED"));
		
		tabs.swipeLeft();
		assertTrue(tabs.existText("TWO SELECTED"));
		
		tabs.swipeLeft();
		assertTrue(tabs.existText("ONE SELECTED"));
	}

}
