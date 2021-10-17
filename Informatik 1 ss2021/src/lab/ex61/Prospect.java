package lab.ex61;

import hdm.shared.MyBasicFrame;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Prospect extends JPanel {
	
	private JLabel prospectLabel;
	private JTextField emailField;
	private JCheckBox subscriptionBox;
	
	private ButtonGroup destinationButtons;
	private JRadioButton destination1;
	private JRadioButton destination2;
	private JRadioButton destination3;
	
	private JButton sendButton;
	
	
	public static void main(String[] args) {
		Prospect panel = new Prospect();
		new MyBasicFrame("Reiseprospekt", 320, 200, panel);
		
	}
	
	public Prospect() {
		this.prospectLabel = new JLabel("E-Mail Adresse:");
		this.emailField = new JTextField(9);
		this.subscriptionBox = new JCheckBox("Bitte senden Sie mir Informationen zu");
		this.destination1 = new JRadioButton("Schweden");
		this.destination2 = new JRadioButton("Finnland");
		this.destination3 = new JRadioButton("Norwegen");
		this.sendButton = new JButton("Anfrage abschicken");
		
		this.destinationButtons = new ButtonGroup();
		destinationButtons.add(destination1);
		destinationButtons.add(destination2);
		destinationButtons.add(destination3);
		
		this.add(prospectLabel);
		this.add(emailField);
		this.add(subscriptionBox);
		this.add(destination1);
		this.add(destination2);
		this.add(destination3);
		this.add(sendButton);
	}
	
	
}
