package p;

public class IfElse {
    public static void main(String[] args) {
        int x = 0;
        int a = 0;
        int b = -5;
        
        if (a > 0) {
            if (b < 0) {
                x += 5;
            } else if (a > 5) {
                x += 4;
            } else {
                x += 3;
            }
        } else {
            x += 2;
        }
        
        System.out.println("The value of x is: " + x);
    }
}
