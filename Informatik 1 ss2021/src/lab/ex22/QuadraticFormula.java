package lab.ex22;

import hdm.shared.Toolbox;

public class QuadraticFormula {

	public static void main(String[] args) {
		
		//get a, b, c from user
		double a = Toolbox.readDouble("a : ");
		double b = Toolbox.readDouble("b : ");
		double c = Toolbox.readDouble("c : ");
		
		//calculate how many answers
		double underRoot = (b * b) - (4 * a * c);
		
		//calculate answers
		if (underRoot < 0) {
			System.out.println("Die Gleichung hat keine Lösung.");
		
		} else if (underRoot == 0) {
			double oneAnswer = (b * -1) / (2 * a);
			System.out.println("Die Gleichung hat eine Lösung: ( x= " + oneAnswer + " ).");
		
		} else {
			double squareRoot = Math.sqrt(underRoot);
			double firstAnswer = ((b * -1) + squareRoot) / (2 * a) ;
			double secondAnswer = ((b * -1) - squareRoot) / (2 * a) ;
			System.out.println("Die Gleichung hat zwei lösungen: ( x1= " + firstAnswer + " und x2= " + secondAnswer + " )." );
		}
		
		
		
	}
}
