package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Experimenting with Geometric Shapes.
 * @author Vincent Fung
 * @version 1.0
 */

public class GeometryDriver {
    /**
     * Program for geometric shapes.
     * @param args unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        System.out.println("Please give me a radius for a sphere: ");
        int newRadius = scan.nextInt();
        System.out.println("Please give me coordinates"
                + "(x, y and z) separated by a space: ");
        int newX = scan.nextInt();
        int newY = scan.nextInt();
        int newZ = scan.nextInt();
        
        Sphere inputSphere = new Sphere(newRadius, newX, newY, newZ);
        System.out.println("The volume of the sphere is: "
                + df.format(inputSphere.findVolume()));
        
        System.out.println("Please give me an edge length for a cube: ");
        int newEdgeLength = scan.nextInt();
        System.out.println("Please give me coordinates(x, y and z)"
                + "separated by a space: ");
        newX = scan.nextInt();
        newY = scan.nextInt();
        newZ = scan.nextInt();
        
        Cube inputCube = new Cube(newEdgeLength, newX, newY, newZ);
        System.out.println("The surface area of the cube is: "
            + df.format(inputCube.findSurfaceArea())
            + "\nThe volume of the cube is: "
            + df.format(inputCube.findVolume())
            + "\nThe face diagonal of the cube is: "
            + df.format(inputCube.findFaceDiagonal())
            + "\nThe space diagonal of the cube is: "
            + df.format(inputCube.findSpaceDiagonal()));
        
        System.out.println("Please give me an radius for a cone: ");
        newRadius = scan.nextInt();
        System.out.println("Please give me a height for a cone: ");
        int newHeight = scan.nextInt();
        System.out.println("Please give me coordinate"
                + "(x, y and z) separated by a space: ");
        newX = scan.nextInt();
        newY = scan.nextInt();
        newZ = scan.nextInt();
        
        Cone inputCone = new Cone(newRadius, newHeight, newX, newY, newZ);
        System.out.println("The volume of the cone is: "
            + df.format(inputCone.findVolume())
            + "\nThe slant height of the cone is: "
            + df.format(inputCone.findSlantHeight())
            + "\nThe surface area of a cone is: "
            + df.format(inputCone.findSurfaceArea()));
        
        scan.close();
    }
}
