package lab.ex62;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MyButtonHandlerDontPush implements ActionListener {
	JPanel panel;

	public MyButtonHandlerDontPush(JPanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Do not Pusk wurde gedrückt");
		panel.setBackground(Color.red);
	}

}
