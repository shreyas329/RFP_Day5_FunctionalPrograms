package FunctionalPrograms;
import java.util.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a value: ");
		int b = sc.nextInt();
		
		System.out.println("Enter a value: ");
        int c = sc.nextInt();
        
        double realRoot1, realRoot2, complexRoot;

        if (a == 0)
        {
            System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Invalid");
            return;
        }
        
        int delta = b * b - 4 * a * c;
        if (delta > 0)
        {
            System.out.println("The roots of the equation " + a + "*x*x + " + b + "*x + " + c + " are Real and Unique");
            realRoot1 = (-b + Math.sqrt(delta)) / (2 * a);
            realRoot2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + realRoot1);
            System.out.println("Root 2: " + realRoot2);
        }
        else if (delta == 0)
        {
            System.out.println("The roots of the equation " + a + "*x*x + " + b + "*x + " + c + " are Real and Equal");
            realRoot1 = (-b / (2 * a));
            System.out.println("Root 1 and Root 2: " + realRoot1);

        }
        else
        {
            System.out.println("The roots of the equation " + a + "*x*x + " + b + "*x + " + c + " are Complex");
            realRoot1 = -b / (2 * a);
            complexRoot = Math.sqrt(Math.abs(delta));
            System.out.println("Root 1: " + realRoot1 + " + i" + complexRoot);
            System.out.println("Root 1: " + realRoot1 + " - i" + complexRoot);
        }

	}

}
