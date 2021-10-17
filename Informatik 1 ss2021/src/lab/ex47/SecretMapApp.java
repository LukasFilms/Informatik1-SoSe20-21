package lab.ex47;

import hdm.shared.Toolbox;

public class SecretMapApp {

	public static void main(String[] args) {

		short[][] image = Toolbox.loadImage("data/images/kitten.jpg");

		for (int x = 0; x < image.length; x++) {
			for (int y = 0; y < image[0].length; y++) {
				image[x][y] = (short) (image[x][y] * 0.5);
			}
		}
		Toolbox.showImage(image);

		// Part 2: Load secret map, adjust contrast and mirror horizontally
		image = Toolbox.loadImage("data/images/secret_map.png");
		maximizeContrast(image);
		mirrorHorizontally(image);
		Toolbox.showImage(image);
		
		//part 3: Load map, mirror horizontally, reveal message written in 'secret ink'
		image = Toolbox.loadImage("data/images/secret_map.png");
		mirrorHorizontally(image);
		revealSecretInk(image, (short) 149);
		Toolbox.showImage(image);
		

	}

	static void maximizeContrast(short[][] image) {

		short minimum = image[0][0];
		short maximum = image[0][0];

		for (short x = 0; x < image.length; x++) {
			for (short y = 0; y < image[0].length; y++) {
				if (image[x][y] < minimum) {
					minimum = image[x][y];
				}
				if (image[x][y] > maximum) {
					maximum = image[x][y];
				}
			}
		}
		// Linear scaling of intensities
		for (short x = 0; x < image.length; x++) {
			for (short y = 0; y < image[0].length; y++) {
				image[x][y] -= minimum;
				image[x][y] = (short) Math.round((image[x][y] * 255f / (maximum - minimum)));
			}
		}
	}
	
	static void mirrorHorizontally(short[][] image) {
		short[] tempColumn;
		for (short x = 0; x < (image.length / 2); x++) {
			tempColumn = image[x];
			image[x] = image[image.length - 1 - x];
			image[image.length - 1 - x] = tempColumn;

		}
	}
	
	static void revealSecretInk(short[][] image, short inkLevel) {
		for (short x = 0; x < image.length; x++) {
			for (short y = 0; y < image[0].length; y++) {
				if ((image[x][y] == inkLevel)) {
					image[x][y] = 0;
				} else {
					image[x][y] = 255;
				}
			}
		}
	}
}
