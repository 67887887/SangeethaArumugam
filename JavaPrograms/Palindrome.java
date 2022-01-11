package week1.weekdayass;

public class Palindrome {
	public static void main(String[] args) {
		String palindrome = "Madam";
		String rev = "";

		for (int i = palindrome.length() - 1; i >= 0; i--) {
			rev = rev + palindrome.charAt(i);
			}

			if(palindrome.equalsIgnoreCase(rev))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
		}

	
}
