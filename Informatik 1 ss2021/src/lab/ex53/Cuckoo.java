package lab.ex53;

public class Cuckoo extends Bird {
	
	Cuckoo(String name) {
		super(name);
	}

	void sing() {
		System.out.println("Kuckuck! Ich bin " + name + ".");
	}

	void layEggs() {
		System.out.print("Ich suche mir ein fremdes Nest... und dann:");
		super.layEggs();
	}

}
