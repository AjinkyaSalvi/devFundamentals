package DataStructureFiles;

import java.util.Scanner;

import java.math.BigInteger;
import java.math.BigDecimal;

enum enumClass {
	ENum01, ENum03, ENum02;
}

public class IntegerDT {
        @SuppressWarnings("ConvertToTryWithResources")
	public void integer() {
		try {
			//   ---------   ---------   ---------   IntegerDT - Definitions   ---------
			boolean stayInLoop01 = true;
			Scanner scanner = new Scanner(System.in);

			System.out.println("\nWelcome to Java - Integer Data Type.");
			while (stayInLoop01) {
				//   ---------   ---------   ---------   Accept user input   ---------
				System.out.print(
					"Select \"1\" for Description"+
					"\nSelect \"2\" for Operations"+
					"\nSelect \"3\" for Methods"+
					"\nSelect \"0\" to Exit"+
					"\nEnter your input: "
				);
				String UserInput01 = scanner.next();

				//   ---------   ---------   ---------   Switch Case   ---------
				switch (UserInput01) {
					case "1":
						System.out.println(
							"Integer in Java is defined by the keyword \"int\"."+
							"\nint Stores whole numbers from -2,147,483,648 to 2,147,483,647.\n"
						);
						break;

					case "2":
						System.out.println(
							"\nWelcome to Java Integer - Arithmetic Operations Calculator."+
							"\nSelect from below Arithmetic Operators:"+
							"\n\"+\" for Addition"+
							"\n\"-\" for Subtraction"+
							"\n\"*\" for Multiplication"+
							"\n\"/\" for Division"+
							"\n\"%\" for Modulus (Returns the division remainder)"+
							"\n\"++\" for Increment (Increases the value of a variable by 1)"+
							"\n\"--\" for Decrement (Decreases the value of a variable by 1)"+
							"\n\"C\" for Clear"+
							"\n\"0\" to Exit"
						);

						//   ---------   ---------   ---------   Operations Calculator - Definitions   ---------
						boolean stayInLoop02 = true;
						int total=0, x=0;

						while(stayInLoop02) {
							//   ---------   ---------   ---------   Accept user input   ---------
							System.out.print(
								"\nTotal: "+ total +
								"\nEnter an Arithmetic Operator from above: "
							);
							String UserInput02 = scanner.next();

							try {
								if(
									(UserInput02.equals("+")) || (UserInput02.equals("-")) ||
									(UserInput02.equals("*")) || (UserInput02.equals("/")) ||
									(UserInput02.equals("%"))
								) {
									System.out.print("Enter the Integer: ");
									x = scanner.nextInt();
								}
							} catch(Exception e2) {
								System.out.println("\nArithmetic Operator - Exception: "+ e2.toString());
							}

							//   ---------   ---------   ---------   Arithmetic Operations Calculation   ---------
							switch(UserInput02) {
								case "+":
									total = total+x;
									break;

								case "-":
									total = total-x;
									break;

								case "*":
									total = total*x;
									break;

								case "/":
									total = total/x;
									break;

								case "%":
									total = total%x;
									break;

								case "++":
									total++;
									break;

								case "--":
									total--;
									break;

								case "C":
									total = 0;
									break;

								case "0":
									stayInLoop02 = false;
									break;

								default:
									System.out.println("\nIncorrect input. Please try again.");
							}
						}
						break;

					case "3":
						System.out.println(
							"\nMost of the Java built-in methods for the \"int\" data type are used to convert other data types to integer."+
							"\nSelect a data type from below to convert it into integer data type:"+
							"\n\"S\" for String"+
							"\n\"SDHO\" for Decimal, Hex, or Octal String"+
							"\n\"BI\" for Big Integer"+
							"\n\"BD\" for Big Decimal"+
							"\n\"by\" for byte"+
							"\n\"s\" for short"+
							"\n\"l\" for long"+
							"\n\"d\" for double"+
							"\n\"c\" for char"+
							"\n\"f\" for float"+
							"\n\"e\" for enum"+
							"\n\"bo\" for boolean"+
							"\n\"0\" for exit"
						);

						//   ---------   ---------   ---------   Integer Methods - Definitions   ---------
						boolean stayInLoop03 = true;
						int a=0, b=0;

						while(stayInLoop03) {
							//   ---------   ---------   ---------   Accept user input   ---------
							System.out.print("\nEnter the data type from above: ");
							int i01, i02;
							String UserInput03 = scanner.next();

							//   ---------   ---------   ---------   Display Integer Methods   ---------
							switch(UserInput03) {
								case "S":
									System.out.print("Enter the value of the String: ");
									String S = scanner.next();
									i01 = Integer.parseInt(S);
									i02 = Integer.valueOf(S).intValue();
									System.out.print(
										"The value of your entered String using Integer.parseInt(String) is: "+ i01 +
										"\nusing Integer.valueOf(String).intValue() is: "+ i02 +
										"\n"
									);
									break;

								case "SDHO":
									System.out.print("Enter the value of Decimal, Hex, or Octal String: ");
									String SDHO = scanner.next();
									i01 = Integer.decode(SDHO);
									System.out.print(
										"The value of your entered String using Integer.decode(String) is: "+ i01 +
										"\n"
									);
									break;

								case "BI":
									System.out.print("Enter the value of the BigInteger: ");
									BigInteger BI = scanner.nextBigInteger();
									i01 = BI.intValue();
									i02 = BI.intValueExact();
									System.out.print(
										"The value of your entered BigInteger using BigInteger.intValue() is: "+ i01 +
										"\nusing BigInteger.intValueExact() is: "+ i02 +
										"\n"
									);
									break;

								case "BD":
									System.out.print("Enter the value of the BigDecimal: ");
									BigDecimal BD = scanner.nextBigDecimal();
									i01 = BD.intValue();
									i02 = BD.intValueExact();
									System.out.print(
										"The value of your entered BigDecimal using BigDecimal.intValue() is: "+ i01 +
										"\nusing BigDecimal.intValueExact() is: "+ i02 +
										"\n"
									);
									break;

								case "by":
									System.out.print("Enter the value of the byte: ");
									byte by = scanner.nextByte();
									i01 = Byte.toUnsignedInt(by);
									i02 = (int) by;
									System.out.print(
										"The value of your entered byte using Byte.toUnsignedInt(byte) is: "+ i01 +
										"\nusing (int) byte is: "+ i02 +
										"\n"
									);
									break;

								case "s":
									System.out.print("Enter the value of the short: ");
									short s = scanner.nextShort();
									i01 = Short.toUnsignedInt(s);
									i02 = (int) s;
									System.out.print(
										"The value of your entered short using Short.toUnsignedInt(short) is: "+ i01 +
										"\nusing (int) short is: "+ i02 +
										"\n"
									);
									break;

								case "l":
									System.out.print("Enter the value of the long: ");
									long l = scanner.nextLong();
									i01 = Math.toIntExact(l);
									i02 = (int) l;
									System.out.print(
										"The value of your entered long using Math.toIntExact(long) is: "+ i01 +
										"\nusing (int) long is: "+ i02 +
										"\n"
									);
									break;

								case "d":
									System.out.print("Enter the value of the double: ");
									double d = scanner.nextDouble();
									i01 = (int) d;
									System.out.print(
										"The value of your entered double using (int) double is: "+ i01 +
										"\n"
									);
									break;

								case "c":
									System.out.print("Enter the value of the char: ");
									char c = scanner.next().charAt(0);
									i01 = Character.getNumericValue(c);
									i02 = (int) c;
									System.out.print(
										"The value of your entered char using Math.toIntExact(char) is: "+ i01 +
										"\nusing (int) char is: "+ i02 +
										"\n"
									);
									break;

								case "f":
									System.out.print("Enter the value of the float: ");
									float f = scanner.nextFloat();
									i01 = Math.round(f);
									i02 = (int) f;
									System.out.print(
										"The value of your entered float using Math.round(float) is: "+ i01 +
										"\nusing (int) float is: "+ i02 +
										"\n"
									);
									break;

								case "e":
									System.out.print(
										"\"enum\" values cannot be changed at the runtime."+
										"\nSo enter one of the \"ENum01\", \"ENum03\", and \"ENum02\" enums to get its ordinal: "
									);
									String e = scanner.next();
									i01 = enumClass.valueOf(e).ordinal();
									System.out.print(
										"The ordinal value of your entered enum using enumClass.valueOf(enum).ordinal() is: "+ i01 +
										"\n"
									);
									break;

								case "bo":
									System.out.print("Enter the value of boolean: ");
									boolean bo = scanner.nextBoolean();
									i01 = bo? 1: 0;
									System.out.print(
										"The value of your entered boolean using boolean? 1: 0 is: "+ i01 +
										"\n"
									);
									break;

								case "0":
									stayInLoop03 = false;
									break;

								default:
									System.out.println("\nIncorrect input. Please try again.");
							}
						}
						break;

					case "0":
						stayInLoop01 = false;
						break;

					default:
						System.out.println("\nIncorrect input. Please try again.");
				}
			}

		} catch(Exception e1) {
			System.out.println("\nIntegerDT - Exception: "+ e1.toString());
		}
		return;
	}
}
