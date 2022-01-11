package week1.day1;

public class CalculatorProgram {

	public int addTwoNumber() {
		int a = 3, b = 9;
		int sum = a + b;
		return sum;

	}

	public int subTwoNumber(int num1, int num2) {

		return num1 - num2;

	}

	public int multiplyTwoNumber() {
		int a = 3, b = 9;
		int sum = a * b;
		return sum;

	}

	public int divideTwoNumber(int num1, int num2) {

		return num1 / num2;

	}

	public static void main(String[] args) {
		CalculatorProgram calc = new CalculatorProgram();
		System.out.println("The Addition of twonumbers :" + calc.addTwoNumber());
		System.out.println("The Subraction of twonumbers :" + calc.subTwoNumber(8, 4));
		System.out.println("The Multiplication of twonumbers :" + calc.multiplyTwoNumber());
		System.out.println("The Divison of twonumbers :" + calc.divideTwoNumber(8, 4));
	}

}
