package lab.ex27;

import hdm.shared.Toolbox;

public class Summation {

	public static void main(String[] args) {
		
		int n = Toolbox.readInt("Bitte eine Ganze Zahl eingeben, bis zu der aufaddiert werden soll: ");
		int erg = 0;
		int i = 1;
		
		while (i <= n){
			erg += i;
			i++;
		}
		System.out.println(" ");
		System.out.println("while: " + erg);
		System.out.println("--------------------------------------------------\n");
		
		erg = 0;
		i = 1;
		do {
			erg +=i;
			i++;
		} while (i<=n);
		System.out.println("do: " + erg);
		System.out.println("--------------------------------------------------\n");
		
		erg = 0;
		i = 1;
		for (int j=0; j<=n; j++) {
			erg = erg + j;
		}
		System.out.println("for: " + erg);
		System.out.println("--------------------------------------------------\n");
		
	}
}
