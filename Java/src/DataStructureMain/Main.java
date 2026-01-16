package DataStructureMain;
// 01. Main.java
// Start of the code flow

import DataStructureFiles.IntegerDT;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try {
			//   ---------   ---------   ---------   Definitions   ---------
			boolean stayInLoop = true;
			IntegerDT idt = new IntegerDT();
			Scanner scanner = new Scanner(System.in);

			System.out.println("\nWelcome to Java - Data Structures.");
			while (stayInLoop) {
				try {
					//   ---------   ---------   ---------   Accept user input   ---------
					System.out.print(
						"Select \"1\" for Integers"+
						"\nSelect \"0\" to Exit"+
						"\nEnter your input: "
					);
					String UserInput = scanner.next();

					//   ---------   ---------   ---------   Switch Case   ---------
					switch (UserInput) {
						case "1":
							try{
								idt.integer();
							} catch (Exception e3) {
								System.out.println("\nInteger - Exception: "+ e3.toString());
							}
							break;

						case "0":
							stayInLoop = false;
							System.out.println("\nThank you for using Java - Data Structures by Ajinkya Salvi.");
							break;

						default:
							System.out.println("\nIncorrect input. Please try again.");
					}
				} catch (Exception e2) {
								System.out.println("\nStay in loop - Exception: "+ e2.toString());
				}
			}

			scanner.close();
		} catch(Exception e1) {
			System.out.println("\nMain - Exception: "+ e1.toString());
		}
	}
}
