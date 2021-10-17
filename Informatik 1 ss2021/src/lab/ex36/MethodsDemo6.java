package lab.ex36;

import hdm.shared.Toolbox;

public class MethodsDemo6 {
	
	public static void main(String[] args) {
		System.out.println("Bitte Die Coordinaten des oberen linken Ecks eingeben \n------------------------------------------------------");
		double x1 = Toolbox.readDouble("X coordinate obere  linke  Ecke: ");
		double y1 = Toolbox.readDouble("Y coordinate obere  linke  Ecke: ");
		double x2 = Toolbox.readDouble("X coordinate untere rechte Ecke: ");
		double y2 = Toolbox.readDouble("Y coordinate untere rechte Ecke: ");
		System.out.println("\nBitte Die Coordinaten Punktes eingeben\n------------------------------------------------------");
		double xp = Toolbox.readDouble("X Coordinate des punktes eingeben: ");
		double yp = Toolbox.readDouble("Y Coordinate des punktes eingeben: ");
		System.out.println("------------------------------------------------------\n");
		
		if (isContained(x1, y1, x2, y2, xp, yp) == true) {
			System.out.println("Der Punkt liegt innerhalb des Rechtecks.");
		}else {
			System.out.println("Der Punkt liegt auﬂerhalb des Rechtecks.");
		}
	}
	
	static boolean isContained(double x1, double y1, double x2, double y2, double xp, double yp) {
		
		if ( (x1 <= xp) && (xp <= x2) && (y1 <= yp) && (yp <= y2) ) {
			return true;
		}else {
			return false;
		}
		
	}

}
