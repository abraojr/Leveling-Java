import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int y = 32;
		double x = 10.35784;

		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);//Number with two decimal places
		System.out.printf("%.4f%n", x);//Number with four decimal places
	}
}
