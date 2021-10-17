package lab.ex52;

import java.awt.Color;

public class MyColor extends Color{

	private static final long serialVersionUID = 1L; // requested from compiler
	
	
	int red;
	int green;
	int blue;

	MyColor(int red, int green, int blue) {
		super(red, green, blue);
		this.red = red;
		this.green = green;
		this.blue = blue;

	}

	MyColor(int gray) {
		super(gray, gray, gray);
		this.red = gray;
		this.green = gray;
		this.blue = gray;
	}

	boolean isGray() {
		if (this.red == this.green && this.green == this.blue) {
			return true;
		} else {
			return false;
		}
	}
	
	float luminance() {
		return (0.2126f * this.red) + (0.7152f * this.green) + (0.0722f * this.blue);
	}
	
	boolean isBrighterThan(MyColor otherColor) {
		if(this.luminance() > otherColor.luminance()) {
			return true;
		} else {
			return false;
		}
	}
	
	static MyColor mixAdditive(MyColor c1, MyColor c2) {
	
		MyColor mixColor = new MyColor(0, 0, 0);
		
		mixColor.red = c1.red + c2.red;
		if (mixColor.red > 255) {
			mixColor.red = 255;
		}
		
		mixColor.green = c1.green + c2.green;
		if (mixColor.green > 255) {
			mixColor.green = 255;
		}
		
		mixColor.blue = c1.blue + c2.blue;
		if (mixColor.blue > 255) {
			mixColor.blue = 255;
		}
		
		return mixColor;
	}

}
