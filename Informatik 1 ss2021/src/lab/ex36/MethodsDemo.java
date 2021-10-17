package lab.ex36;

import hdm.shared.Toolbox;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		long number = Toolbox.readLong("Bitte eine Zahl eingeben: ");
		
		System.out.println("Die Zahl umgedreht lautet: " + flipSign(number));
	}
	
	public static long flipSign(long number) {
		return -number;
	}
}
