package lab.ex52;

import hdm.shared.Toolbox;

public class MyColorApp {
	public static void main(String[] args) {
		
		MyColor cherryRed = new MyColor(255, 20, 18);
		MyColor neutralGray = new MyColor(128);
		MyColor lightGreen = new MyColor (0, 0, 240);
		MyColor darkGreen = new MyColor (0, 0, 55);
		MyColor red = new MyColor(255, 0, 0);
		MyColor green = new MyColor(0, 240, 0);
		
		MyColor redGreen = MyColor.mixAdditive(red, green); // ist 255/240/0 (=gelb).
		
		System.out.println(cherryRed.isGray()); // Gibt false aus
		System.out.println(neutralGray.isGray()); // Gibt true aus
		
		System.out.println(cherryRed.luminance());
		System.out.println(neutralGray.luminance());
		
		System.out.println(lightGreen.isBrighterThan(darkGreen)); // Gibt true aus.
		System.out.println(darkGreen.isBrighterThan(lightGreen)); // Gibt false aus.
		
		System.out.println(redGreen.red + ", " + redGreen.green + ", " + redGreen.blue);

		Picture();
	}
	
	static void Picture() {
		int hoehe=1000, breite=1000;
		int[][] kandinsky = new int[hoehe][breite];
		MyColor thisblue = new MyColor(8,13,144);
		for (int i=0; i<hoehe;i++) {
			for (int j=0;j<breite;j++) {
				kandinsky[i][j]=thisblue.getRGB();
			}
		}
		Toolbox.showImage(kandinsky);
	}
}
