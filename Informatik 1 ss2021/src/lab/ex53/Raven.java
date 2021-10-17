package lab.ex53;

public class Raven extends Bird {
	
	Raven(String name) {
		super(name);
	}

	void sing() {
		System.out.println("Kräh! Ich bin " + name + ".");
	}

}
