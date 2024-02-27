package p;
import java.util.Scanner;

public class InitialsTest {
    private String firstname;
    private String lastname;
    
    public InitialsTest(String newF, String newL) {
        firstname = newF;
        lastname = newL;
    }
    
    public String firstInitial(String f) {
        String first = firstname.substring(0, 1).toUpperCase();
        return first;
    }
    
    public String lastInitial(String l) {
        String last = lastname.substring(0, 1).toUpperCase();
        return last;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me you first name: ");
        String newF = scan.next();
        System.out.println("Please give me you last name: ");
        String newL = scan.next();
        
        InitialsTest test = new InitialsTest(newF, newL);
        System.out.println("The first initial is: " + test.firstInitial(newF));
        System.out.println("The last initial is: " + test.lastInitial(newL));
        
        scan.close();
    }
}
