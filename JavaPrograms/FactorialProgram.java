package week1.day1;

public class FactorialProgram {

	public static void main(String[] args) {

		int i, factorial = 1;
		int number = 7;
		for (i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + number + " is: " + factorial);
	}
}
