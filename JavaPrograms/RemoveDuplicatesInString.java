package week3.weedayassignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInString {
	public static void main(String[] args) {
		
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str=text.split(" ");
		Set<String> split=new LinkedHashSet<String>();
		for (String splitString : str) {
			split.add(splitString);
			
		}
		String string = split.toString();
		System.out.println(string.replace(",", " "));
		
		
	}

}
