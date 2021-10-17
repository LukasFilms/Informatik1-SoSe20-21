package lab.ex20;

import hdm.shared.Toolbox;

public class InteractiveMomoryCalculator {

	public static void main(String[] args) {
		
		//defining constants 
		final long BITS_IN_BYTES = 8;
		final long BYTES_IN_MB = 1000 * 1000;
		final long BYTES_IN_MIB = 1024 * 1024;
		
		//get user answers
		long widthInPixel = Toolbox.readLong("Breite (in Pixel) : ");
		long heightInPixel = Toolbox.readLong("Höhe (in Pixel)   : ");
		byte colorChannels = Toolbox.readByte("Anzahl an Farbkanälen : ");
		byte bitsPerPixelandChannel = Toolbox.readByte("Bits pro Pixel und Kanal : ");
		
		//calculate
		long totalPixel = widthInPixel * heightInPixel;
		long bitsPerChannel = totalPixel * bitsPerPixelandChannel;
		long pictureInBits = bitsPerChannel * colorChannels;
		
		double pictureInByte = (double) pictureInBits / BITS_IN_BYTES;
		double pictureInMB = (double) pictureInByte / BYTES_IN_MB;
		double pictureInMiB = (double) pictureInByte / BYTES_IN_MIB;
		
		//prompt answer
		System.out.println("\n------------------------------------------------- \n");
		System.out.println("Der Speicherplatzbedarf beträgt :");
		System.out.println("In Byte : " + pictureInByte);
		System.out.println("In MB   : " + pictureInMB);
		System.out.println("In MiB  : " + pictureInMiB);
		System.out.println("\n-------------------------------------------------");
		
	}
}
