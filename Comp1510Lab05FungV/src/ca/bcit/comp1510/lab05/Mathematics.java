package ca.bcit.comp1510.lab05;

/**
 * Some math test thing.
 * @author Vincent Fung
 * @version 1.0
 */
public class Mathematics {
    /** Private Instance for Last Name. */
    public static double PI = Math.PI;
    
    /**
     * Constructor calculates area.
     * @param d is for a double.
     * @return the area.
     */
    public double getCircleArea(double d) {
        double a = PI * Math.pow(d, 2);
        return a;
    }
    
    /**
     * Constructor that adds a number
     * and a number+one and divides them
     * by two.
     * @param i is for the input.
     * @return the area.
     */
    public int sumOfInts(int i) {
        int sum = 0;
        
        if (i > 0) {
            sum = (i * (i + 1)) / 2;
        } else {
            sum = 0;
        }
        return sum;
    }

    /**
     * Method that checks if a number is positive.
     * @param i is for the input.
     * @return a boolean if it is positive.
     */
    public boolean isPositive(int i) {
        if (i >= 1) {
            return true;
        }
        return false;
    }

    /**
     * Method checks if a number is even.
     * @param i is for the input.
     * @return a boolean if it is even.
     */
    public boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Method checks if a number is even.
     * @param n is for the input.
     * @return the sum of all even numbers.
     */
    public int sumOfEvens(int n) {
        int sum = 0;
        int s = 0;
        
        if (n != 0) {
            int i = s;
            while (i <= n) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
                i++;
            }
        } else {
            sum = 0;
        }
        
        if (n < 0) {
            sum = 0;
            int i = n;
            while (i <= 0) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
                i++;
            }
        }
        return sum;
    }
}
