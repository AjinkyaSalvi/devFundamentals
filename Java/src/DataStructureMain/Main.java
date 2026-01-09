package DataStructureMain;
// 01. Main.java
// Start of the code flow

import DataStructureFiles.IntegerDS;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try {
			//   ---------   ---------   ---------   Definitions   ---------
			boolean stayInLoop = true;
			IntegerDS ids = new IntegerDS();
			Scanner scanner = new Scanner(System.in);

			System.out.println("\nWelcome to Java - Data Structures.");
			while (stayInLoop) {
				//   ---------   ---------   ---------   Accept user input   ---------
				System.out.print(
					"\nEnter \"1\" to select Integers"+
					"\nEnter \"0\" to Exit"+
					"\n\nEnter your input: "
				);
				String UserInput = scanner.next();

				//   ---------   ---------   ---------   Switch Case   ---------
				switch (UserInput) {
					case "1":
						ids.integer();
						break;

					case "0":
						stayInLoop = false;
						System.out.println("\nThank you for using Java - Data Structures by Ajinkya Salvi.");
						break;

					default:
						System.out.println("\nIncorrect input. Please try again.");
				}
			}

			scanner.close();
		}
		catch(Exception e) {
			System.out.println("\nMain - Exception: "+ e.toString());
		}
	}
}
