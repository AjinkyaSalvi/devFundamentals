package DataStructureFiles;

import java.util.Scanner;

public class StringDT {
	public void string() throws Exception {
		try {
			//   ---------   ---------   ---------   StringDT - Definitions   ---------
			boolean stayInLoop01 = true;
			Scanner scanner = new Scanner(System.in);

			System.out.println(
				"\nWelcome to Java - String Data Type."+
				"\nStrings allow to store character and numbers in a sequential order in form of words or sentences."
			);
			while (stayInLoop01) {
				//   ---------   ---------   ---------   Accept user input   ---------
				System.out.print(
					"Select one of the below methods for string operations:"+
					"\nSelect\"1\" for Description"+
					"\nSelect \"0\" to Exit"+
					"\nEnter your input: "
				);
				String UserInput01 = scanner.next();

				//   ---------   ---------   ---------   Switch Case   ---------
				switch (UserInput01) {
				}
			}
		}
		catch(Exception e1) {
			System.out.println("\nDtringDT - Exception: "+ e1.toString());
		}
	}
}
