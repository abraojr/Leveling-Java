import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price, discount;

		price = sc.nextDouble();

		if (price < 20.0) {
			discount = price * 0.1;
		} 
		else {
			discount = price * 0.05;
		}
		System.out.printf("Discount = U$ %.2f%n", discount);
		sc.close();
	}
}
