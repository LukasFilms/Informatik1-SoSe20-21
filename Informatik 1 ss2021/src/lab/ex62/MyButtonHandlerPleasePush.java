package lab.ex62;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MyButtonHandlerPleasePush implements ActionListener {
	JPanel panel;
	
	public MyButtonHandlerPleasePush(JPanel panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Please Push wurde gedrückt");
		panel.setBackground(Color.blue);
	}

}
