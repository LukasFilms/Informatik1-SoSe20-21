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
	
	//gibt den übergebenen Wert (als Zahl) und Einheit (als Text) auf der Konsole aus
	static void printValue(int value, String unit) {
		System.out.println(value + " " + unit);
	}
	
	//hängt die übergebene Zeichenkette zweimal aneinander und liefert das Ergebnis zurück
	static String repeatString(String text) {
		return text + text;
	}
	
	//hängt die übergebene Zeichenkette count Mal aneinander und liefert das Ergebnis zurück
	static String repeatString(String text, int count) {
		String output = "";
		for(int i = 1; i <= count; i++) {
			output += text;
		}
		return output;
	}
	
}
