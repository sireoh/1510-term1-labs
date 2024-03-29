package ca.bcit.comp1510.lab05;

/**
 * A program about a sphere.
 * @author Vincent Fung
 * @version 1.0
 */
public class Sphere {
    /** X coordinate. */
    private int xcoord;
    
    /** Y coordinate. */
    private int ycoord;

    /** Z coordinate. */
    private int zcoord;
    
    /** Radius. */
    private int radius;

    /**
     * Constructor that calculates the area of a sphere.
     * @param newX does something.
     * @param newY does something.
     * @param newZ does something.
     * @param newRadius does something.
     */
    public Sphere(int newX, int newY, int newZ, int newRadius) {
        xcoord = newX;
        ycoord = newY;
        zcoord = newZ;
        radius = newRadius;
    }
    
    /**
     * Sets x.
     * @param newX an int
     */
    public void setX(int newX) {
        this.xcoord = newX;
    }
    
    /**
     * Sets y.
     * @param newY an int
     */
    public void setY(int newY) {
        this.ycoord = newY;
    }
    
    /**
     * Sets z.
     * @param newZ an int
     */
    public void setZ(int newZ) {
        this.zcoord = newZ;
    }
    
    /**
     * Sets radius.
     * @param newRadius an int
     */
    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    /**
     * Returns x.
     * @return x as an int
     */
    public int getX() {
        return xcoord;
    }
    
    /**
     * Returns y.
     * @return y as an int
     */
    public int getY() {
        return ycoord;
    }
    
    /**
     * Returns z.
     * @return z as an int
     */
    public int getZ() {
        return zcoord;
    }
    
    /**
     * Returns radius.
     * @return radius as an int
     */
    public int getRadius() {
        return radius;
    }
    
    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public double findVolume() {
        double pPI = Math.PI;
        double fourOverThree = (double) (2 + 2) / (1 + 2);
        int powerThree = (1 + 2);
        double fracPi = (double) fourOverThree * pPI;
        double rThree = Math.pow(radius, powerThree);
        double volume = (double) fracPi * rThree;
        return volume;
    }
    
    /**
     * Returns a string.
     * @return radius as an int
     */
    public String toString() {
        String result = "The volume of the sphere is: "
            + findVolume();
        return result;
    }
}
