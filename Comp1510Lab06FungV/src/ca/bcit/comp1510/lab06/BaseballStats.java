package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author blink, Vincent Fung.
 * @version 1.0
 */
public class BaseballStats {
    
    /**
     * Reads baseball stats from a file and counts
     * total hits, outs, walks, and sacrifice flies
     * for each player.
     * @param args The command-line arguments (not used).
     * @throws FileNotFoundException if not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        
        while (fileScan.hasNext()) {
            String line = fileScan.nextLine();
            lineScan = new Scanner(line);
            lineScan.useDelimiter(","); 
            
            System.out.println(lineScan.next() + ":");
            int hits = 0;
            int outs = 0;
            int walks = 0;
            int sacrifices = 0;
            
            while (lineScan.hasNext()) {
                String x = lineScan.next();
                
                if (x.equals("h")) {
                    hits++;
                } else if (x.equals("o")) {
                    outs++;
                } else if (x.equals("w")) {
                    walks++;
                } else if (x.equals("s")) {
                    sacrifices++;
                }
            }
            double average = (double) hits / (double) (hits + outs);
            System.out.println("Hits: " + hits
                    + "\nOuts: " + outs
                    + "\nWalks: " + walks
                    + "\nSacrifices: " + sacrifices
                    + "\nAverage: " + average);
        }
        scan.close();
        fileScan.close();
    }
}