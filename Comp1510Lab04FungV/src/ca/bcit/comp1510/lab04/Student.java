package ca.bcit.comp1510.lab04;

/**
 * Making student thing.
 * @author Vincent Fung
 * @version 2024
 */

public class Student {
    /** Private Instance for First Name. */
    private String firstName;
    
    /** Private Instance for Last Name. */
    private String lastName;
    
    /** Private Instance for Year of Birth. */
    private int birthYear;
    
    /** Private Instance for Student Number. */
    private String studentNumber;
    
    /** Private Instance for Gpa. */
    private int studentGPA;
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @param fName is for first name.
     * @param lName is for last name.
     * @param i is for birth year.
     * @param sNum is for student number.
     * @param j is for student gpa.
     */
    public Student(String fName, String lName, int i, String sNum, int j) {
        firstName = fName;
        lastName = lName;
        birthYear = i;
        studentNumber = sNum;
        studentGPA = j;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @param fName is for first name.
     */
    public void setFirstName(String fName) {
        this.firstName = fName;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @param lName is for last name.
     */
    public void setLastName(String lName) {
        this.lastName = lName;
    }

    /**
     * Driver program creates two Die objects and rolls them.
     * @param i is for setting the birth year.
     */
    public void setBirthYear(int i) {
        this.birthYear = i;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @param sNum is for the student number.
     */
    public void setStudentNumber(String sNum) {
        this.studentNumber = sNum;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @param sGPA is for student gpa.
     */
    public void setStudentGPA(int sGPA) {
        this.studentGPA = sGPA;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @return helps give the first name.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @return helps get the last name.
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @return the birth year.
     */
    public int getBirthYear() {
        return birthYear;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @return student number.
     */
    public String getStudentNumber() {
        return studentNumber;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @return student gpa.
     */
    public int getStudentGPA() {
        return studentGPA;
    }
    
    /**
     * Driver program creates two Die objects and rolls them.
     * @return all the information into a final string.
     */
    public String toString() {
        String allInfo =
                firstName
                + " " + lastName
                + " " + birthYear
                + " " + studentNumber
                + " " + studentGPA;
        return allInfo;
    }
}
