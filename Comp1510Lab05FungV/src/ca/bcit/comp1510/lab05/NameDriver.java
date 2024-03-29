package ca.bcit.comp1510.lab05;

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
        
        Name name = new Name("Vincent", "Jiajun", "Fung");
        
        System.out.println("The name length is: " + name.nameLength());
        
        System.out.println("The name initials are: " + name.nameInitials());
        
        System.out.println("Please give me a #(n) from 0-17: ");
        int n = scan.nextInt();
        System.out.println("The character at: "
                + n + " is: "
                + name.findLetter(n));
        System.out.println("The formatted name is: " + name.formatName());
        
        System.out.println("First name: ");
        String fn = scan.next();
        System.out.println("Does your name match mine? "
                + name.isFirstName(fn));
        
        System.out.println("Please give me your full"
                + "name(eg. First Middle Name): ");
        String f = scan.next();
        String m = scan.next();
        String l = scan.next();
        
        Name friend = new Name(f, m, l);
        System.out.println("Does your full name match mine? "
                + name.isFullName(friend));
        
        scan.close();
    }
}
