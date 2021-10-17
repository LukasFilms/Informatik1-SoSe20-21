package lab.ex07;

import hdm.shared.Toolbox;

public class CelsiusToFahrenheitCalculator {
	
	public static void main(String[] args) {
		
		double tempCelsius = Toolbox.readInt("Temperatur in °C ? : ");
		double tempFahrenheit = ((tempCelsius * 9) / 5) + 32;
		
		System.out.println( " \n" + tempCelsius + " °C");
		System.out.println(" = ");
		System.out.println(tempFahrenheit + " °F");
		
	}

}
