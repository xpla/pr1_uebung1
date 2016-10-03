package pr1_uebung1;

public class Temperatur {

	public static double celsius2Fahrenheit(double celsius) {
		
		// NOTE	When using type "double" also keep in mind to set a comma value
		// INFO Calculating degree Fahrenheit of a given degree Celsius
		double Fahrenheit = (9.0/5.0) * celsius + 32;
		
		// INFO Return the calculation
		return Fahrenheit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(celsius2Fahrenheit(32));
		
	}

}
