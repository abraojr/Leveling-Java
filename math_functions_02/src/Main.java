import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double delta, a, b, c, x1, x2;

		System.out.println("Enter the numbers:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		// Bhaskara's Formula
		delta = Math.pow(b, 2.0) - (4 * a * c);
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("a= " + a + ", b= " + b + ", c= " + c);
		System.out.println("Delta= " + delta + ", x1= " + x1 + ", x2= " + x2);
		sc.close();
	}

}
