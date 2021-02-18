import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program that reads an integer value N and then N integer numbers. At
		 * the end, display the sum of the N numbers read.
		 */

		Scanner sc = new Scanner(System.in);

		int N, sum = 0;

		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			sum += x;
		}
		System.out.println("SUM: " + sum);
		sc.close();
	}
}
