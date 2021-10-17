package lab.ex55;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HandlerFuerButton implements ActionListener {
	private int i;

	public HandlerFuerButton(int i) {
		this.i = i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Selbstzerstörungsknopf
		if (i == 1) {
			System.out.println("BUM!");
		}

		// Nichts besonderes knopf
		if (i == 2) {
			System.out.println("Langweiler!");
		}
	}

}
