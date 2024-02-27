package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
* Tells the area and circumference of a circle.
*
* @author Vincent Fung
* @version 0.1
*/

public class FunWithStrings {
    /**
    * Drives the program.
    * @param args unused
    */
    
    public static void main(String[] args) {
        // Import Scanner
        Scanner myScanner = new Scanner(System.in);
        // Prompt the user about their favourite book.
        System.out.print("Please tell me the name of your favourite book: ");
        String userBook = myScanner.nextLine();
        System.out.println(userBook);
        System.out.println("The title is "
            + userBook.length()
            + " characters long.");
        //Check if the book contains the word "The" in the beginning.
        String hasThe;
        if (!userBook.startsWith("the")) {
            hasThe = "The title does not contain the word 'The'.";
        }
        if (!userBook.startsWith("The")) {
            hasThe = "The title does not contain the word 'The'.";
        } else {
            hasThe = "The title does contain the word 'The'.";
        }
        System.out.println(hasThe);
        //Print the name of the book in upper case.
        System.out.println("The book in UPPER CASE is: "
            + userBook.toUpperCase()
            + "\nThe book in lower case is: "
            + userBook.toLowerCase());
        //Trim function
        String nothingButTabs = "\t\t\t\t\t";
        String nothingButSpaces = "           ";
        String spaceWordThenSpace = "      vincent      ";
        System.out.println(nothingButTabs
            + nothingButSpaces
            + spaceWordThenSpace);
        String trimmedUserInput = nothingButTabs.trim()
            + nothingButSpaces.trim()
            + spaceWordThenSpace.trim();
        System.out.println(trimmedUserInput);
        //Display fully trimmed, lower case, first and last capitalised
        String fullyTrimmed = userBook.trim();
        String lowerCase = userBook.toLowerCase();
        //Capitalize the first letter.
        String capFirst = userBook.substring(0, 1).toUpperCase();
        //Capitalize the last letter.
        String cLast = userBook.substring(userBook.length() - 1).toUpperCase();
        //The middle part
        String middlePart = userBook.substring(1, userBook.length() - 1);
        //Print it out
        System.out.println(capFirst + middlePart + cLast);
        System.out.println(fullyTrimmed);
        System.out.println(lowerCase);
        //Close the scanner to save memory leaks
        myScanner.close();
    }
}
