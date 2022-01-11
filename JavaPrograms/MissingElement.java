package week3.weedayassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingElement {
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 4, 5, 6, 7, 8, 4 };

		List<Integer> list1 = new ArrayList<Integer>();

		for (Integer firstList : array1) {
			list1.add(firstList);

		}
		Collections.sort(list1);

		for (int i = 1; i < list1.size(); i++) {

			if (i != list1.get(i - 1)) {
				System.out.println(i);
				break;

			}

		}

	}
}
