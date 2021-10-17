package lab.ex51;

public class LibaryApp {
	static Book[] books;
	
	public static void main(String[] args) {
		
		books = new Book[4];
		books[0] = new Book("Jurassic Park", "Crichton", 1992, 12.80f, 576, 439, true);
		books[1] = new Book("Gregs Tagebuch 12", "Kinney", 2018, 14.99f, 224, 412, false);
		books[2] = new Book("Per Anhalter durch die Galaxis", "Adams", 2009, 7.95f, 208, 219, true);
		books[3] = new Book("Harry Potter und der Feuerkelch", "Rowling", 2008, 11.99f, 765, 610, false);
		
		//compact description of the Books
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].toString());
		}
		
		//print some statistics
		System.out.println("Gesamtgewicht: " + calcTotalWeight() + "g");
		System.out.printf("Gesamtpreis: %,5.2f EUR\n", calcTotalPrice());
		System.out.println("Anzahl ungelesener Seiten: " + calcUnreadPages());
	}
	
	static double calcTotalWeight() {
		double totalWeight = 0;
		for (int i=0; i<books.length; i++) {
			totalWeight += books[i].weight;
		}
		return totalWeight;
		
	}
	
	static double calcTotalPrice() {
		double totalPrice = 0;
		for(int i=0; i<books.length; i++) {
			totalPrice += books[i].price;
		}
		return totalPrice;
	}
	
	static int calcUnreadPages() {
		int UnreadPages = 0;
		for(int i=0; i<books.length; i++) {
			if (books[i].read == false) {
				UnreadPages += books[i].pages;
			}
		}
		return UnreadPages;
	}
}
