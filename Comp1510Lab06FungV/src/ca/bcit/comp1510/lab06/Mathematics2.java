package ca.bcit.comp1510.lab06;

import java.util.Random;

/**
 * Mathematics2 class performs various mathematical operations.
 * @author Vincent Fung.
 * @version 1.0
 */
public class Mathematics2 {

    /** Conversion ratio from feet to kilometers. */
    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
    
    /** Sixteen. */
    public static final int SIXTEEN = 16;
    
    /** Ten. */
    public static final int TEN = 10;
    
    /**
    * Returns the area of the square with the specified edge length.
    * @param d of the square.
    * @return area as a double
    */
    public double getSquareArea(double d) {
        double area = d * d;
        return area;
    }

    /**
    * Returns the sum of the specified values.
    * @param d first operand
    * @param e second operand
    * @return sum of the operands
    */
    public double add(double d, double e) {
        double sum = d + e;
        return sum;
    }

    /**
     * Returns the sum of the specified values.
     * @param d first operand
     * @param e second operand
     * @return sum of the operands
     */
    public double multiply(double d, double e) {
        double product = d * e;
        return product;
    }

    /**
     * Returns the sum of the specified values.
     * @param d first operand
     * @param e second operand
     * @return sum of the operands
     */
    public double subtract(double d, double e) {
        double difference = d - e;
        return difference;
    }

    /**
     * Returns the sum of the specified values.
     * @param i first operand
     * @param j second operand
     * @return sum of the operands
     */
    public double divide(int i, int j) {
        double division = 0;
        if (j > 0) {
            division = i / j;
        } else {
            division = 0;
        }
        return division;
    }

    /**
    * Returns the absolute value of the specified integer.
    * @param i number
    * @return absolute value of number
    */
    public int absoluteValue(int i) {
        int abs = Math.abs(i);
        return abs;
    }

    /**
    * Returns a random number between 10 and 20 inclusive,
    * but NOT 15.
    * @return random number in range [10, 20] excluding 15.
    */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        Random random = new Random();
        
        // Flip a coin heads > 15
        // Tails is < 15
        boolean isHeads = random.nextBoolean();
        int offset = 1;
        int heads = 0;
        int tails = 0;
        int value = 0;
        
        if (isHeads) {
            heads = random.nextInt((2 + 2) + offset) + SIXTEEN;
            value = heads;
        } else if (!isHeads) {
            tails = random.nextInt((2 + 2) + offset) + TEN;
            value = tails;
        }
        return value;
    }

    /**
    * Converts the specified number of feet to kilometres.
    * @param d feet to convert
    * @return kilometres in the specified number of feet
    */
    public double convertFeetToKilometres(double d) {
        double km = d * FOOT_TO_KILOMETRE_RATIO;
        return km;
    }

    /**
    * Returns the sum of the numbers between zero and the
    * first parameter that are divisible by the second
    * number. For example, sumOfProducts(10, 3) will return
    * 3 + 6 + 9 = 18, and sumOfProducts(10, 2) will return
    * 2 + 4 + 6 + 8 + 10 = 30 and sumOfProducts(-10, 2) will
    * return -2 + -4 + -6 + -8 + -10 = -30.
    * @param m bound the upper bound
    * @param n divisor the divisor
    * @return sum
    */
    public int sumOfProducts(int m, int n) {
        int quotient = (int) (m / n);
        int sum = 0;
        int i = 0;
        int end = 0;
        if (m > 0) {
            i = 0;
            end = quotient;
            while (i < end + 1) {
                sum = sum + (n * i);
                i++;
            }
        } else if (quotient < 0) {
            i = quotient;
            while (i < 0) {
                sum = sum + (n * i);
                i++;
            }
        }
        return sum;
    }
    
}
