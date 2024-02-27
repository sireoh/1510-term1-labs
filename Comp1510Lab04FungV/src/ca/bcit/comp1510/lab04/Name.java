package ca.bcit.comp1510.lab04;

/**
 * Some name gen thing.
 * @author Vincent Fung
 * @version 1.0
 */

public class Name {
    /** Private Instance for First Name. */
    private String firstName;
    
    /** Private Instance for Middle Name. */
    private String middleName;
    
    /** Private Instance for Last Name. */
    private String lastName;
    
    /**
     * Constructor that helps make first, middle and last name.
     * @param fName is for First Name.
     * @param mName is for Middle Name.
     * @param lName is for Last Name.
     */
    public Name(String fName, String mName, String lName) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
    }
    
    /**
     * Setter that sets the first name.
     * @param fName is for First Name.
     */
    public void setFirstName(String fName) {
        firstName = firstName.substring(0, 1).toUpperCase()
                + firstName.substring(1).toLowerCase();
    }
    
    /**
     * Setter that sets the middle name.
     * @param mName is for middle Name.
     */
    public void setMiddleName(String mName) {
        middleName = middleName.substring(0, 1).toUpperCase()
                + middleName.substring(1).toLowerCase();
    }
    
    /**
     * Setter that sets the last name.
     * @param lName is for First Name.
     */
    public void setLastName(String lName) {
        lastName = lastName.substring(0, 1).toUpperCase()
                + lastName.substring(1).toLowerCase();
    }
    
    /**
     * Getter for first name.
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Getter for middle name.
     * @return the middle name
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Getter for last name.
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Concats all the info.
     * @return the first name.
     */
    public String toString() {
        String fullName = firstName + " " + middleName + " " + lastName;
        return fullName;
    }
}
