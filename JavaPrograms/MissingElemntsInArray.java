package week1.weekdayass;

import java.util.Arrays;

public class MissingElemntsInArray {
	
	public static void main(String[] args) {
		int[] array1= {1,2,4,5,6,7,8,9};
		
		Arrays.sort(array1);
		for (int i = array1[0]; i < array1.length; i++) {
			
			if(i!=array1[i-1]) {
				System.out.println(i);
				break;
			}
						
			}
			
		}
	}


