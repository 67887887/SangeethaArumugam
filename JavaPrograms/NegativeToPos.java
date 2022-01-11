package week1.weekdayass;

public class NegativeToPos {
	public static void main(String[] args) {
		int negativeNumber = -40;
		

		int postiveNumber;
		if (negativeNumber < 0) {
			System.out.println("The Number is Negative");
		} else {
			System.out.println("The Number is Postive");
		}
		System.out.println("*************************");
		if (negativeNumber < 0) {
			postiveNumber = negativeNumber * (-1);
			System.out.println("Conerting Negative to Postive:" + postiveNumber);
		}

	}

}
