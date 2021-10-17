package lab.ex54;

import javax.swing.JFrame;

public class MeinFenster extends JFrame {

	public MeinFenster(String name) {
		super("Dateipfad: " + name);
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
