package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
* Calculates the factorial of a non-negative integer provided by the user.
* @author Vincent Fung.
* @version 1.0
*/
public class Factorial {
    
    /**
     * Calculates the factorial of the input number provided by the user.
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        int i = 1;
        int product = 1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please give me a number greater than 1: ");
        int n  = readInt(scan);
        
        if (n > 0) {
            System.out.println("You gave me a non-negative number.");
        }
        
        while (n < 0) {
            System.out.println("Please give me a non-negative number: ");
            n  = readInt(scan);
        }
        
        while (i < n + 1) {
            product = product * i;
            i++;
        }
        
        System.out.println("The factorial of n! is: " + product);
        
        scan.close();
    }
    
    /**
     * Reads an integer input from the user via the provided Scanner object.
     * If non-integer input, prompts for valid.
     * @param scan The Scanner object used for input.
     * @return The integer input provided by the user.
     */
    public static int readInt(Scanner scan) {
        // boolean for hasNextInt() returns false if you give a string.
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("You gave a string. Please give an integer: ");
        }
        return scan.nextInt();
    }
}
