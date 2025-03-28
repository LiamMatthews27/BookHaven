package ac.za.mycput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Helper {

    // Check if the string is null or empty
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    // Check if a numeric value is invalid (<= 0)
    public static boolean isNullOrInvalid(int num) {
        if (num <= 0) {
            return true;
        }
        return false;
    }

    // Check if a numeric value is invalid (<= 0)
    public static boolean isNullOrInvalid(double num) {
        if (num <= 0) {
            return true;
        }
        return false;
    }

    // Email validation
    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(email);
    }

    // Extract date of birth from the user's ID (first 6 digits: YYMMDD)
    public static LocalDate getDateOfBirth(String id) {
        if (id == null || id.length() < 6) {
            return null; // Invalid ID
        }
        try {
            int year = Integer.parseInt(id.substring(0, 2));
            int month = Integer.parseInt(id.substring(2, 4));
            int day = Integer.parseInt(id.substring(4, 6));

            // Fix year by assuming 1900s, adjust logic if needed (e.g., if year < 22, use 20xx, else use 19xx)
            year += (year > 22) ? 1900 : 2000;

            // Create LocalDate object
            return LocalDate.of(year, month, day);
        } catch (Exception e) {
            // Handle parsing error, invalid date format
            return null;
        }
    }

    // Check if an integer value is null or invalid (i.e., <= 0)
    public static boolean isNullOrInvalid(Integer value) {
        return value == null || value <= 0;
    }

    // Check if a fine should be applied based on the loan dates
    public static boolean isFineApplicable(LocalDate loanDueDate, LocalDate loanReturnDate) {
        return loanReturnDate != null && loanReturnDate.isAfter(loanDueDate);
    }

    // Check if loan was paid on time
    public static boolean isLoanPaid(LocalDate loanDueDate, LocalDate loanReturnDate) {
        return loanReturnDate != null && !loanReturnDate.isAfter(loanDueDate);
    }

    //Determines it is the correct number written
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\+27\\d{9}");
    }

    public static LocalDate getReservationDates(String reservationID) {
        // Check if reservationID is exactly 6 characters
        if (reservationID == null || reservationID.length() != 6) {
            throw new IllegalArgumentException("Invalid reservation ID: Must be exactly 6 characters (YYMMDD).");
        }

        try {
            int year = Integer.parseInt(reservationID.substring(0, 2)) + 2000;
            int month = Integer.parseInt(reservationID.substring(2, 4));
            int day = Integer.parseInt(reservationID.substring(4, 6));

            // Validate and return LocalDate
            return LocalDate.of(year, month, day);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid reservation ID: Must contain only numbers.");
        } catch (DateTimeException e) {
            throw new IllegalArgumentException("Invalid reservation ID: Month or day is out of range.");
        }



        //this is a comment
    }

}
