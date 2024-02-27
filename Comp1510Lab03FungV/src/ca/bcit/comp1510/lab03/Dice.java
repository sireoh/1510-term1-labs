package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
* Makes random dice things.
*
* @author Vincent Fung
* @version 0.1
*/

public class Dice {
    /** The number for four-sided die. */
    static final int FOUR_SIDED = 4;

    /** The number for six-sided die. */
    static final int SIX_SIDED = 6;

    /** The number for eight-sided die. */
    static final int EIGHT_SIDED = 8;

    /** The number for ten-sided die. */
    static final int TEN_SIDED = 10;
    
    /** The number for twelve-sided die. */
    static final int TWELVE_SIDED = 12;
    
    /** The number for twenty-sided die. */
    static final int TWENTY_SIDED = 20;
    
    /** Changes from computing counting to human counting. */
    static final int zeroToOneAsStarter = 1;
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Random random = new Random();
        
        // 4-sided die
        int fourDie = (random.nextInt(FOUR_SIDED) + zeroToOneAsStarter);
        // 6-sided die
        int sixDie = (random.nextInt(SIX_SIDED) + zeroToOneAsStarter);
        // 8-sided die
        int eightDie = (random.nextInt(EIGHT_SIDED) + zeroToOneAsStarter);
        // 10-sided die
        int tenDie = (random.nextInt(TEN_SIDED) + zeroToOneAsStarter);
        // 12-sided die
        int twelveDie = (random.nextInt(TWELVE_SIDED) + zeroToOneAsStarter);
        // 20-sided die
        int twentyDie = (random.nextInt(TWENTY_SIDED) + zeroToOneAsStarter);
        System.out.println("Four-sided dice: " + fourDie);
        System.out.println("Six-sided dice: " + sixDie);
        System.out.println("Eight-sided dice: " + eightDie);
        System.out.println("Ten-sided dice: " + tenDie);
        System.out.println("Twelve-sided dice: " + twelveDie);
        System.out.println("I rrroll the d20: " + twentyDie);
    }
}
