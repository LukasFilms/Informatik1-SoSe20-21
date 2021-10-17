package lab.ex60;

import hdm.shared.MyBasicFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DestinationPanel extends JPanel{
	
	
	private JLabel travelDestinationLabel;
	private JTextField travelDestinationField;
	private JButton OrderButton;
	
	public static void main(String[] args) {
		DestinationPanel componentspanel = new DestinationPanel();
		new MyBasicFrame("Destination", 320, 150, componentspanel);
	}
	
	public DestinationPanel() {
		
		this.travelDestinationLabel = new JLabel("Reiseziel");
		this.add(travelDestinationLabel);
		
		this.travelDestinationField = new JTextField(9);
		this.add(travelDestinationField);
		
		this.OrderButton = new JButton("Anfrage abschicken");
		this.add(OrderButton);
	}
}
