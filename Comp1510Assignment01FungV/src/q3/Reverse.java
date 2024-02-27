package q3;

import java.util.Scanner;

import java.util.Stack;

/**
 * Reverse is a number that gives an inputed string and spits out
 * the reverse form to the user.
 * <p>
 * This program works by taking all the words given from the user and
 * transferring it over to tokens using a scanner that automatically
 * separates them with a space. It then "pushes" them using the push()
 * command and pops them out, using pop() which automatically deletes the
 * previous token and thus printing it backwards.
 *
 * @author Your Name goes here
 * @version 1.0
 */
public class Reverse {
    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Create scanner
        Scanner scan = new Scanner(System.in);
        
        // Create a stack thing
        Stack<String> stack = new Stack<String>();
        
        // 10 Word sentence input (using scanner.next())
        System.out.println("Enter 10 words: ");
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        stack.push(scan.next());
        
        // Print out the words in reverse order.
        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
        
        System.out.println(stack.pop());

        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
        
        //Close the scannner
        scan.close();
    }
}
