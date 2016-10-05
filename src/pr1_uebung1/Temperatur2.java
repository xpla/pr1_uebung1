package pr1_uebung1;

import static java.lang.System.out;
import java.util.Scanner;

public class Temperatur2 {

	
	public static double convertToFahrenheit(int celsius) {
		double tempFahrenheit = (9.0/5.0) * celsius + 32;
		
		return tempFahrenheit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Bitte geben Sie die Temperatur in Grad Celsius ein: ");
		int celsius = keyboard.nextInt();
		
		double fahrenheit = convertToFahrenheit(celsius);
		
		out.print("Die Temperatur in Grad Fahrenheit beträgt: ");
		out.println(fahrenheit);

	}

}
