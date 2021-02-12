import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char gender;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		gender = sc.next().charAt(0);

		System.out.println("You typed: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(gender);
		sc.close();
	}
}
