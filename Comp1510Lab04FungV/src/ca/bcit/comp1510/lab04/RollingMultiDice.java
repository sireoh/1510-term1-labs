package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Demonstrates the creation and use of a user-defined class.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class RollingMultiDice {
    /**
     * Driver program creates two Die objects and rolls them.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        final int newFace = 4;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Type a number of die face: ");
        int face = scan.nextInt();
        
        MultiDie die1;
        MultiDie die2;
        int sum;
        
        System.out.println("You gave me a dice with " + face + " faces.");

        die1 = new MultiDie(face);
        die2 = new MultiDie(face);

        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(newFace);
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);
        
        scan.close();
    }
}

