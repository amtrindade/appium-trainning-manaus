package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.core.CoreTest;
import com.page.ClicksActivity;
import com.page.MenuActivity;

public class ClicksTest extends CoreTest{
	
	MenuActivity menu = new MenuActivity();
	ClicksActivity clique = new ClicksActivity();
	
	@Before
	public void setUp() {
		menu.scrollDown();
		menu.acessaClicks();
	}
	
	@Test
	public void testValidadeLongClick() {
		clique.longClickByLongButton();
		assertEquals("Alerta de clique longo", clique.getTextTitleDialog());
	}
	
	@Test
	public void testValidadeDobleClick() {
		clique.dobleClickByDobleButton();
		assertEquals("Alerta de clique duplo", clique.getTextTitleDialog());
	}
	
	@Test
	public void testValidateWaitClick() {
		clique.clickByWaitButton();
		assertEquals("Alerta com espera", clique.getTextTitleDialog());
	}

}
