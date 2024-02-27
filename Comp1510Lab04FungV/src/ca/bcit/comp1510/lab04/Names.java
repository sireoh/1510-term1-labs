package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Experimenting with Integer classes.
 * @author Vincent Fung
 * @version 1.0
 */

public class Names {
    /**
     * Program for names.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a first name: ");
        String fName = scan.nextLine();
        
        System.out.println("Please give me a middle name: ");
        String mName = scan.nextLine();
        
        System.out.println("Please give me a last name: ");
        String lName = scan.nextLine();

        Name name = new Name(fName, mName, lName);
        
        name.setFirstName(fName);
        name.getFirstName();
        name.setMiddleName(mName);
        name.getMiddleName();
        name.setLastName(lName);
        name.getLastName();
        
        System.out.println(name.toString());
        
        scan.close();
    }
}
