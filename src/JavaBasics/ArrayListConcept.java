package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(); // ArrayList dynamic in nature--Dynamic Array

		ar.add(100); // 0
		ar.add(200); // 1
		ar.add(300); // 2

		System.out.println(ar.size());

		ar.add(400); // 3
		ar.add(500);// 4

		System.out.println(ar.size());

		ar.add("tom");// 5
		ar.add("Hello");// 6
		ar.add(12.55);// 7
		ar.add('A');// 8
		ar.add(111); //9

		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		// System.out.println(ar.get(9)); //IndexOutOfBoundsException

		System.out.println("******************");

		// to print all the value of ArrayList: for loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		//ar1.add("aaaa");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		//ar2.add(100);
		ar2.add("Rakhi");
	}

}
