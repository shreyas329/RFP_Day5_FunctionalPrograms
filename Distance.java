package FunctionalPrograms;
import java.util.*;

public class Distance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value: ");
		double x = sc.nextInt();
		
		System.out.println("Enter y value: ");
        double y = sc.nextInt();

        double distance = Math.sqrt(Math.pow(x, x)+ Math.pow(y, y));
        System.out.println("The Euclidean Distance from the origin(0,0) to the point(" + x + "," + y + ") is: "+distance);

	}

}
