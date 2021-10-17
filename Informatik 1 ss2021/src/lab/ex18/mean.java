package lab.ex18;

import hdm.shared.Toolbox;

public class mean {

	public static void main(String[] args) {
		
		double number1 = Toolbox.readDouble("Erster Wert  : ");
		double number2 = Toolbox.readDouble("Zweiter Wert : ");
		double number3 = Toolbox.readDouble("Dritter Wert : ");
		
		double durchschnitt = (number1 + number2 + number3) / 3;
		
		System.out.println("Das arythmetische Mittel beträgt " + durchschnitt);
		
	}
}
