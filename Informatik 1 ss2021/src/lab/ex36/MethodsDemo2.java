package lab.ex36;

import hdm.shared.Toolbox;

public class MethodsDemo2 {
	
	public static void main(String[] args) {
		
		double number1 = Toolbox.readDouble("Bitte erste  kommazahl eingeben: ");
		double number2 = Toolbox.readDouble("Bitte zweite kommazahl eingeben: ");
		System.out.println("Die Summe der Zahlen lautet: " + add(number1, number2));
	}
	
	
	public static double add(double number1, double number2) {
		return number1 + number2;
	}
	

}
