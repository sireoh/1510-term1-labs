package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
* Tells the user how much can of paint to use.
*
* @author Vincent Fung
* @version 0.1
*/

public class Paint {
    /**
    * Drives the program.
    * @param args unused
    */
    
    public static void main(String[] args) {
        //Define the variables (4 litres can cover 400 sqft)
        final int cCOVERAGE = 400;
        
        //Prompts
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please give me a length: ");
        int length = myScanner.nextInt();
        
        System.out.print("Please give me a width: ");
        int width = myScanner.nextInt();
        
        System.out.print("Please give me a height: ");
        int height = myScanner.nextInt();
        
        System.out.print("How many coats of paint do you want to use?: ");
        int coats = myScanner.nextInt();
        
        //Start the calculations
        final int surfaceArea = (3 * width * length) + (2 * width * height);
        double coverageNeeded = surfaceArea * coats;
        double cansOfPaintNeeded = cCOVERAGE / coverageNeeded;
        
        
        //Print out the calculations
        //System.out.println(cansOfPaintNeeded);
        System.out.println("According to the dimensions"
                + "you gave me(LWH), you need: "
                + cansOfPaintNeeded + " cans of paint.");

        // Quick test
        //System.out.println(length + ", " + width
        //  + ", " + height  + ", " + coats);
        
        // Close the scanner to avoid resource leak
        myScanner.close();
    }
}
