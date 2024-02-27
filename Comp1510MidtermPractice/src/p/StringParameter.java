package p;

public class StringParameter {
    public static void main(String[] args) {
        String a = "Hello".substring(0, 1); //The parameters are integers not strings.
        System.out.println("The substring method uses numbers: " + a);
        
        String b = "Hello".toUpperCase(); //This doesn't use parameters.
        System.out.println("The toUpperCase method doesn't have parameters: "+ b);
        
        int c = "Hello".length(); //This doesn't have parameters.
        System.out.println("The length method doesn't have parameters: " + c);
        
        String d = "Hello";
        String e = "World";
        boolean f = d.equals(e);    //String parameters(so like 'e'
                                    //is a string in this case) are passed into this method.
        boolean g = "Hello".equals("Hello"); //String parameters are passed into this method.
        System.out.println("Is d equal to e: " + f);
        System.out.println("Is 'Hello' equal to 'Hello': " + g);
    }
}
