package lab.ex10;

import hdm.shared.Toolbox;

public class ConstantsDemo {
	
	public static void main (String[] args) {
		
		//using literals for never chancing numbers
		int SECONDS_IN_MINUTE = 60;
		int MINUTES_IN_HOUR = 60;
		
		//using user input for changable inputs
		int SamplesPerSecond = Toolbox.readInt("How many Samples per Second? : ");
		int BytesPerSample = Toolbox.readInt("how many bytes per Sample? : ");
		int NumberChannels = Toolbox.readInt("How many Chanels? : ");
		
		//calculate
		long playingTimeInSeconds = MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
		long space = playingTimeInSeconds * SamplesPerSecond * NumberChannels * BytesPerSample;
		
		float GB = space / 1_000_000_000;
		
		System.out.println("\nSpeicherplatz für 1h Audio: " + space + " Bytes" + " = " + GB + " Gigabyte");

	}

}
