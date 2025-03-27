package ac.za.mycput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNullOrInvalid(int num) {
        return num <= 0;
    }

    public static boolean isNullOrInvalid(double num) {
        return num <= 0;
    }

    //Engetelo  Helper for a user class
    // Email validation
    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }


    // Getting date of birth using userId number
    public static LocalDate getDateOfBirth(String id) {
        int year = Integer.parseInt(id.substring(0, 2));
        int month = Integer.parseInt(id.substring(2, 4));
        int day = Integer.parseInt(id.substring(4, 6));

        int currentYear = 2025;
        int currentCentury = (currentYear / 100) * 100;

        int birthYear = (year <= currentYear % 100) ? (currentCentury + year) : (currentCentury - 100 + year);
        return LocalDate.of(birthYear, month, day);
    }



    // Validate if userId number is 13 digits
    public static boolean validateID(String userIdentityNo) {
        if (userIdentityNo == null || userIdentityNo.length() != 13) {
            return false;
        }

        return true;
    }



}
