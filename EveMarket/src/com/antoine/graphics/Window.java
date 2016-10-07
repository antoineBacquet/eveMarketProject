package com.antoine.graphics;



import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	
	private JFrame frame;
	
	private JPanel panel;
	
	private Menu menu;
	
	
	public Window(){
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1600,900);


		menu = new Menu();
		frame.setJMenuBar(menu.getMenu());
		
		
	
		//frame.setContentPane(contentPane.getUI());
		
		/*JPanel panelTest = new JPanel();
		panelTest.*/
		

		frame.setVisible(true);
	}
	

}
