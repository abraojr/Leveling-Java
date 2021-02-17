import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program to read an integer value from 1 to 7 representing a weekday
		 * (where 1=Sunday, 2=Monday, and so on). Write the corresponding day of the
		 * week to the screen.
		 */

		Scanner sc = new Scanner(System.in);

		int x;
		String day;

		x = sc.nextInt();

		switch (x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid value";
			break;
		}
		System.out.printf("Day of Week: %s%n", day);
		sc.close();
	}
}
