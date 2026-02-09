package DataStructureFiles;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class StringDT {
	public void string() throws Exception {
		try {
			//   ---------   ---------   ---------   StringDT - Definitions   ---------
			boolean stayInLoop01 = true;
			String temp;
			Scanner scanner = new Scanner(System.in);

			System.out.println(
				"\nString Data Type: Strings allow to store character and numbers in a sequential order in form of words or sentences."
			);
			while(stayInLoop01) {
				try {
					//   ---------   ---------   ---------   Accept user input   ---------
					String s01="a", s02="b";
					System.out.print("""
						\nSTRING OPERATIONS MENU:
						01. Select "e" for equals. Checks if two Strings have exact same contents. Used to verify String equality in if statements or loops.
						02. Select "l" for length. Provides the number of characters in the String. Used for loops, bounds checking, sizing up arrays, or iterating or slicing Strings without going out of bounds.
						03. Select "ca" for charAt. Provides the character at given index position in the String. Used for parsing or manipulating individual characters.
						04. Select "io" for indexOf. Finds the first occurrence of a substring or char and returns its index or -1 if not found. Used for searching patterns.
						05. Select "lio" for lastIndexOf. Finds the last occurrence of a substring or char and returns its index or -1 if not found. Used for searching patterns.
						06. Select "ss" for substring. Provides a part of the String given the indices. Used for extracting substrings in parsing or patterns.
						07. Select "ct" for compareTo. Compares two Strings and provides an integer output as negative, zero, or positive depending upon the alphabetical order. Used to sort the Strings.
						08. Select "tuc" for toUpperCase. Converts lower case String to upper case String. Used before comparisons.
						09. Select "tlc" for toLowerCase. Converts upper case String to lower case String. Used before comparisons.
						10. Select "sw" for startsWith. Checks if a String begins with a substring. Used for validations
						11. Select "ew" for endsWith. Checks if a String ends with a substring. Used for validations
						12. Select "c" for contains. Checks if a String contains a substring. Used for validations
						13. Select "repl" for replace. Replaces an old substring from the original String with a new substring. Used for String cleaning.
						14. Select "s" for split. Splits a String into array tokens based on a regex (regular expression). Used for parcing the String and CSV files, and tokenizing a String into an array.
						15. Select "t" for trim. Trims a String by removing leading and trailing whitespaces from a String. Used for input sanitization.
						16. Select "vo" for valueOf. Converts all other data types to String data type.
						17. Select "ie" for isEmpty. Quick checks if the String is empty. Used for input parameters validation.
						18. Select "tca" for toCharArray. Converts a String to a char array.
						19. Select "repe" for repeat. Repeats the String the number times you mentioned.

						20. concat appends two Strings like "+". Insted use "+" or StringBuilder. Example: "Hello".concat(" world!") → “Hello world!”.
						21. matches checks if the whole String matches the regex. Examples: "123".matches("\\d+") → true and "ABC".matches("A.*") → true.
						22. replaceAll replaces the regex (instead of a String) with the new String. Example: "123 abc".replaceAll("\\d", "x") → “xxx abc”.
						23. replaceFirst replaces the first regex (instead of the first String) with a new String. Example: "123 abc".replaceFirst("\\d", "x") → “x23 abc”.
						24. getBytes converts the String to a byte array. Can be used to get bytes for corresponding String characters. Example: "ABCabc".getBytes() → [65, 66, 67, 97, 98, 99].
						25. codePointAt gets the Unicode code point for non-BMP chars. Example: "a".codePointAt(0) → 97.
						26. strip removes the whitespace from the String. Unlike trim, strip doesn't removes the null value but removes all the Unicode whitespace. Examplea: "\u2000hello\u2000".strip() → “hello” and " hello ".strip() → “hello”.
						27. stripLeading removes the whitespace from the start of a String. Unlike trim, stripLeading doesn't removes the null value but removes all the Unicode whitespace. Examplea: "\u2000hello\u2000".stripLeading() → “hello\u2000” and " hello ".stripLeading() → “hello ”.
						28. stripTrailing removes the whitespace from the end of a String. Unlike trim, stripTrailing doesn't removes the null value but removes all the Unicode whitespace. Examplea: "\u2000hello\u2000".stripTrailing() → “\u2000hello” and " hello ".stripTrailing() → “ hello”.
						29. lines converts a String into a stream of lines. Example: "a\nb".lines().count() → 2.
						30. isBlank checks if the String has whitespaces or is empty. Example: " ".isBlank() → true.
						31. indent adds the indentation from the String. Example: "hello".indent(2) → “  hello”.
						Select "0" to go back to the MAIN MENU.
						Enter your input:\s""");
					String UserInput01 = scanner.nextLine();

					//   ---------   ---------   ---------   Accept user String inputs   ---------
					// Accept one String
					if(
						UserInput01.equals("l") || UserInput01.equals("ca") || UserInput01.equals("ss") ||
						UserInput01.equals("io") || UserInput01.equals("tuc") || UserInput01.equals("tlc") ||
						UserInput01.equals("sw") || UserInput01.equals("ew") || UserInput01.equals("c") ||
						UserInput01.equals("repl") || UserInput01.equals("s") || UserInput01.equals("t") ||
						UserInput01.equals("ie") || UserInput01.equals("tca") || UserInput01.equals("repe") ||
						UserInput01.equals("lio")
					) {
						System.out.print("\nEnter the String: ");
						s01 = scanner.nextLine();
					}
					// Accept two Strings
					if(UserInput01.equals("e") || UserInput01.equals("ct")) {
						System.out.print("\nEnter first String: ");
						s01 = scanner.nextLine();

						System.out.print("Enter second String: ");
						s02 = scanner.nextLine();
					}

					//   ---------   ---------   ---------   Switch Case   ---------
					switch(UserInput01) {
						// 01. equals
						case "e" -> {
							if(s01.equals(s02))
								System.out.print("String \""+ s01 +"\" equals String \""+ s02 +"\".\n");
							else
								System.out.print("String \""+ s01 +"\" and String \""+ s02 +"\" are not equal.\n");

							break;
						}

						// 02. length
						case "l" -> {
							System.out.println("Length of String \""+ s01 +"\" is "+ s01.length() +".");
							break;
						}

						// 03. charAt
						case "ca" -> {
							System.out.print("Enter the position to get the character from String \""+ s01 +"\": ");
							int p01 = scanner.nextInt();
							temp = scanner.nextLine();

							if((p01>=0) && (p01<=s01.length()))
								System.out.println("Character at position "+ p01 +" of String \""+ s01 +"\" is "+ s01.charAt(p01) +".");
							else if(p01 < 0)
								System.err.println("Error - The position "+ p01 +" is out of the lower bound.");
							else
								System.err.println("Error - The position "+ p01 +" is out of the upper bound.");

							break;
						}

						// 04. indexOf
						case "io" -> {
							System.out.print("Enter the String or character to get its first position in String \""+ s01 +"\": ");
							String sio = scanner.nextLine();

							if(s01.contains(sio))
								System.out.println("First position of \""+ sio +"\" in String \""+ s01 +"\" is "+ s01.indexOf(sio) +".");
							else
								System.err.println("Error - String \""+ s01 +"\" does not contain \""+ sio +"\".");

							break;
						}

						// 05. lastIndexOf
						case "lio" -> {
							System.out.print("Enter the String or character to get its last position in String \""+ s01 +"\": ");
							String slio = scanner.nextLine();

							if(s01.contains(slio))
								System.out.println("Last position of \""+ slio +"\" in String \""+ s01 +"\" is "+ s01.lastIndexOf(slio) +".");
							else
								System.err.println("Error - String \""+ s01 +"\" does not contain \""+ slio +"\".");

							break;
						}

						// 06. substring
						case "ss" -> {
							System.out.print("Enter the starting position index of the substring: ");
							int spi = scanner.nextInt();
							temp = scanner.nextLine();

							if((spi>=0) && (spi<s01.length())) {
								System.out.print("""
									Do you want to provide the ending index?
									Select "Yes" to select a substring from a starting index (which you will provide) to an ending index (which you will provide).
									Select "No" to select a substring from a starting index (which you will provide) to the end of the String.
									Enter your selection: """
								);
								String UserInput02 = scanner.nextLine();

								switch (UserInput02) {
									case "Yes" -> {
										System.out.print("Enter the ending position index: ");
										int epi = scanner.nextInt();
										temp = scanner.nextLine();

										if((epi>=0) && (epi<s01.length()) && (epi>=spi))
											System.out.print("Substring of String \""+ s01 +"\" from position "+ spi +" to position "+ epi +" is \""+ s01.substring(spi, epi) +"\".\n");
										else if(epi < 0)
											System.err.println("Error - The ending position index "+ epi +" is out of the lower bound.");
										else if(spi >= epi)
											System.err.println("Error - The ending position index "+ epi +" is not higher than the starting position index "+ spi +".");
										else
											System.err.println("Error - The ending position index "+ epi +" is out of the upper bound.");
									}

									case "No" -> System.out.print("Substring of String \""+ s01 +"\" from position "+ spi +" to position "+ s01.length() +" is \""+ s01.substring(spi) +"\".\n");
									default -> System.err.println("\nError - Incorrect input. Please try again."); // Default
								}
							} else if(spi < 0)
								System.err.println("Error - The starting position index "+ spi +" is out of the lower bound.");
							else
								System.err.println("Error - The starting position index "+ spi +" is out of the upper bound.");
							break;
						}

						// 07. compareTo
						case "ct" -> {
							int ct = s01.compareTo(s02);

							if(ct > 0)
								System.out.print("String \""+ s01 +"\" is after String \""+ s02 +"\" and the result is "+ ct +".\n");
							else if(ct < 0)
								System.out.print("String \""+ s01 +"\" is before String \""+ s02 +"\" and the result is "+ ct +".\n");
							else
								System.out.print("String \""+ s01 +"\" is equal to String \""+ s02 +"\" and the result is "+ ct +".\n");
						}

						case "tuc" -> System.out.print("Upper case of String \""+ s01 +"\" is \""+ s01.toUpperCase() +"\".\n"); // 08. toUpperCase

						case "tlc" -> System.out.print("Lower case of String \""+ s01 +"\" is \""+ s01.toLowerCase() +"\".\n"); // 09. toLowerCase

						// 10. startsWith
						case "sw" -> {
							System.out.print("Enter the substring: ");
							String sw = scanner.nextLine();

							if(s01.startsWith(sw))
								System.out.print("Yes, String \""+ s01 +"\" starts with substring \""+ sw +"\".\n");
							else
								System.out.print("No, String \""+ s01 +"\" does not start with substring \""+ sw +"\".\n");

							break;
						}

						// 11. endsWith
						case "ew" -> {
							System.out.print("Enter the substring: ");
							String ew = scanner.nextLine();

							if(s01.endsWith(ew))
								System.out.print("Yes, String \""+ s01 +"\" ends with substring \""+ew +"\".\n");
							else
								System.out.print("No, String \""+ s01 +"\" does not ends with substring \""+ ew +"\".\n");

							break;
						}

						// 12. contains
						case "c" -> {
							System.out.print("Enter the substring: ");
							String c = scanner.nextLine();

							if(s01.contains(c))
								System.out.print("Yes, String \""+ s01 +"\" contains substring \""+ c +"\".\n");
							else
								System.out.print("No, String \""+ s01 +"\" does not contain substring \""+ c +"\".\n");

							break;
						}

						// 13. replace
						case "repl" -> {
							System.out.print("Enter the substring from the String \""+ s01 +"\" to be replaced: ");
							String oldSS = scanner.nextLine();
							System.out.print("Enter the new substring to replace substring \""+ oldSS +"\": ");
							String newSS = scanner.nextLine();

							System.out.print("The new String after replacing old substring \""+ oldSS +"\" with new substring \""+ newSS +"\" in String \""+ s01+"\" is \""+ s01.replace(oldSS, newSS) +"\".\n");

							break;
						}

						// 14. split
						case "s" -> {
							String[] sa;
							System.out.print("Enter a regex to split the String \""+ s01 +"\" into tokens of an array: ");
							String regex = scanner.nextLine();

							System.out.print("""
								Do you want to limit the array?
								Select "Yes" to limit the tokens in array to the number you provide.
								Select "No" for otherwise.
								Enter your selection:\s""");
							String UserInput03 = scanner.nextLine();

							switch (UserInput03) {
								case "Yes" -> {
									System.out.print("Enter the limit for the number of tokens in the array: ");
									int limit = scanner.nextInt();
									temp = scanner.nextLine();

									sa = s01.split(regex, limit);

									System.out.print("Tokens in array after splitting the String \""+ s01 +"\": ");
									if(sa.length == 1)
										System.out.print("["+ sa[0] +"]\n");
									else {
										for(int i=0; i<sa.length; i++) {
											if((i>0) && (i<(sa.length-1)))
												System.out.print(sa[i] +", ");
											else if(i == 0)
												System.out.print("["+ sa[i] +", ");
											else
												System.out.print(sa[i] +"]\n");
										}
									}
								}

								case "No" -> {
									sa = s01.split(regex);

									System.out.print("Tokens in array after splitting the String "+ s01 +": ");
									if(sa.length == 1)
										System.out.print("["+ sa[0] +"]\n");
									else {
										for(int i=0; i<sa.length; i++) {
											if((i>0) && (i<(sa.length-1)))
												System.out.print(sa[i] +", ");
											else if(i == 0)
												System.out.print("["+ sa[i] +", ");
											else
												System.out.print(sa[i] +"]\n");
										}
									}
								}

								default -> System.err.println("\nError - Incorrect input. Please try again."); // Default
							}

							break;
						}

						// 15. trim
						case "t" -> System.out.println("\nTrimmed String: "+ s01.trim());

						// 16. valueOf
						case "vo" -> {
							System.out.println("""
								Select a data type from below to convert its value to String data type:
								01. "i" for int
								02. "BI" for Big Integer
								03. "BD" for Big Decimal
								04. "by" for byte
								05. "s" for short
								06. "l" for long
								07. "d" for double
								08. "c" for char
								09. "f" for float
								10. "bo" for boolean
								"0" to go back to the Integer Menu.
								Enter the data type from above:\s""");
							String UserInput04 = scanner.next();
						
							switch(UserInput04) {
								// 01. int
								case "i" -> {
									System.out.println("Enter the integer: ");
									int i = scanner.nextInt();
									System.out.println("Integer converted to String: "+ String.valueOf(i));
								}

								// 02. BigInteger
								case "BI" -> {
									System.out.println("Enter the BigInteger: ");
									BigInteger bi = scanner.nextBigInteger();
									System.out.println("Big Integer converted to String: "+ String.valueOf(bi));
								}

								// 03. BigDecimal
								case "BD" -> {
									System.out.println("Enter the BigDecimal: ");
									BigDecimal bd = scanner.nextBigDecimal();
									System.out.println("Big Decimal converted to String: "+ String.valueOf(bd));
								}

								// 04. byte
								case "by" -> {
									System.out.println("Enter the byte: ");
									byte b = scanner.nextByte();
									System.out.println("Byte converted to String: "+ String.valueOf(b));
								}

								// 05. short
								case "s" -> {
									System.out.println("Enter the short: ");
									short s = scanner.nextShort();
									System.out.println("Short converted to String: "+ String.valueOf(s));
								}

								// 06. long
								case "l" -> {
									System.out.println("Enter the long: ");
									long l = scanner.nextLong();
									System.out.println("Long converted to String: "+ String.valueOf(l));
								}

								// 07. double
								case "d" -> {
									System.out.println("Enter the double: ");
									double d = scanner.nextDouble();
									System.out.println("Double converted to String: "+ String.valueOf(d));
								}

								// 08. char
								case "c" -> {
									System.out.println("Enter the char: ");
									char c = scanner.nextLine().charAt(0);
									System.out.println("Char converted to String: "+ String.valueOf(c));
								}

								// 09. float
								case "f" -> {
									System.out.println("Enter the float: ");
									float f = scanner.nextFloat();
									System.out.println("Double converted to String: "+ String.valueOf(f));
								}

								// 10. boolean
								case "bo" -> {
									System.out.println("Enter the boolean: ");
									boolean bo = scanner.nextBoolean();
									System.out.println("Double converted to String: "+ String.valueOf(bo));
								}

								default -> System.err.println("\nError - Incorrect input. Please try again."); // 11. Default
							}

							break;
						}

						// 17. isEmpty
						case "ie" -> {
							if(s01.isEmpty())
								System.out.println("Entered String is empty.");
							else
								System.out.println("Entered String \""+ s01 +"\" is not empty");

							break;
						}

						// 18. toCharArray
						case "tca" -> {
							char[] ca = s01.toCharArray();

							System.out.print("Converted  String \""+ s01 +"\" to char array: ");
							if(ca.length == 1)
								System.out.print("["+ ca[0] +"]\n");
							else {
								for(int i=0; i<ca.length; i++) {
									if((i>0) && (i<(ca.length-1)))
										System.out.print(ca[i] +", ");
									else if(i == 0)
										System.out.print("["+ ca[i] +", ");
									else
										System.out.print(ca[i] +"]\n");
								}
							}
							break;
						}

						// 19. repeat
						case "repe" -> {
							System.out.print("Enter the number of times you want to repeat the String \""+ s01 +"\": ");
							int count = scanner.nextInt();
							temp = scanner.nextLine();

							System.out.print("String \""+ s01 +"\" repeated "+ count +" times using repeat: "+ s01.repeat(count));
						}

						case "0"  -> stayInLoop01 = false; // Exit
						default -> System.err.println("\nError - Incorrect input. Please try again."); // Default
					}
				} catch (Exception e02) {
					System.err.println("\nError - StringDT stayInLoop01 - Exception: "+ e02.toString());
				}
			}
		}
		catch(Exception e01) {
			System.err.println("\nError - StringDT - Exception: "+ e01.toString());
		}
	}
}
