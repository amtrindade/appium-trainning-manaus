package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.core.CoreTest;
import com.page.ComponentsActivity;
import com.page.MenuActivity;

public class ComponentsTest extends CoreTest{
	
	MenuActivity menu = new MenuActivity();
	ComponentsActivity components = new ComponentsActivity();
	
	@Test
	public void testValidateSendKeysComponents() {
		menu.acessaComponents();		
		components.sendText("Antonio");
		assertEquals("Antonio", components.getValueByEditText());
	}
	
	@Test
	public void testValidateActivityComponents() throws InterruptedException {
		menu.acessaComponents();
		components.sendText("Antonio");
		components.selectValueToSpinnerCountry("Italy");
		components.clickSeekBar(0.8);
		components.save();
		
		assertEquals("Meu nome é: Antonio", components.getLabelFirst());
		assertEquals("Meu país de origem é: Italy", components.getLabelSecond());
		assertEquals("Hoje estou me sentindo de 0 a 10: 8", components.getLabelThird());
		//assertTrue(components.existText("Hoje estou me sentindo de 0 a 10: 5"));
	}
}
		
