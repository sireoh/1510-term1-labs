package ca.bcit.comp1510.lab03;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
* Makes random dice things.
*
* @author Vincent Fung
* @version 0.1
*/

public class Distance {
    /**
    * Drives the program.
    * @param args unused
    */
    
    public static void main(String[] args) {
        // Create a DecimalFormat object with pattern "0.00"
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value "
                + "of x and y(separated by a "
                + "white space): ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        int x1 = 0;
        int y1 = 0;
        double leftQuad = (x2 - x1) * (x2 - x1);
        double rightQuad = (y2 - y1) * (y2 - y1);
        double rootedAnswer = Math.sqrt(leftQuad + rightQuad);
        String formatComplete = decimalFormat.format(rootedAnswer);
        System.out.println("The calculated distance"
                + "(to 2 decimal points): " + formatComplete);
        
        //Close the scanner to save memory leaks
        scan.close();
    }
}
