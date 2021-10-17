package lab.ex24;

import hdm.shared.Toolbox;

public class EasyOperations {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------------------  ");
		System.out.println("Nach der eingabe beider Zahlen wird angezeigt, welche größer ist"   );
		System.out.println("und ob die Größere durch die Kleinere teilbar ist."				    );
		System.out.println("-----------------------------------------------------------------\n");
		
		try {
			
			int number1 = Toolbox.readInt("Bitte erste ganze  Zahl eingeben: ");
			int number2 = Toolbox.readInt("Bitte zweite ganze Zahl eingeben: ");
			
			System.out.println("\n-----------------------------------------------------------------\n");

			if (number1 > number2) { //number 1 higher than number 2
				System.out.println(number1 + " ist größer als " + number2 + ",");
				if (number1 % number2 == 0) { //calculate if number 1 is divisible by number 2
					System.out.println(number1 + " ist ohne Komma durch " + number2 + " teilbar und ergibt: " + number1/number2);
				} else {
					System.out.println(number1 + " ist nicht durch " + number2 + " teilbar.");
				}
				
			} else if (number2 > number1) { //number 2 higher than number 1
				System.out.println(number2 + " ist größer als " + number1 + ",");
				if (number2 % number1 == 0) { //calculate if number 2 is divisible by number 1
					System.out.println(number2 + " ist ohne Komma durch " + number1 + " teilbar und ergibt: " + number2/number1);
				} else {
					System.out.println(number2 + " ist nicht ohne Komma durch " + number1 + " teilbar.");
				}
				
			} else if (number1 == number2 || number2 == number1) { //number 1 and number 2 are the same
				System.out.println(number1 + " und " + number2 + " sind gleich groß");
				System.out.println("und damit durcheinander teilbar");
			}
			
			
			//if the user entered something except a Number, say that it is wrong
		} catch (NumberFormatException e) { 
			System.out.println("Ihre Eingabe konnte leider nicht verarbeitet werden");
		}
		System.out.println("\n-----------------------------------------------------------------\n");
		System.out.println("Programm wird nun gestoppt!");
		
	}
}
