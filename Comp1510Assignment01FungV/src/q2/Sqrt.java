package q2;

import java.util.Scanner;

/** 
 * Uses the algorithm from Newton to calculate the square root of an
 * inputted number.
 * <p>
 * It uses Newtons formula to calculate square root by initially adding 
 * one and then taking that total and dividing it by two. Then, the
 * initial number[a] is added by the total from the previous
 * answer[s] and then divided by the answer that was given in the 
 * previous question[s] The answer for the new line is then divided by two.
 * This process happens ten more times to become more accurate.
 * 
 * @author Vincent Fung
 * @version 1.0
 */

public class Sqrt {
    /**
     * Drives the program.
     * @param args unused.
     */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a number to square root: ");
        double a = (double) scan.nextDouble();
        
        double s = (a + 1) / 2;
        System.out.println("Estimate #1: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #2: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #3: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #4: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #5: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #6: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #7: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #8: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #9: " + s);
        
        s = (s + a / s) / 2;
        System.out.println("Estimate #10: " + s);
        
        //Close the scanner
        scan.close();
    }
}
