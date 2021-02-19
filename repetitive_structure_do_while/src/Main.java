import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program to read a temperature in Celsius and display the equivalent in
		 * Fahrenheit. Ask if the user wants to repeat (y/n). If the user enters "y",
		 * repeat the program.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char answer;

		do {
			System.out.print("Enter the temperature in Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalent em Fahrenheit: %.1f%n", F);
			System.out.print("Do you want to repeat? (y/n): ");
			answer = sc.next().charAt(0);
		} while (answer != 'n');

		sc.close();
	}
}
