package week3.weedayassignment;

import java.util.ArrayList;
import java.util.List;

public class FindInseration {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 4, 5, 6, 7, 8, 4 };
		int[] array2 = { 1, 2, 3, 6, 7, 8, 9 };

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (Integer firstList : array1) {
			list1.add(firstList);

		}
		System.out.println(list1);
		for (Integer secondList : array2) {
			list2.add(secondList);

		}
		System.out.println(list2);
		
		list2.retainAll(list1);
		System.out.println("The Comman Values in list" +list2);
		/*

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i).equals(list2.get(j))) {
					System.out.println("Matching Elemnts in list"+list1.get(i));
				}

			}
			
		*/}

	}


