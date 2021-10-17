package lab.ex48;

import java.awt.Color;
import hdm.shared.Toolbox;

public class ReadColorImage {

	public static void main(String[] args) {

		// Part 1: Load image and scale intensity
		int[][] image = Toolbox.loadColorImage("data/images/kitten.jpg");
		int width = image.length;
		int height = image[0].length;

		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				image[i][j] = (int) (image[i][j] * 1.0);

				Color c = new Color(image[i][j]);
				int red = c.getRed();
				int green = c.getGreen();
				int blue = c.getBlue();

				Color rot = new Color(1.0f, 0.0f, 0.0f);
				Color rot1 = new Color(255, 0, 0);
				if ((i == width / 2) || (j == height / 2)) {
					image[i][j] = rot.getRGB();
				}
			}

		}
		Toolbox.showImage(image);
	}
	
}
