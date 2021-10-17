package lab.ex53;

public class BirdApp {

	public static void main(String[] args) {
		Raven abraxas = new Raven("Abraxas");
		abraxas.fly();
		abraxas.sing();
		abraxas.layEggs();
		System.out.println();
		Cuckoo charlie = new Cuckoo("Charlie");
		charlie.fly();
		charlie.sing();
		charlie.layEggs();
		System.out.println();
		Parrot larry = new Parrot("Larry");
		larry.fly();
		larry.sing();
		larry.layEggs();
	}
}
