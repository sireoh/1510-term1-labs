package q4;

import java.util.Scanner;

/**
 * 
 * Pack is a program that Encodes and Decodes characters from the ASCII
 * table of elements "A to I" only though, because the character after I
 * is a triangle.
 * <p>
 * The program begins by taking the string which is assumed to be an
 * integer with five place values. It goes through the list and assumes
 * that the numbers are already in base fifty-six and we would have to
 * change it back to decimal. This is done by times-ing to the power of
 * four, then three, two and one and zero to fifty-six to each digit 
 * similar to the base converter we did before. And then to the number
 * in the place value and then adding them together.
 * <p>
 * Then, once all the numbers are encoded to 89579953 it gets decoded back to
 * 96521 by taking 89579953 and dividing it by 56 and then taking the remainder
 * as the first digit, and the left side is the amount left. I would take
 * the amount left and divide it by 56 and take the remainder and so on five
 * times to print out 96521.
 *
 * @author Vincent Fung
 * @version 1.0
 */
public class Pack {
    /** Zero. */
    static final int ZERO = 0;
    
    /** One. */
    static final int ONE = 1;
    
    /** Two. */
    static final int TWO = 2;
    
    /** Three. */
    static final int THREE = 3;
    
    /** Four. */
    static final int FOUR = 4;
    
    /** Fifty-six. */
    static final int FIFTYSIX = 56;
    
    /** Offset. */
    static final int OFFSET = 1;
    
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give five letters(A to I) to decode: ");
        String input = scan.next();
        
        // Extract the nth character from the string.
        char c1 = input.charAt(ZERO);
        char c2 = input.charAt(ONE);
        char c3 = input.charAt(TWO); 
        char c4 = input.charAt(THREE);
        char c5 = input.charAt(FOUR);
        
        //Convert the character to it's numeric value.
        int v1 = c1 - 'A' + OFFSET;
        int v2 = c2 - 'A' + OFFSET;
        int v3 = c3 - 'A' + OFFSET;
        int v4 = c4 - 'A' + OFFSET;
        int v5 = c5 - 'A' + OFFSET;
        
        // Convert to its value
        String numericConcat = String.valueOf(v1) 
                + String.valueOf(v2) 
                + String.valueOf(v3) 
                + String.valueOf(v4) 
                + String.valueOf(v5);
        System.out.println("Numbers converted to numeric value: "
                + numericConcat);
    
        // Convert to base 10, from base 56(originally)
        int cc1 = v1 * (int) Math.pow(FIFTYSIX, FOUR);
        int cc2 = v2 * (int) Math.pow(FIFTYSIX, THREE);
        int cc3 = v3 * (int) Math.pow(FIFTYSIX, TWO);
        int cc4 = v4 * FIFTYSIX;
        int cc5 = v5;
        
        //Print out the statement
        int encoded = cc1 + cc2 + cc3 + cc4 + cc5;
        
        System.out.println("The ENCODED integer is : " + encoded);
        
        //Decode Back
        int r1 = (int) encoded % FIFTYSIX;
        double leftSide = Math.floor(encoded / FIFTYSIX);
        
        int r2 = (int) leftSide % FIFTYSIX;
        leftSide = Math.floor(leftSide / FIFTYSIX);
        
        int r3 = (int) leftSide % FIFTYSIX;
        leftSide = Math.floor(leftSide / FIFTYSIX);
        
        int r4 = (int) leftSide % FIFTYSIX;
        leftSide = Math.floor(leftSide / FIFTYSIX);
        
        int r5 = (int) leftSide % FIFTYSIX;
        leftSide = Math.floor(leftSide / FIFTYSIX);
        
        
        String decoded = String.valueOf(r5)
                + String.valueOf(r4)
                + String.valueOf(r3)
                + String.valueOf(r2)
                + String.valueOf(r1);
        
        System.out.println("The DECODED integer is: " + decoded);
        
        //Close scanner
        scan.close();
    }

}
