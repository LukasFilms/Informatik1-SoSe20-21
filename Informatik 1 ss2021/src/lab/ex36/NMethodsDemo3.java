package lab.ex36;

import hdm.shared.Toolbox;

public class NMethodsDemo3 {
	
	public static void main(String[] args) {
		
		int number1 = Toolbox.readInt("number 1: ");
		int number2 = Toolbox.readInt("number 2: ");
		
		System.out.println("Die Nummer " + maximum(number1, number2) + " ist größer");
	}
	
	static int maximum(int number1,int number2){
		
		if (number1 < number2) {
			return number2;
		} else {
			return number1;
		}
		
	}

}
