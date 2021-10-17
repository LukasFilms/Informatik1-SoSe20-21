package lab.ex55;

// Java Swing
import javax.swing.*;
import java.awt.*;

public class Aufgabe55 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Hello World");
		frame.setSize(200,150);
		
		Container cp = frame.getContentPane();
		ButtonPanel myButtons = new ButtonPanel();
		cp.add(myButtons);
		
		JOptionPane.showMessageDialog(null, "Hallo", "Hallo",JOptionPane.INFORMATION_MESSAGE);
		
		frame.setVisible(true);
		
	}
}
