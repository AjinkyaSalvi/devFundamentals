package DataStructureMain;
// 01. Main.java
// Start of the code flow

import java.util.Scanner;

import DataStructureFiles.StringDT;
import DataStructureFiles.IntegerDT;
public class Main {
	public static void main(String[] args) throws Exception {
		try {
			//   ---------   ---------   ---------   Definitions   ---------
			boolean stayInLoop = true;
			StringDT sdt = new StringDT();
			IntegerDT idt = new IntegerDT();
			Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to Java - Data Structures.");
			while(stayInLoop) {
				try {
					//   ---------   ---------   ---------   Accept user input   ---------
					System.out.print("""
						\nMAIN MENU
						01. Select "1" for Integers
						02. Select "2" for String
						03. Select "0" to Exit
						Enter your input:\s""");
					String UserInput = scanner.nextLine();

					//   ---------   ---------   ---------   Switch Case   ---------
					switch(UserInput) {
						case "1" -> {
							try{
								idt.integer(); // 02. IntegerDT.java
							} catch(Exception e03) {
								System.err.println("\nError - Main IntegerDT exception: "+ e03.toString());
							}
						}

						case "2" -> {
							try{
								sdt.string(); // 03. StringDT.java
							} catch(Exception e04) {
								System.err.println("\nError - Main StringDT exception: "+ e04.toString());
							}
						}

						case "0" -> {
							stayInLoop = false;
							System.out.println("\nThank you for using Java - Data Structures by Ajinkya Salvi.");
						}

						default -> System.err.println("\nError - Incorrect input. Please try again.");
					}
				} catch(Exception e02) {
					System.err.println("\nError - Main stayInLoop exception: "+ e02.toString());
				}
			}

			scanner.close();
		} catch(Exception e01) {
			System.err.println("\nError - Main exception: "+ e01.toString());
		}
	}
}
