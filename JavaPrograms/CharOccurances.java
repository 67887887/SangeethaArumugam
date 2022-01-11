package week1.weekdayass;

public class CharOccurances {

	public static void main(String[] args) {
		String str = "Welcomeeeeee to Chennai";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("Frequency of e is: " + count);
	}

}
