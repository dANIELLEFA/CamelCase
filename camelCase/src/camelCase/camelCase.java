package camelCase;

import java.util.Scanner;
public class camelCase
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Enter two words with a space!");
				String twoWords = userInput.nextLine();
				int space = twoWords.indexOf(" ");
				String firstWord = twoWords.substring(0, space).toLowerCase();
				String firstLetter = twoWords.substring(space, space++).toUpperCase();
				String endOfSecoundWord= twoWords.substring( space= space + 2).toUpperCase();
				System.out.print(firstWord+firstLetter+endOfSecoundWord);
				
				//.replace(" ", "")
				

			}

	}
