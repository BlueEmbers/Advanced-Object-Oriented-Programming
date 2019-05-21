package temperature_conversion;
/**
 * The TemperatureConversion Java application prints a table converting Celsius to Fahrenheit degrees
 * 
 * @see <A href="../src/temperature_conversion/TemperatureConversion.java">Java source code</A>
 * 
 * @author Ben Chen <A href="mailto:chenb@sunysuffolk.edu"> chenb@sunysuffolk.edu </A>
 * 
 * @version V1.0, 2/19/2019
 *
 */

public class TemperatureConversion {
	

/**
 * The main method prints a Celsius to Fahrenheit conversion table
 * 
 * The bounds of the table range from -50C to +50C in 1- degree-increments
 * 
 * @param args not used in this implementation
 * @author Chen
 */
	public static void main(String[] args) {
		final double TABLE_BEGIN = -50.0;
		final double TABLE_END = 50.0;
		final double TABLE_STEP = 10.0;
		double celsius;
		double fahrenheit;
		System.out.println("TEMPERATURE CONVERSION");
		System.out.println("--------------------------------");
		System.out.println("Celsius       Fehrenheit");
		for(celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP) {
			fahrenheit = celsiusToFahrenheit(celsius);
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%14.2fF\n", fahrenheit);
			
		}
		System.out.println("----------------------------");
		
	}
/**
 * Convert a temperature from Celsius degrees to Fahenheit degrees
 * 
 * @param celsius: temperature in Celsius degrees
 * @return the temperature converted to Fahrenheit
 * @throws java.lang.IllegalArguementException indicates that Celsius is less than the smallest Celsius temperature (-273.16)
 * @author Ben Chen
 * @chen.precondition celsius >= -273.16
 * @chen.postcondition the temperature in Fahrenheit
 */
	public static double celsiusToFahrenheit(double celsius) {
		final double MINIMUM_CELSIUS = -273.16;
		if(celsius < MINIMUM_CELSIUS) {
			throw new IllegalArgumentException("Argument " + celsius + " too low");
		}
		return (9.0 / 5.0) * celsius + 32;
	}

}
