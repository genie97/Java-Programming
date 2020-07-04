package myPackage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;

public class SecondWindow extends JFrame{
	public static final int WIDTH =200;
	public static final int HEIGHT =200;
	
	public SecondWindow(){
		super();
		
		setSize(WIDTH, HEIGHT);
		
		Container contentPane = getContentPane();
		JLabel label = new JLabel("Now available in color!");
		contentPane.add(label);
		
		setTitle("Second Window");
		contentPane.setBackground(Color.BLUE);
		addWindowListener(new WindowDestroyer());
	}
	
	public SecondWindow(Color customColor){
		super();
		
		setSize(WIDTH,HEIGHT);
		
		Container contentPane = getContentPane();
		JLabel label = new JLabel("Now available in color!");
		contentPane.add(label);
		
		setTitle("Second Window");
		contentPane.setBackground(customColor);
		
		addWindowListener(new WindowDestroyer());
	}
	

}
