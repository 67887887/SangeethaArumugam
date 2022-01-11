package week1.weekdayass;

import java.util.Arrays;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		int[] array1= {1,2,4,5,6,7,8,4};
		int[] array2= {1,2,3,6,7,8,9};
		
		System.out.println("Duplicate items in array");
		 for(int i = 0; i < array1.length; i++) {  
	            for(int j = i + 1; j < array1.length; j++) {  
	                if(array1[i] == array1[j])  
	                    System.out.println(array1[j]);  
	            }  
		
		 }
		
		System.out.println("**************************");
		System.out.println("Matching items in both array");
		 for(int i = 0; i < array1.length; i++) {  
	            for(int j = 0 ; j < array2.length; j++) {  
	                if(array1[i] == array2[j])  
	                    System.out.println(array1[i]);  
	            }  
		
		 }
		 System.out.println("**********************");
		 System.out.println("Missing Elemnts in array");
		 Arrays.sort(array1);
			for (int i = array1[0]; i < array1.length; i++) {
				if(i!=array1[i-1]) {
					System.out.println(i);
					break;
				}
							
				}

	}
	
	}


		 
			
		
		 
	


