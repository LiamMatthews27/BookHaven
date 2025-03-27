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
        if (str.isEmpty() || str == null)
            return true;
        return false;
    }

    public static boolean isNullOrInvalid(int num) {
        if (num <= 0)
            return true;
        return false;
    }

    public static boolean isNullOrInvalid(double num) {
        if (num <= 0)
            return true;
        return false;
    }
   

 
    // Check if an integer value is null or invalid
    public static boolean isNullOrInvalid(Integer value) {
        return value == null || value <= 0;
    }

    // Determine if a fine should be issued
    public static boolean isFineApplicable(LocalDate loanDueDate, LocalDate loanReturnDate) {
        return loanReturnDate != null && loanReturnDate.isAfter(loanDueDate);
    }

    // Determine if loan is paid on time
    public static boolean isLoanPaid(LocalDate loanDueDate, LocalDate loanReturnDate) {
        return loanReturnDate != null && !loanReturnDate.isAfter(loanDueDate);
    }

    public static LocalDate getReservationDates(String reservationID) {
        int year = Integer.parseInt(reservationID.substring(0,2));
        int month =Integer.parseInt(reservationID.substring(2,4));
        int day = Integer.parseInt(reservationID.substring(4,6));
        LocalDate date  = LocalDate.of(year,month,day);
        return date;
    }



















}

