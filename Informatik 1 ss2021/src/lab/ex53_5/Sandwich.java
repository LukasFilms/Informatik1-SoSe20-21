package lab.ex53_5;

public class Sandwich extends Vesper {
	Brot b = new Brot();
	Wurst w = new Wurst();
	Salat s = new Salat();

	public static void main(String[] args) {
		new Sandwich();
	}

	Sandwich() {
		System.out.println("Sandwich()");
	}
}
