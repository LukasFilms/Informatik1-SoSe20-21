package lab.ex42;

public class StringMethoden {

	public static void main(String[] args) {

		//a
		printValue(55, "km");
		
		//b
		System.out.println(repeatString("hu"));
		
		//c
		System.out.println(repeatString("*", 4));
	}
	
	//gibt den �bergebenen Wert (als Zahl) und Einheit (als Text) auf der Konsole aus
	static void printValue(int value, String unit) {
		System.out.println(value + " " + unit);
	}
	
	//h�ngt die �bergebene Zeichenkette zweimal aneinander und liefert das Ergebnis zur�ck
	static String repeatString(String text) {
		return text + text;
	}
	
	//h�ngt die �bergebene Zeichenkette count Mal aneinander und liefert das Ergebnis zur�ck
	static String repeatString(String text, int count) {
		String output = "";
		for(int i = 1; i <= count; i++) {
			output += text;
		}
		return output;
	}
	
}
