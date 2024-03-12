package q1;

/**
 * The Cylinder class represents a cylinder object with a radius and a height.
 * @author Vincent Fung.
 * @version 2024.
 */
public class Cylinder {
    /** radius of the cylinder. */
    private double radius;

    /** radius of the cylinder. */
    private double height;
    
    /** radius of the cylinder. */
    private double surfacearea;
    
    /** radius of the cylinder. */
    private double volume;

    /**
     * Constructs a Cylinder object with the given radius and height.
     *
     * @param r the radius of the cylinder
     * @param h the height of the cylinder
     */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    /**
     * Calculates the surface area of the cylinder.
     *
     * @param r the radius of the cylinder
     * @param h the height of the cylinder
     * @return the surface area of the cylinder
     */
    public double calcSurfaceArea(double r, double h) {
        double sa = (2 * Math.PI * r) * (r + h);
        return sa;
    }

    /**
     * Calculates the volume of the cylinder.
     *
     * @param r the radius of the cylinder
     * @param h the height of the cylinder
     * @return the volume of the cylinder
     */
    public double calcVolume(double r, double h) {
        double vol = Math.PI * Math.pow(r, 2) * h;
        return vol;
    }

    /**
     * Gets the radius of the cylinder.
     *
     * @return the radius of the cylinder
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the cylinder.
     *
     * @param radius the new radius of the cylinder
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Gets the height of the cylinder.
     *
     * @return the height of the cylinder
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the cylinder.
     *
     * @param height the new height of the cylinder
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the surface area of the cylinder.
     *
     * @return the surface area of the cylinder
     */
    public double getSurfacearea() {
        return surfacearea;
    }

    /**
     * Sets the surface area of the cylinder.
     *
     * @param surfacearea the new surface area of the cylinder
     */
    public void setSurfacearea(double surfacearea) {
        this.surfacearea = surfacearea;
    }

    /**
     * Gets the volume of the cylinder.
     *
     * @return the volume of the cylinder
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the cylinder.
     *
     * @param volume the new volume of the cylinder
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns a string representation of the cylinder.
     *
     * @return a string representation of the cylinder
     */
    public String toString() {
        String output = "The current radius of the cylinder is: " + getRadius()
                + "\nThe current height of the cylinder is: " + getHeight();
        return output;
    }
}
