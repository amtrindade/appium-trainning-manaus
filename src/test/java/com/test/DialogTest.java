package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.core.CoreTest;
import com.page.DialogActivity;
import com.page.MenuActivity;

public class DialogTest extends CoreTest{
	MenuActivity menu = new MenuActivity();
	DialogActivity dialog = new DialogActivity();
	
	@Test
	public void testValidaSimDialgoConfirmacao() {
		
		menu.acessaDialogs();
		dialog.clickByButtonConfirmation();
		assertEquals("Confirmação de ação", dialog.getTextTitleDialog());
		dialog.dismiss();
		assertEquals("Acionou o sim", dialog.getTextTitleDialog());
		
		dialog.clickByButtonOk();
	}
}
