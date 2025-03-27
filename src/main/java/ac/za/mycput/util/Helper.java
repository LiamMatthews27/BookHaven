package ac.za.mycput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class Helper {

    public static boolean isNullOrEmpty(String str) {
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
    //helper for a user class
    //Email validation
    public static boolean isValidEmail(String email) {
        EmailValidator validator = EmailValidator.getInstance();
        if(validator.isValid(email)) {
            return true;
        } else{
            return false;
        }
    }

    //getting dateof birth using userId
    public static LocalDate getDateOfBirth(String id) {
        int year = Integer.parseInt(id.substring(0,2));
        int month =Integer.parseInt(id.substring(2,4));
        int day = Integer.parseInt(id.substring(4,6));
        LocalDate date  = LocalDate.of(year,month,day);
        return date;
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

