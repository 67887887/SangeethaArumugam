package week3.weedayassignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {
	
public static void main(String[] args) {
	
	int[] data= {1,5,9,8,9,5,6,7};
	Set<Integer> setData=new HashSet<Integer>();
	for (Integer removeDuplicates : data) {
	setData.add(removeDuplicates);
		
	}
	System.out.println(setData);
	
}	 

}


