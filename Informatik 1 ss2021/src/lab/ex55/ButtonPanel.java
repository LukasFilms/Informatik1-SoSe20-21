package lab.ex55;
//Java Swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel{
	ButtonPanel(){
	
		JLabel einLabel = new JLabel("Ich bin ein Text auf dem Buttonpanel");
		this.add(einLabel);
		JButton knopf1 = new JButton("Selbstzerstörung");
		knopf1.addActionListener(new HandlerFuerButton(1));
		this.add(knopf1);
		JButton knopf2 = new JButton("Nichts besonderes");
		knopf2.addActionListener(new HandlerFuerButton(2));
		this.add(knopf2);
		
		
		
	}
	
}
