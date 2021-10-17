package lab.ex54;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Aufgabe54 extends MeinFenster {

	public Aufgabe54(String imageName) {
		super(imageName);
		//String imageName = "data/images/kitten.jpg";
		getContentPane().add(new ImagePanel(imageName));
		setVisible(true);
	}

	public static void main(String[] args) {
		String imageName = " ";
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			imageName = chooser.getSelectedFile().getAbsolutePath();
			System.out.println("You chose to open this file: " + imageName);
		}

		new Aufgabe54(imageName);
	}

}
