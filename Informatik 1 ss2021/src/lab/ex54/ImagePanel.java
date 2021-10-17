package lab.ex54;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	public Image image;

	public ImagePanel(String imageName) {
		try {
			// read from file
			File file = new File(imageName);
			image = ImageIO.read(file);
		} catch (IOException e) {
			// IOException to find file
			System.out.println("file doesnt exist");
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}
}
