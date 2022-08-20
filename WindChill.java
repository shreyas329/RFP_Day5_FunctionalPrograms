package FunctionalPrograms;
import java.util.*;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temparature in Fahrenheit: ");
		double temperature = sc.nextDouble();
		
		System.out.print("Enter the wind speed in  miles per hour: ");
        double windSpeed = sc.nextDouble();

        if (Math.abs(temperature) > 50) {
            System.out.println("The value of temperature in Fahrenheit cannot be larger that 50");
        }
        if (windSpeed > 120 && windSpeed < 3) {
            System.out.println("The value of Wind Speed in mph must be between 3 and 120");
        }
        double windChill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.println("The Wind Chill Temperature is: " + Math.round(windChill) + " Fahrenheit");

	}

}
