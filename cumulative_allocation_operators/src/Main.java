import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * A telephone company charges U$50.00 for a basic plan that entitles you to 100
		 * minutes of phone time.Each minute that exceeds the 100-minute limit costs 
		 * U$ 2.00. Make a program to read the amount of minutes a person has consumed, then
		 * show the amount to be paid.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutes;
		double amountToPay = 50.0;

		minutes = sc.nextInt();

		if (minutes > 100) {
			amountToPay += (minutes - 100) * 2.0;
		}
		System.out.printf("Amount to pay: U$ %.2f%n", amountToPay);
		sc.close();
	}
}
