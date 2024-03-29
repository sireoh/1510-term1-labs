package ca.bcit.comp1510.lab05;

/**
 * A program about a cone.
 * @author Vincent Fung
 * @version 1.0
 */
public class Cone {
    /** X coordinate. */
    private int xcoord;
    
    /** Y coordinate. */
    private int ycoord;

    /** Z coordinate. */
    private int zcoord;
    
    /** Radius. */
    private int radius;
    
    /** Height. */
    private int height;
    
    /**
     * Constructor that calculates the area of a cone.
     * @param newX finds x.
     * @param newY finds y.
     * @param newZ finds z.
     * @param newRadius finds radius.
     * @param newHeight finds height.
     */
    public Cone(int newX, int newY, int newZ, int newRadius, int newHeight) {
        xcoord = newX;
        ycoord = newY;
        zcoord = newZ;
        radius = newRadius;
        height = newHeight;
    }
    
    /**
     * Setter that sets x.
     * @param newX sets x.
     */
    public void setX(int newX) {
        this.xcoord = newX;
    }
    
    /**
     * Setter that sets y.
     * @param newY an int.
     */
    public void setY(int newY) {
        this.ycoord = newY;
    }
    
    /**
     * Setter that sets z.
     * @param newZ is an int.
     */
    public void setZ(int newZ) {
        this.zcoord = newZ;
    }
    
    /**
     * Sets newRadius.
     * @param newRadius an int.
     */
    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }
    
    /**
     * Sets height.
     * @param newHeight an int.
     */
    public void setHeight(int newHeight) {
        this.height = newHeight;
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
     * Returns height.
     * @return height as an int
     */
    public int getHeight() {
        return height;
    }

    /**
     * Calculates the volume.
     * @return the volume of the cone.
     */
    public double findVolume() {
        double oneOverThree = (double) 1 / (1 + 2);
        double mathPI = Math.PI;
        double fracTimesPI = (double) oneOverThree * mathPI;
        double radSquaredTimesH = (double) Math.pow(radius, 2) * height;
        double volume = (double) fracTimesPI * radSquaredTimesH;
        return volume;
    }
    
    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public double findSlantHeight() {
        double slantheight = (double) Math.sqrt(Math.pow(radius, 2)
                + Math.pow(height, 2));
        return slantheight;
    }
    
    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public double findSurfaceArea() {
        double mathPI = Math.PI;
        double surfacearea = (double) (mathPI * Math.pow(radius, 2))
                + ((mathPI * radius) * (Math.sqrt(Math.pow(radius, 2)
                + Math.pow(height, 2))));
        return surfacearea;
    }
    
    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = "The volume of the cone is: " + findVolume()
            + "\nThe slant height of the cone is: " + findSlantHeight()
            + "\nThe surface area of a cone is: " + findSurfaceArea();
        return result;
    }
}
