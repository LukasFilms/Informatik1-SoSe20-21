package lab.ex53;

public class Bird {
	String name;

	Bird(String name) {
		this.name = name;
	}

	void sing() {
		System.out.println("Piep, piep! Ich bin " + name + ".");
	}

	void fly() {
		System.out.println("Ich flieeege! Flatter, flatter!");
	}

	void layEggs() {
		System.out.println("Ich lege meine Eier ins Nest.");
	}

}
