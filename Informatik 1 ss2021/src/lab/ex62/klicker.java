package lab.ex62;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class klicker extends JFrame{
	
	JPanel panel;
	
	public klicker(String string) {
		super(string);
		
		this.setSize(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		JButton myButton = new JButton("Do not push");
		myButton.addActionListener(new MyButtonHandlerDontPush(panel));
		JButton zweiterButton = new JButton(" drück mich ");
		zweiterButton.addActionListener(new MyButtonHandlerPleasePush(panel));
		
		panel.add(myButton);
		panel.add(zweiterButton);
		this.add(panel);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new klicker("ganz ez!");
		
	}
	
}
