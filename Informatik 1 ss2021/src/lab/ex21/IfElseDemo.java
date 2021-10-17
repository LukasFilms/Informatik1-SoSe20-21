package lab.ex21;

import hdm.shared.Toolbox;

public class IfElseDemo {

	public static void main(String[] args) {
		
		//secret number noted extra to change later
		int secretNumber = 42;
		
		try { //using try and catch for not compatible user inputs 
			int eingabe = Toolbox.readInt("Bitte Geheimzahl eingeben: ");
		
			//lets see if the input is correct 
			if (eingabe == secretNumber) { //if the user input is the secret number, say its correct
				System.out.println("Die Eingabe war korrekt!");
			
			} else {	//if the user entered a wrong Number, say it is wrong
				System.out.println("Leider falsch!");
			}
			
		} catch (NumberFormatException e) { //if the user entered something except a Number, say that it is not working that way
			System.out.println("Ihre Eingabe konnte leider nicht verarbeitet werden");
		}
			
		System.out.println("Danke fürs Mitmachen"); //final greeting
	}
}
