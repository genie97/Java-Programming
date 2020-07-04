package myPackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LayoutDemo extends JFrame implements ActionListener{
	public static final int WIDTH  = 500;
	public static final int HEIGHT  = 300;
	JPanel gridPane = new JPanel();
	Container content = getContentPane();
    public LayoutDemo() {
    	setSize(WIDTH,HEIGHT);
    	addWindowListener(new WindowDestroyer());
    	content.setLayout(new BorderLayout());
    	content.add(new JLabel("Four Layout Managers:"),BorderLayout.NORTH);
    	gridPane.setLayout(new GridLayout(2,2));
    	gridPane.add(new JLabel("BorderLayout"));
    	gridPane.add(new JLabel("FlowLayout"));
    	gridPane.add(new JLabel("GridLayout"));
    	gridPane.add(new JLabel("BoxLayout"));
    	content.add(gridPane,BorderLayout.CENTER);
    	JPanel buttonPanel = new JPanel();
    	buttonPanel.setLayout(new FlowLayout());
    	JButton RButton = new JButton("Red");
    	RButton.addActionListener(this);
    	buttonPanel.add(RButton);
    	JButton BButton = new JButton("Blue");
    	BButton.addActionListener(this);
    	buttonPanel.add(BButton);
    	JButton DButton = new JButton("Done");
    	RButton.addActionListener(this);
    	buttonPanel.add(DButton);
    	content.add(buttonPanel,BorderLayout.SOUTH);
    	DButton.addActionListener(this);
    }
	public static void main(String[] args){
		new LayoutDemo().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Red"))
			gridPane.setBackground(Color.RED);
		else if(e.getActionCommand().equals("Blue"))
			gridPane.setBackground(Color.BLUE);
		else if(e.getActionCommand().equals("Done")){
			System.exit(0);
		}
			
	}
}
