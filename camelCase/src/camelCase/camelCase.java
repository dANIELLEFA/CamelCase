package camelCase;

import java.util.Scanner;
public class camelCase
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Enter two words with a space!");
				String twoWords = userInput.nextLine().toLowerCase();
				 
				
				// twoWords.split(" ");
				int space = twoWords.indexOf(" ");
				//twoWords.trim();
				String firstWord = twoWords.substring(0,space);
				String secondWord = twoWords.substring(space+2);
				String firstLetterOfSecondWord = twoWords.substring(space+1, space+ 2).toUpperCase();
				//String oneWord = twoWords.replace(" ","");
				System.out.println(firstWord + firstLetterOfSecondWord + secondWord);
				//      System.out.println(twoWords.substring(0, space) + twoWords.substring(space + 1, space + 2).toUpperCase() + twoWords.substring(space + 2));
//			String firstWord = twoWords.substring(0,  space).toLowerCase();
//				String firstLetter = twoWords..toUpperCase();
//				String endOfSecoundWord= twoWords.substring( space ).toLowerCase();
//				System.out.print(firstWord+firstLetter+endOfSecoundWord);
				
				
				}
				
			//.replace(" ", "")
				
// doNot
			}


	
