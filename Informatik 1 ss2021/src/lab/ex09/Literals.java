package lab.ex09;

public class Literals {

	/*
	 * Eine Standalone-Anwendung muss eine main-Methode besitzen
	 */
	
	public static void main(String args[]) {
		
	// logischer Literal ausgeben
	System.out.println(true);
	
	// Zeichen ausgeben
	System.out.println('a');
	
	// Zeichen ausgeben
	System.out.println('\u0a13');
	
	// Zeichenkette ausgeben
	System.out.println("Hello Java !");
	
	// Zeichenkette auf zwei Zeilen geschrieben (mit diesem + )
	System.out.println("Dies ist ein String, der auf "
	 + "zwei Zeilen verteilt wurde. Ausgabe in einer Zeile!");
	
	// Zeichenkette auf zwei Zeilen ausgeben auf einer geschrieben
	System.out.println("Dies ist ein String, der auf \n" 
	+ "zwei Zeilen verteilt wurde. Ausgabe in zwei Zeilen!");
	
	// Ganze Zahl ausgeben
	System.out.println(123); // dezimal
	System.out.println(0377); // Oktal
	System.out.println(0xCAFEBABE); // Hexadezimal
	
	// Fliesskommazahl ausgeben
	System.out.println(6.023E23); // double Literal
	System.out.println(6.023E23f); // float Literal
	
	} // end of main

} /* end of class */