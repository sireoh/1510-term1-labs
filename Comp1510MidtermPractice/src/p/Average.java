package p;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y, z;
        double average;
        System.out.println("Give me x, y and z: ");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        
        average = (x + y + z) / 3;
        System.out.println("The average is : " + average);
        
        scan.close();
    }
}
