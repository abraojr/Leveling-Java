import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price, discount;

		price = sc.nextDouble();

		discount = (price < 20.0) ? price * 0.1 : price * 0.05; // Example of ternary conditional expression

		System.out.printf("Discount = U$ %.2f%n", discount);
		sc.close();
	}
}
