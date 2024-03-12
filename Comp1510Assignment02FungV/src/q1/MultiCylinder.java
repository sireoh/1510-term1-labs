package q1;

import java.text.DecimalFormat;

/**
 * The MultiCylinder class calculates two cylinder objects
 * with updated values.
 * @author Your Name goes here
 * @version 1.0
 */
public class MultiCylinder {
    /** three. */
    static final double THREE = 3;
    
    /** ten. */
    static final double TEN = 10;

    /** five. */
    static final double FIVE = 5;
    
    /** twenty. */
    static final double TWENTY = 20;
    
    /** seven. */
    static final double SEVEN = 7;
    
    /** thirty. */
    static final double THIRTY = 30;
    
    /** nine. */
    static final double NINE = 9;
    
    /** fourty. */
    static final double FOURTY = 40;
    
    /**
     * This is the main method (entry point) that gets called by the JVM.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Decimal Format.
        DecimalFormat df = new DecimalFormat("#.####");
        
        // Initialize the objects.
        Cylinder cylinder1 = new Cylinder(THREE, TEN);
        Cylinder cylinder2 = new Cylinder(FIVE, TWENTY);
        
        // Calculate and display properties for Cylinder #1.
        double r1 = cylinder1.getRadius();
        double h1 = cylinder1.getHeight();
        double sa1 = cylinder1.calcSurfaceArea(r1, h1);
        double vol1 = cylinder1.calcVolume(r1, h1);
        
        // Calculate and display properties for Cylinder #2.
        double r2 = cylinder2.getRadius();
        double h2 = cylinder2.getHeight();
        double sa2 = cylinder2.calcSurfaceArea(r2, h2);
        double vol2 = cylinder2.calcVolume(r2, h2);
        
        System.out.println("Cylinder #1:\n" + cylinder1.toString() + "\n"
            + "The surface area is: " + df.format(sa1) + "\n"
            + "The volume is: " + df.format(vol1) + "\n"
            + "Cylinder #2:\n" + cylinder2.toString() + "\n"
            + "The surface area is: " + df.format(sa2) + "\n"
            + "The volume is: " + df.format(vol2) + "\n");
        
        // Update Cylinder #1 and #2 new dimensions.
        cylinder1.setRadius(SEVEN);
        cylinder1.setHeight(THIRTY);
        
        cylinder2.setRadius(NINE);
        cylinder2.setHeight(FOURTY);
        
        // Calculate Updated Cylinder #1.
        r1 = cylinder1.getRadius();
        h1 = cylinder1.getHeight();
        sa1 = cylinder1.calcSurfaceArea(r1, h1);
        vol1 = cylinder1.calcVolume(r1, h1);
        
        //Calculate Updated Cylinder #2.
        r2 = cylinder2.getRadius();
        h2 = cylinder2.getHeight();
        sa2 = cylinder2.calcSurfaceArea(r2, h2);
        vol2 = cylinder2.calcVolume(r2, h2);
        
        System.out.println("Updated Cylinder #1:\n"
            + cylinder1.toString() + "\n"
            + "The surface area is: " + df.format(sa1) + "\n"
            + "The volume is: " + df.format(vol1) + "\n"
            + "Updated Cylinder #2:\n"
            + cylinder2.toString() + "\n"
            + "The surface area is: " + df.format(sa2) + "\n"
            + "The volume is: " + df.format(vol2));
    }
}
