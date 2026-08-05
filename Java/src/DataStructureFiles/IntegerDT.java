package DataStructureFiles;
// 02. IntegerDT.java
// Provides different Integer arithmetic operations and Integer methods.

import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

enum enumClass {
	enum01, enum03, enum02;
}

public class IntegerDT {
	public void integer() throws Exception {
		try {
			//   ---------   ---------   ---------   IntegerDT - Definitions   ---------
			boolean stayInLoop01 = true;
			Scanner scanner = new Scanner(System.in);

			System.out.println("""
				\nInteger Data Type: Integer in Java is defined by the keyword "int".
				int Stores whole numbers from -2,147,483,648 to 2,147,483,647.""");
			while(stayInLoop01) {
				//   ---------   ---------   ---------   Accept user input   ---------
				System.out.print("""
					\nINTEGER MENU
					Select "1" for int operations
					Select "2" for int methods
					Select "0" to go back to the MAIN MENU.
					Enter your input:\s""");
				String UserInput01 = scanner.nextLine();

				//   ---------   ---------   ---------   Switch Case   ---------
				switch(UserInput01) {
					case "1" -> {
						System.out.println("""
							\nINTEGER ARITHMETIC OPERATIONS CALCULATOR MENU
							Select from below Arithmetic Operators:
							01. "+" for Addition
							02. "-" for Subtraction
							03. "*" for Multiplication
							04. "/" for Division
							05. "%" for Modulus. It returns the division remainder.
							06. "++" for Increment. Increases the value of a variable by 1.
							07. "--" for Decrement. Decreases the value of a variable by 1.
							08. "C" to clear the memory.
							09. "0" to go back to the INTEGER MENU.""");

						//   ---------   ---------   ---------   Operations Calculator - Definitions   ---------
						boolean stayInLoop02 = true;
						int total=0, x=0;
						String temp;

						while(stayInLoop02) {
							try {
								//   ---------   ---------   ---------   Accept user input   ---------
								System.out.print(
								"\nTotal: "+ total +
								"\nEnter an Arithmetic Operator from above: "
								);
								String UserInput02 = scanner.nextLine();

								if(
									UserInput02.equals("+") || UserInput02.equals("-") ||
									UserInput02.equals("*") || UserInput02.equals("/") ||
									UserInput02.equals("%")
								) {
									System.out.print("Enter the Integer: ");
									x = scanner.nextInt();
									temp = scanner.nextLine();
								}

								//   ---------   ---------   ---------   Arithmetic Operations Calculation   ---------
								switch(UserInput02) {
									case "+" -> total = total+x; // 01. Addition
									case "-" -> total = total-x; // 02. Subtraction
									case "*" -> total = total*x; // 03. Multiplication
									case "/" -> total = total/x; // 04. Division
									case "%" -> total = total%x; // 05. Modulus
									case "++" -> total++; // 06. Increment
									case "--" -> total--; // 07. Decrement
									case "C" -> total = 0; // 08. Clear
									case "0" -> stayInLoop02 = false; // 09. Exit
									default -> System.err.println("Error - Incorrect input. Please try again."); // 10. Default
								}
							} catch(Exception e02) {
								System.err.println("\nError - IntegerDT stayInLoop02 exception: "+ e02.toString());
							}
						}
					}

					case "2" -> {
						System.out.println("\nInteger Methods: Most of the Java built-in methods for the \"int\" data type are used to convert other data types to integer.\n");

						boolean stayInLoop03 = true;
						while(stayInLoop03) {
							try {
								//   ---------   ---------   ---------   Accept user input   ---------
								System.out.print("""
									INTEGER METHODS MENU
									Select a data type from below to convert it into integer data type:
									01. "S" for String
									02. "SDHO" for Decimal, Hex, or Octal String
									03. "BI" for Big Integer
									04. "BD" for Big Decimal
									05. "by" for byte
									06. "s" for short
									07. "l" for long
									08. "d" for double
									09. "c" for char
									10. "f" for float
									11. "e" for enum
									12. "bo" for boolean
									13. "0" to go back to the INTEGER MENU.
									Enter the data type from above:\s""");
								String UserInput03 = scanner.nextLine();

								//   ---------   ---------   ---------   Display Integer Methods   ---------
								switch(UserInput03) {
									// 01. String
									case "S" -> {
										System.out.print("Enter the value of the String: ");
										String S = scanner.nextLine();

										System.out.print(
											"The value of your entered String using Integer.parseInt(String) is: "+ Integer.parseInt(S) +
											"\nusing Integer.valueOf(String).intValue() is: "+ Integer.valueOf(S).intValue() +
											"\n"
										);
									}

									// 02. Decimal, Hex, and Octal String
									case "SDHO" -> {
										System.out.print("Enter the value of Decimal, Hex, or Octal String: ");
										String SDHO = scanner.nextLine();

										System.out.print("The value of your entered String using Integer.decode(String) is: "+ Integer.decode(SDHO) +
										"\n");
									}

									// 03. BigInteger
									case "BI" -> {
										System.out.print("Enter the value of the BigInteger: ");
										BigInteger BI = scanner.nextBigInteger();

										System.out.print(
											"The value of your entered BigInteger using BigInteger.intValue() is: "+ BI.intValue() +
											"\nusing BigInteger.intValueExact() is: "+ BI.intValueExact() +
											"\n"
										);
									}

									// 04. BigDecimal
									case "BD" -> {
										System.out.print("Enter the value of the BigDecimal: ");
										BigDecimal BD = scanner.nextBigDecimal();

										System.out.print(
											"The value of your entered BigDecimal using BigDecimal.intValue() is: "+ BD.intValue() +
											"\nusing BigDecimal.intValueExact() is: "+ BD.intValueExact() +
											"\n"
										);
									}

									// 05. byte
									case "by" -> {
										System.out.print("Enter the value of the byte: ");
										byte by = scanner.nextByte();

										System.out.print(
											"The value of your entered byte using Byte.toUnsignedInt(byte) is: "+ Byte.toUnsignedInt(by) +
											"\nusing (int) byte is: "+ (int) by +
											"\n"
										);
									}

									// 06. short
									case "s" -> {
										System.out.print("Enter the value of the short: ");
										short s = scanner.nextShort();

										System.out.print(
											"The value of your entered short using Short.toUnsignedInt(short) is: "+ Short.toUnsignedInt(s) +
											"\nusing (int) short is: "+ (int) s +
											"\n"
										);
									}

									// 07. long
									case "l" -> {
										System.out.print("Enter the value of the long: ");
										long l = scanner.nextLong();

										System.out.print(
											"The value of your entered long using Math.toIntExact(long) is: "+ Math.toIntExact(l) +
											"\nusing (int) long is: "+ (int) l +
											"\n"
										);
									}

									// 08. double
									case "d" -> {
										System.out.print("Enter the value of the double: ");
										double d = scanner.nextDouble();

										System.out.print(
											"The value of your entered double using (int) double is: "+ (int) d +
											"\n"
										);
									}

									// 09. char
									case "c" -> {
										System.out.print("Enter the value of the char: ");
										char c = scanner.nextLine().charAt(0);

										System.out.print(
											"The value of your entered char using Math.toIntExact(char) is: "+ Character.getNumericValue(c) +
											"\nusing (int) char is: "+ (int) c +
											"\n"
										);
									}

									// 10. float
									case "f" -> {
										System.out.print("Enter the value of the float: ");
										float f = scanner.nextFloat();

										System.out.print(
											"The value of your entered float using Math.round(float) is: "+ Math.round(f) +
											"\nusing (int) float is: "+ (int) f +
											"\n"
										);
									}

									// 11. enum
									case "e" -> {
										System.out.print("""
											"enum" values cannot be changed at the runtime.
											So enter one of the "enum01", "enum03", and "enum02" enums to get its ordinal:\s""");
										String e = scanner.nextLine();

										System.out.print(
											"The ordinal value of your entered enum using enumClass.valueOf(enum).ordinal() is: "+ enumClass.valueOf(e).ordinal() +
											"\n"
										);
									}

									// 12. boolean
									case "bo" -> {
										System.out.print("Enter the value of boolean: ");
										boolean bo = scanner.nextBoolean();

										System.out.print(
											"The value of your entered boolean using boolean? 1: 0 is: "+ (bo? 1: 0) +
											"\n"
										);
									}

									case "0" -> stayInLoop03 = false; // 13. Exit
									default -> System.err.println("\nError - Incorrect input. Please try again."); // 14. Default
								}
							} catch(Exception e03) {
								System.err.println("\nError - IntegerDT stayInLoop03 exception: "+ e03.toString());
							}
						}
					}

					case "0" -> stayInLoop01 = false; // Exit
					default -> System.err.println("\nError - Incorrect input. Please try again."); // Default
				}
			}
		} catch(Exception e01) {
			System.err.println("\nError - IntegerDT exception: "+ e01.toString());
		}
	}
}
