package week1.weekdayass;

public class CharOccurance {
	public static void main(String[] args) 
	{
		String str = "Welcome to Chennai";
		char occurence = 'w';
		int count = 0;
		String lowcaseString = str.toLowerCase();
	int length = str.length();

		for (int i = 0; i < length; i++) 
		{
			if(lowcaseString.charAt(i) == occurence)
			{
				count++;
			}
		}
		if(count > 0)
		{
			System.out.println("The char " + occurence + " occured " + count + " times in the given string - " + str );
		}
		else
		{
			System.out.println("No occurence of char in the statement");
		}

	}

}
