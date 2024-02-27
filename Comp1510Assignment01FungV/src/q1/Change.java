package q1;

import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * Change is a program that returns the amount of money in
 * tens, five, two, one dollars and cents of quarter, tens, and five
 * value. 
 * <p>
 * This first separates the inputed value, and separates it to dollars,
 * which is in a integer value and cents which are in floats decimal value.
 * 
 * @author Vincent Fung
 * @version 1.0
 */
public class Change {
    /** Ten Dollars. */
    static final int TEN_DOLLARS = 10;
    
    /** Five Dollars. */
    static final int FIVE_DOLLARS = 5;
    
    /** Two Dollars. */
    static final int TOONIES = 2;
    
    /** One Dollars. */
    static final int DOLLARS = 1;
    
    /** Twenty-five cents. */
    static final double QUARTERS = 0.25;
    
    /** Ten cents. */
    static final double DIMES = 0.1;
    
    /** Five Cents. */
    static final double NICKLES = 0.05;
    
    /** Base Max Integer Amount. */
    static final double DIVISOR = 1000000000;
    
    /** Cents offset. */
    static final double CENTS_OFFSET = 100;
    
    /**
     * Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a money value in the format 0.00: ");
        double moneyGiven = (double) scan.nextDouble();
        
        int totalAmt;
        double totalCents;
        
        int dollars = (int) moneyGiven % (int) DIVISOR;
        
        double cents = (double) (moneyGiven - dollars);
        DecimalFormat decimalFormat = new DecimalFormat("0");
        
        System.out.println("You gave me " + dollars
                + " dollar(s) and "
                + decimalFormat.format(cents * CENTS_OFFSET)
                + " cents.");
        
        int tenDollars = (int) (dollars / TEN_DOLLARS) * TEN_DOLLARS;
        totalAmt = dollars - tenDollars;
        System.out.println((tenDollars / TEN_DOLLARS) + " Ten Dollar Bill(s).");

        int fiveDollars = (int) (totalAmt / FIVE_DOLLARS) * FIVE_DOLLARS;
        totalAmt = totalAmt - fiveDollars;
        System.out.println((fiveDollars / FIVE_DOLLARS)
                + " Five Dollar Bill(s).");
        
        int toonies = (int) (totalAmt / TOONIES) * TOONIES;
        totalAmt = totalAmt - toonies;
        System.out.println((toonies / TOONIES) + " Toonie(s).");
        
        int loonies = (int) (totalAmt / DOLLARS) * DOLLARS;
        totalAmt = totalAmt - loonies;
        System.out.println((loonies / DOLLARS) + " Loonie(s).");
        
        double quarters = (int) (cents / QUARTERS) * QUARTERS;
        totalCents = cents - quarters;
        System.out.println((int) (quarters / QUARTERS) + " Quarter(s).");
        
        double dimes = (int) (totalCents / DIMES) * DIMES;
        totalCents = totalCents - dimes;
        System.out.println((int) (dimes / DIMES) + " Dime(s).");
        
        double nickles = (int) (totalCents / NICKLES) * NICKLES;
        totalCents = totalCents - nickles;
        System.out.println((int) (nickles / NICKLES) + " Nickles(s).");
        
        double pennies = (int) (totalCents / DIMES) * DIMES;
        double penniesOffset = pennies + DIMES;
        totalCents = totalCents - penniesOffset;
        System.out.println((int) (pennies / DIMES) + " Pennie(s).");
        
        scan.close();
    }
}
