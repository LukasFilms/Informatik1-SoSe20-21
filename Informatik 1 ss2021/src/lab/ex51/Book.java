package lab.ex51;

public class Book {

	// ID of next book that will be instantiated
	static int nextId = 1;

	int ID;
	String titel;
	String autor;
	int releaseYear;
	float price; // in Euro
	int pages;
	float weight; // in Gram
	boolean read;

	public Book(String titel, String autor, int releaseYear, float price, int pages, float weight, boolean read) {
		this.titel = titel;
		this.autor = autor;
		this.releaseYear = releaseYear;
		this.price = price;
		this.pages = pages;
		this.weight = weight;
		this.read = read;
		this.ID = nextId;

		nextId++;
	}

	public String toString() {
		String readAsText;
		if (this.read == true) {
			readAsText = "gelesen";
		} else {
			readAsText = "ungelesen";
		}

		return "ID " + ID + ": " + this.autor + ": " + this.titel + " (" + this.releaseYear + "). " + this.price + " Euro, " + this.pages
				+ " S., " + this.weight + "g, " + readAsText;
	}
}
