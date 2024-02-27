package p;
import java.text.DecimalFormat;

public class DecFormat {
    public static void main(String[] args) {
        double area = 3.14159;
        String output;
        DecimalFormat fmt = new DecimalFormat("0.##");
        output = fmt.format(area);
        System.out.println("The formatted number is: " + output);
    }
}
