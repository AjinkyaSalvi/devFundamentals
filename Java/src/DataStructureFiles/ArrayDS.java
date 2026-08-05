package DataStructureFiles;
// 04. ArrayDS.java
// Provides

import java.util.Scanner;

public class ArrayDS {
	public void array() throws Exception {
		try {
			//   ---------   ---------   ---------   ArrayDS - Definitions   ---------
			String temp;
			boolean stayInLoop01 = true;
			Scanner scanner = new Scanner(System.in);

			System.out.println("""
				\nArray Data Structure: An array is a container object that holds a fixed number of values of a single and uniform data type.
				Uses: Storing a fixed number of elements, low-level operations, and index-based access.
				Limitations: Fixed length and costly insert or delete in middle (O(n)).
				Examples: int[] a = {1,2,3} and int x = a[0].
				Interview: Expect questions on indexing, memory, in-place algorithms.""");
			while(stayInLoop01) {
				try {
					//   ---------   ---------   ---------   Accept user input   ---------
					String s01="a", s02="b";
					System.out.print("""
						\nARRAY MENU
						01. Select "s" for sort. Sort array in-place. For primitives it uses optimized quicksort/dual-pivot. For objects it uses tuned mergesort/timSort depending on JVM & type. Used for preparing arrays for binary search. Interview questions includes sorting with two pointers. 
						Select "0" to go back to the MAIN MENU.
						Enter your input:\s""");
					String UserInput01 = scanner.nextLine();
					System.out.print("""
						\nARRAY MENU
						01. Select "s" for sort. Sort array in-place. For primitives it uses optimized quicksort/dual-pivot. For objects it uses tuned mergesort/timSort depending on JVM & type. Used for preparing arrays for binary search. Interview questions includes sorting with two pointers. 
						Select "0" to go back to the MAIN MENU.
						Enter your input:\s""");

					switch(UserInput01) {
						// 01. sort
						case "s" -> {}
						case "0" -> stayInLoop01 = false; // Exit
						default -> System.err.println("\nError - Incorrect input. Please try again."); // Default
					}
				} catch(Exception e02) {
					System.out.println("\nError - ArrayDT stayInLoop01 - Exception: "+ e02.toString());
				}
			}
		} catch(Exception e01) {
			System.out.println("\nError - ArrayDT - Exception: "+ e01.toString());
		}
	}
}
