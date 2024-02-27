package ca.bcit.comp1510.lab02;

import java.util.Scanner;

/**
* Tells the area and circumference of a circle.
*
* @author Vincent Fung
* @version 0.1
*/

public class Circle {
    /**
    * Drives the program.
    * @param args unused
    */
    
    public static void main(String[] args) {
        final double pPI = 3.14159;
        double radius;
        
        //Create a Scanner
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        
        //Prompt the user for the radius
        radius = myScanner.nextDouble();
        
        //Double the radius
        double doubleRadius = 2 * radius;
        
        //Calculate the Circumference
        double circumference = 2 * pPI * radius;
        
        //Calculate the Aream
        double area = pPI * radius * radius;
                
        //Modified Radius Calculations
        double circumferenceWithDoubleRadius = 2 * pPI * doubleRadius;
        double areaWithDoubleRadius = pPI * doubleRadius * doubleRadius;
        
        System.out.println("The circumference of the circle is: "
                + circumference);
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference with DOUBLE the radius is: "
                + circumferenceWithDoubleRadius);
        System.out.println("The area with DOUBLE the radius is: "
                + areaWithDoubleRadius);
        
        // Close the scanner to avoid resource leak
        myScanner.close();
    }
}
