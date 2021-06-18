package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		// instantiate our new customList
		CustomList<Integer> numbers = new CustomArrayList<>();

		// test to add more than 10 elements
		for (int i = 1; i <= 11; i++) {
			numbers.add(i);
		}
		
		System.out.println("-----------");
		System.out.println("Print all elements added to the Custom List Array");
		System.out.println();
		
		// now print all those elements and check to make sure there are no "null" values
		for (int i = 0; i < numbers.getSize(); i++) {

			System.out.println(numbers.get(i));
		}
		
		System.out.println();
		System.out.println("-----------");
		System.out.println("Get the 7th element from our ArrayList");
		System.out.println();
		
		// use the getIndex method to check if it works as well -> should print 7
		System.out.println(numbers.get(6));


	}

}
