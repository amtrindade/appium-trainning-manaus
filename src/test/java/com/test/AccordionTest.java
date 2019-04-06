package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.core.CoreTest;
import com.page.AccordionActivity;
import com.page.MenuActivity;

public class AccordionTest extends CoreTest {
	MenuActivity menu = new MenuActivity();
	AccordionActivity accordion = new AccordionActivity();
	
	@Test
	public void testOpenAccordion() {
		menu.scrollDown();
		menu.acessaAccordion();
		
		accordion.openSoftwareTest();
		assertTrue(accordion.existText("Automação com Appium"));
		
		accordion.openDeveloper();
		assertTrue(accordion.existText("DevOps Tools"));
		
		accordion.openAgile();
		assertTrue(accordion.existText("Scrum com Kanban"));
	}
	

}
