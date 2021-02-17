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

		if (x == 1) {
			day = "Sunday";
		} 
		else if (x == 2) {
			day = "Monday";
		} 
		else if (x == 3) {
			day = "Tuesday";
		} 
		else if (x == 4) {
			day = "Wednesday";
		} 
		else if (x == 5) {
			day = "Thursday";
		} 
		else if (x == 6) {
			day = "Friday";
		} 
		else if (x == 7) {
			day = "Saturday";
		} 
		else {
			day = "Invalid value";
		}
		System.out.printf("Day of Week: %s%n", day);
		sc.close();
	}
}
