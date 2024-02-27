package ca.bcit.comp1510.lab06;

/**
 * Some name gen thing.
 * @author Vincent Fung
 * @version 2.0
 */
public class Name {
    /** Public Instance for 64. */
    public static final int ASCII_AT_SIGN = 64;
    
    /** Private Instance for First Name. */
    private String firstName;
    
    /** Private Instance for Middle Name. */
    private String middleName;
    
    /** Private Instance for Last Name. */
    private String lastName;
    
    /**
     * Constructor that helps make first, middle and last name.
     * @param newF is for First Name.
     * @param newM is for Middle Name.
     * @param newL is for Last Name.
     */
    public Name(String newF, String newM, String newL) {
        if (newF.isBlank()) {
            firstName = "JANE";
        } else {
            firstName = newF.substring(0, 1).toUpperCase()
                    + newF.substring(1).toLowerCase();
        }
        if (newM.isBlank()) {
            middleName = "MIDDLENAME";
        } else {
            middleName = newM.substring(0, 1).toUpperCase()
                    + newM.substring(1).toLowerCase();
        }
        if (newL.isBlank()) {
            lastName = "DOE";
        } else {
            lastName = newL.substring(0, 1).toUpperCase()
                    + newL.substring(1).toLowerCase();
        }
    }
    
    /**
     * Setter that sets the first name.
     * @param newF is for First Name.
     */
    public void setFirstName(String newF) {
        String trimmedFN = newF.trim();
        this.firstName = trimmedFN;
    }
    
    /**
     * Setter that sets the middle name.
     * @param newM is for middle Name.
     */
    public void setMiddleName(String newM) {
        String trimmedMN = newM.trim();
        this.middleName = trimmedMN;
    }
    
    /**
     * Setter that sets the last name.
     * @param newL is for First Name.
     */
    public void setLastName(String newL) {
        String trimmedLN = newL.trim();
        this.lastName = trimmedLN;
    }
    
    /**
     * Getter that gets the first name.
     * @return firstName.
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Getter that gets the first name.
     * @return firstName.
     */
    public String getMiddleName() {
        return middleName;
    }
    
    /**
     * Getter that gets the first name.
     * @return firstName.
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Method that returns the letter in place n.
     * @param n is the spot we look for the character at.
     * @return letter.
     */
    public char findLetter(int n) {
        String fullName = firstName + middleName + lastName;
        char letter;
        char placeholder = (char) ASCII_AT_SIGN;
        int len = fullName.length() - 1;
        if (n > len) {
            letter = placeholder;
        } else if (n < 0) {
            letter = placeholder;
        } else {
            letter = fullName.charAt(n);
        }
        return letter;
    }
    
    /**
     * Concats all the info.
     * @return the first name.
     */
    public String toString() {
        String output = "The full name is: "
                + firstName + " "
                + middleName + " "
                + lastName;
        return output;
    }
}
