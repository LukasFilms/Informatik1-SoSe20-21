package lab.ex36;

import hdm.shared.Toolbox;

public class MethodsDemo4 {

	public static void main(String[] args) {
		
		long number = Toolbox.readLong("Bitte Zahl eingeben: "); 
		
		if(isNegative(number) == true) {
			System.out.println("die Zahl ist kleiner 0");
		} else {
			System.out.println("Die Zahl ist größer oder gleich 0");
		}
	}
	
	static boolean isNegative(long number) {
		
		if (number < 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
}
