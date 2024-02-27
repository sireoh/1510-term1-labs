package p;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me you first name: ");
        String first = scan.next();
        System.out.println("Please give me you last name: ");
        String last = scan.next();
        String initials = first.substring(0,1).toUpperCase() + last.substring(0,1).toUpperCase();
        System.out.println("The initials are: " + initials);
    }
}
