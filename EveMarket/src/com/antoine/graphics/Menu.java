package com.antoine.graphics;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu{
	
	
	private JMenuBar menuBar;
	
	public Menu(){
		
		menuBar = new JMenuBar();
		
		addApiMenu();
		
	}
	
	
	public JMenuBar getMenu() {
		return menuBar;
	}
	
	
	private void addApiMenu(){
		
		JMenu menu = new JMenu("API");
		menuBar.add(menu);
		
		
		JMenuItem addApiItem = new JMenuItem("Add");
		menu.add(addApiItem);
		
		JMenuItem manageApiItem = new JMenuItem("Manage");
		menu.add(manageApiItem);
	}

}
