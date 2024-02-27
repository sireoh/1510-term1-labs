package ca.bcit.comp1510.lab02;

/**
* Creates a table with students and their lab, bonus and total marks.
* 
* @author Vincent Fung
* @version 0.1
*/

public class Students {
    /**
    * Drives the program.
    * @param args unused
    */
    
    public static void main(String[] args) {
        //Define Variables
        String student1 = "Aaron";
        final int lab1 = 43;
        final int bonus1 = 7;
        
        String student2 = "Maryam";
        final int lab2 = 50;
        final int bonus2 = 8;
        
        String student3 = "Marco";
        final int lab3 = 39;
        final int bonus3 = 10;
        
        String student4 = "Carly";
        final int lab4 = 87;
        final int bonus4 = 6;
        
        String student5 = "Bruce";
        final int lab5 = 99;
        final int bonus5 = 0;
        
        //Print out the Data into a Table
        System.out.println("///////////////////"
                + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==\tStudent Points\t==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                + "///////////////////");
        System.out.println("Name\tLab\tBonus\tTotal");
        System.out.println("----\t----\t----\t----");
        System.out.println(student1 + "\t" + lab1
                + "\t" + bonus1 + "\t" + (lab1 + bonus1));
        System.out.println(student2 + "\t" + lab2
                + "\t" + bonus2 + "\t" + (lab2 + bonus2));
        System.out.println(student3 + "\t" + lab3
                + "\t" + bonus3 + "\t" + (lab3 + bonus3));
        System.out.println(student4 + "\t" + lab4
                + "\t" + bonus4 + "\t" + (lab4 + bonus4));
        System.out.println(student5 + "\t" + lab5
                + "\t" + bonus5 + "\t" + (lab5 + bonus5));
    }
}
