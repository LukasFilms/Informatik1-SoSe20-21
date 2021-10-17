package lab.ex46;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class usingFiles {

	public static void main(String[] args) {
		
		File datei = new File("data/text/Studentennamen.txt");
		FileReader reader;
		
		try {
			reader = new FileReader(datei); //öffnet die Datei
			Scanner scanner = new Scanner(reader); // scannt die Datei
			
			// solange wie das “file” noch eine nächste Zeile hat, eine Zeile einlesen
	        while (scanner.hasNextLine()) {
	          String line = scanner.nextLine();
	          System.out.println(line); //gebe die Zeile aus
	        }
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
