import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double x = 10.35784;

		System.out.println("Result = " + x + " meters"); // General rule for print and println

		System.out.printf("Result = %.2f meters%n", x); // General rule for printf
	}
}
