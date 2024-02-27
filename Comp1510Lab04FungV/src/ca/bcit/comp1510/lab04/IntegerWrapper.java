package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Experimenting with Integer classes.
 * @author Vincent Fung
 * @version 1.0
 */

public class IntegerWrapper {
    /** The minimum integer possible. */
    static final int MINIMUM = Integer.MIN_VALUE;
    
    /** The maximum integer possible. */
    static final int MAXIMUM = Integer.MAX_VALUE;
    /**
     * drives the program.
     * @param args unused
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please give me an integer to convert: ");
        int input = scan.nextInt();
        String outputBinary = Integer.toBinaryString(input);
        String outputHex = Integer.toHexString(input);
        String outputOctal = Integer.toOctalString(input);
        
        
        
        System.out.println("The binary representation of that number is: "
                + outputBinary);
        System.out.println("The hex representation of that number is: "
                + outputHex);
        System.out.println("The octal representation of that number is: "
                + outputOctal);
        System.out.println("The MINIMUM of an int is: " + MINIMUM);
        System.out.println("The MAXIMUM of an int is: " + MAXIMUM);
        
        System.out.print("Please give me an integer: ");
        String num1 = scan.next();
        
        System.out.print("Give me one more, thanks: ");
        String num2 = scan.next();
        
        String addedStringNums = num1 + num2;
        int addedIntNums = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        System.out.println("The numbers when NOT converted to ints: "
                + addedStringNums);
        System.out.println("The numbers when converted to ints: "
                + addedIntNums);
        
        //Close the scanner
        scan.close();
    }
}
