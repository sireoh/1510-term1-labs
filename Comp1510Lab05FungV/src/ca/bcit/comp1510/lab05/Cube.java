package ca.bcit.comp1510.lab05;

/**
 * A program about a cube.
 * @author Vincent Fung
 * @version 1.0
 */
public class Cube {
    /** X coordinate. */
    private int xcoord;
    
    /** Y coordinate. */
    private int ycoord;

    /** Z coordinate. */
    private int zcoord;
    
    /** Edge Length. */
    private int edgeLength;

    
    /**
     * Constructor that calculates the area of a cube.
     * @param newX finds x.
     * @param newY finds y.
     * @param newZ finds z.
     * @param newEdgeLength finds newEdgeLength.
     */
    public Cube(int newX, int newY, int newZ, int newEdgeLength) {
        xcoord = newX;
        ycoord = newY;
        zcoord = newZ;
        edgeLength = newEdgeLength;
    }
    
    /**
     * Sets x.
     * @param newX an int.
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
     * @param newEdgeLength an int
     */
    public void setEdgeLength(int newEdgeLength) {
        this.edgeLength = newEdgeLength;
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
     * Returns edge length.
     * @return edge length as an int
     */
    public int getEdgeLength() {
        return edgeLength;
    }

    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public double findSurfaceArea() {
        double six = (2 + 2 + 2);
        double pw = Math.pow(edgeLength, 2);
        double sArea = (double) six * pw;
        return sArea;
    }
    
    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public double findVolume() {
        double three = (1 + 2);
        double volume = (double) Math.pow(edgeLength, three);
        return volume;
    }
    
    /**
     * Returns a String representation of this Die.
     * This needs decimal format.
     * @return toString description
     */
    public double findFaceDiagonal() {
        double faceDiagonal = (double) Math.sqrt(2 * edgeLength);
        return faceDiagonal;
    }
    
    /**
     * Returns a String representation of this Die.
     * This needs decimal format.
     * @return toString description
     */
    public double findSpaceDiagonal() {
        double three = (1 + 2);
        double spaceDiagonal = (double) Math.sqrt(three * edgeLength);
        return spaceDiagonal;
    }
    
    /**
     * Returns a String representation of this Die.
     * @return toString description
     */
    public String toString() {
        String result = "The surface area of the cube is: " + findSurfaceArea()
                + "\nThe volume of the cube is: " + findVolume()
                + "\nThe face diagonal of the cube is: " + findFaceDiagonal()
                + "\nThe space diagonal of the cube is: " + findSpaceDiagonal();
        return result;
    }
}
