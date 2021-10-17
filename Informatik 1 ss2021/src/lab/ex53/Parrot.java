package lab.ex53;

public class Parrot extends Bird {
	
	Parrot(String name) {
		super(name);
	}

	void sing() {
		sprich("Korax, Cäp'tn! " + name + " ist klar zum Entern!");
	}

	void sprich(String text) {
		System.out.println(text.replace("r", "rrr"));
	}

}
