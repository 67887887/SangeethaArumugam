package week3.weedayassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SecondLargestNumberList {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> largestNumber=new ArrayList<Integer>();
		
		for (Integer numberList : data) {
       largestNumber.add(numberList);       
			
		}
		Collections.sort(largestNumber);
		System.out.println(largestNumber);
        System.out.println(largestNumber.get(largestNumber.size()-2));	
		
 	}
	
		
	
	
	
}
