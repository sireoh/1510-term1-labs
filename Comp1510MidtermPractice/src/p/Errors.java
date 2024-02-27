package p;

public class Errors { 
    public static void main(String[] args) {
//        //Syntax errors
//        String syntaxerror == vincent;
//        System.out.println(syntaxerror);
//        
//        //Logical errors
//        int a = 7;
//        int b = 9;
//        int c = 0;
//        c = a + b;
//        if (b > a) {
//            Subtract the number from 5.
//            c += 5;
//        }
//        System.out.println(c);
        
        //Runtime error
        int x = 5;
        int y = 0;

        while (y < 10) {
          int result = 5 / (x - y);
          System.out.println("The result is: " + result);
          y++;
        }
    }
}
