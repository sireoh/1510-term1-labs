package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * Experimenting with Integer classes.
 * @author Vincent Fung
 * @version 1.0
 */

public class NameDriver {
    /**
     * Program for names.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Name name = new Name("     ", "margaret", "");
        Name name2 = new Name("marco", "      ", "ho");

        System.out.println(name.toString());
        System.out.println(name2.toString());

        Name name3 = new Name("vincent", "jiajun", "fung");
        System.out.println("Provide 'n's character position: ");
        int n = scan.nextInt();
        System.out.println("The character at "
                + n + " is: "
                + name3.findLetter(n));

        scan.close();
    }
}
