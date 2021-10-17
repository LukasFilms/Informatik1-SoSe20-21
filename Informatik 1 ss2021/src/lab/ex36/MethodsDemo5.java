package lab.ex36;

import hdm.shared.Toolbox;

public class MethodsDemo5 {
	
	public static void main(String[] args) {
		
		long n = Toolbox.readLong("Bitte Zahl eingeben, bis zu der aufaddiert werden soll: ");
		System.out.println("Die Summe der Zahlen bis " + n + " ist: " + sumSeries(n));
	}
	
	static long sumSeries(long n) {
		
		int i = 1;
		int erg = 0;
		
		while (i <= n) {
			erg += i;
			i++;
		}
		return erg;

	}

}
