import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 5;

		System.out.println("Good morning");

		if (x < 0) {
			System.out.println("Good afternoon");
		}

		System.out.println("Good night");

		sc.close();

	}

}
