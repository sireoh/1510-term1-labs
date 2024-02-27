package ca.bcit.comp1510.lab05;

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
        this.firstName = fName;
    }
    
    /**
     * Setter that sets the middle name.
     * @param mName is for middle Name.
     */
    public void setMiddleName(String mName) {
        this.middleName = mName;
    }
    
    /**
     * Setter that sets the last name.
     * @param lName is for First Name.
     */
    public void setLastName(String lName) {
        this.lastName = lName;
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
     * Method that returns the length of a name.
     * @return the name length.
     */
    public int nameLength() {
        return (firstName + middleName + lastName).length();
    }
    
    /**
     * Method that returns the name initials.
     * @return the name initials.
     */
    public String nameInitials() {
        String nameInitials = firstName.substring(0, 1).toUpperCase()
                + middleName.substring(0, 1).toUpperCase()
                + lastName.substring(0, 1).toUpperCase();
        return nameInitials;
    }
    
    /**
     * Method that returns the letter in place n.
     * @param n is the spot we look for the character at.
     * @return letter.
     */
    public char findLetter(int n) {
        String fullName = firstName + middleName + lastName;
        char letter = fullName.charAt(n);
        return letter;
    }
    
    /**
     * Method that returns the formatted name.
     * @return the formatted name.
     */
    public String formatName() {
        String formattedName = lastName + ", "
                + firstName + " "
                + middleName + ".";
        return formattedName;
    }
    
    /**
     * Method that returns boolean if first name matches.
     * @param x is the thing I put inside to check the name.
     * @return the boolean if the name matches.
     */
    public boolean isFirstName(String x) {
        return x.equals(firstName);
    }
    
    /**
     * Method that returns boolean if full name matches.
     * @param name is the thing you input for a new name.
     * @return boolean of f m and l.
     */
    public boolean isFullName(Name name) {
        return this.firstName.equals(name.firstName)
                && this.middleName.equals(name.middleName)
                && this.lastName.equals(name.lastName);
    }
    
    /**
     * Concats all the info.
     * @return the first name.
     */
    public String toString() {
        String output = "The full name is: "
                + firstName
                + middleName
                + lastName;
        return output;
    }
}
