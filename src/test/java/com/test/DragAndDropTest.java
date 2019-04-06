package com.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.core.CoreTest;
import com.page.DragAndDropActivity;
import com.page.MenuActivity;

public class DragAndDropTest extends CoreTest {
	
	MenuActivity menu = new MenuActivity();
	DragAndDropActivity drag = new DragAndDropActivity();
	
	private String[] initialList = new String[]{
			"Item 1", 
			"Item 2", 
			"Item 3",
			"Item 4",
			"Item 5",
			"Item 6"};
	
	private String[] partialList = new String[] {
			"Item 1", 
			"Item 3",
			"Item 4",
			"Item 5",
			"Item 2",
			"Item 6"};
	
	private String[] endList = new String[] {
			"Item 6",
			"Item 1", 
			"Item 3",
			"Item 4",
			"Item 5",
			"Item 2"};
	
	
	@Test
	public void testDragAndDrop() {
		menu.scrollDown();
		menu.acessaDragAndDrop();
		
		assertArrayEquals(initialList, drag.getPositionItems());
		drag.dragAndDrop("Item 2", "Item 5");
		
		assertArrayEquals(partialList, drag.getPositionItems());
		drag.dragAndDrop("Item 6", "Item 1");
		assertArrayEquals(endList, drag.getPositionItems());
	}
}
