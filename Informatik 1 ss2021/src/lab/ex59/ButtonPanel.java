package lab.ex59;

import javax.swing.JButton;
import javax.swing.JPanel;
import hdm.shared.MyBasicFrame;

public class ButtonPanel extends JPanel {
	public static void main(String[] args) {
		ButtonPanel panel1 = new ButtonPanel(1);
		new MyBasicFrame("MyBasicFrame Demo", 300, 100, panel1);

		ButtonPanel panel2 = new ButtonPanel(2);
		new MyBasicFrame("MySeccondWindow", 300, 100, panel2);
	}

	public ButtonPanel(int i) {
		if (i == 1) {
			JButton button1 = new JButton("Drück mich");
			this.add(button1);
		
		} else if (i == 2) {
			JButton button2 = new JButton("Drück mich auch");
			this.add(button2);
		}
	}

}
