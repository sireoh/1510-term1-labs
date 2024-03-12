package p;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random gen = new Random();
        float output1 = gen.nextFloat();
        float output2 = gen.nextFloat();
        float output3 = (float) Math.ceil(gen.nextFloat());
        System.out.println(output1);
        System.out.println(output2);
        System.out.println("Please give me a one: " + output3);
    }
}
