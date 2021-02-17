import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program that reads integers until a zero is read. At the end it shows
		 * the sum of the numbers read.
		 */

		Scanner sc = new Scanner(System.in);

		int x, sum = 0;

		x = sc.nextInt();

		while (x != 0) {
			sum += x;
			x = sc.nextInt();
		}
		System.out.printf("SUM: %d%n", sum);
		sc.close();
	}
}
