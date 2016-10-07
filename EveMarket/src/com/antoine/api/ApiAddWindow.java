package com.antoine.api;

import javax.swing.JFrame;

public class ApiAddWindow {
	
	private static final int HEIGHT = 500;
	
	private static final int WIDTH = 500;
	
	private JFrame frame;
	
	public ApiAddWindow(){
		
		frame = new JFrame("Add API");
		
		frame.setSize(HEIGHT, WIDTH);
		
		frame.setResizable(false);
		
		frame.setVisible(true);
		
	}

}
