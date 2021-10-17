package lab.ex19;

public class MemoryCalculator {

	public static void main(String[] args) {
		
		//define constants
		final byte BITS_PER_BYTE = 8;
		final int BYTES_IN_MB = 1000 * 1000;
		final int BYTES_IN_MIB = 1024 * 1024;
		
		//part a)
		final long CHARACTER_COUNT = 16_000;
		final long BITS_PER_CHARACTER = 16;
		
		long aInBytes = (CHARACTER_COUNT * BITS_PER_CHARACTER) / BITS_PER_BYTE;
		double aInMB = (double) aInBytes / BYTES_IN_MB;
		double aInMiB = (double) aInBytes / BYTES_IN_MIB;
		
		System.out.println("Eine Text-E-Mail mit " + CHARACTER_COUNT + " Zeichen (codiert in UTF-16 mit " + BITS_PER_CHARACTER +" Bit/Zeichen) benoetigt:");
		System.out.println("In Bytes : " + aInBytes);
		System.out.println("In MB    : " + aInMB);
		System.out.println("In MiB   : " + aInMiB);
		System.out.println("------------------------------------------------- \n");
		
		
		//part b)
		final long LENGTH_IN_SECONDS = 60;
		final long BITS_PER_SAMPLE = 16;
		final long SAMPLE_RATE = 44_100;
		
		long bInBytes = ((SAMPLE_RATE * BITS_PER_SAMPLE) * LENGTH_IN_SECONDS) / BITS_PER_BYTE;
		double bInMB = (double) bInBytes / BYTES_IN_MB;
		double bInMiB = (double) bInBytes / BYTES_IN_MIB;
		
		System.out.println("Eine Minute digitales Mono-Audiosignal, das mit " + BITS_PER_SAMPLE + " Bit Genauigkeit pro Sample und einer Frequenz von "
		+ SAMPLE_RATE + " Hz abgetastet wurde, benoetigt:");
		System.out.println("In Bytes : " + bInBytes);
		System.out.println("In MB    : " + bInMB);
		System.out.println("In MiB   : " + bInMiB);
		System.out.println("------------------------------------------------- \n");
		
		
		//Part c)
		final long PIXEL_COUNT = 8_000 * 8_000;
		final long BIT_PER_PIXEL = 32;
		
		long cInBytes = (PIXEL_COUNT * BIT_PER_PIXEL) / BITS_PER_BYTE;
		double cInMB = (double) cInBytes / BYTES_IN_MB;
		double cInMiB = (double) cInBytes / BYTES_IN_MIB;
		
		System.out.println("Ein digitales Roentgenbild mit 8.000 x 8.000 Bildpunkten (Pixel), bei dem für jeden Bildpunkt dessen Helligkeitswert in einem "
				+ BIT_PER_PIXEL + " Bit-Wert gespeichert wird, benoetigt:");
		System.out.println("In Bytes : " + cInBytes);
		System.out.println("In MB    : " + cInMB);
		System.out.println("In MiB   : " + cInMiB);
		System.out.println("------------------------------------------------- \n");
		
		
		
		
	}
}
