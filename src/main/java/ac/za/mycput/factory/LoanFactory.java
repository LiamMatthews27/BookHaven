package ac.za.mycput.factory;

import ac.za.mycput.domain.Loan;
import ac.za.mycput.util.Helper;
import java.time.LocalDate;

public class LoanFactory {
   // Fine per book

    public static Loan createLoan(int loanId, LocalDate loanDate, LocalDate loanDueDate, LocalDate loanReturnDate, int bookLoanAmount) {

        // Validate input parameters using Helper
        if (Helper.isNullOrInvalid(loanId) || Helper.isNullOrInvalid(bookLoanAmount) || loanDate == null || loanDueDate == null) {
            System.out.println("Invalid loan details provided. Loan creation failed.");
            return null;
        }

        // Determine if a fine is applicable
        boolean fineApplicable = Helper.isFineApplicable(loanDueDate, loanReturnDate);
        int fineAmount;
        if (fineApplicable) {
            fineAmount = bookLoanAmount ;
        } else {
            fineAmount = 0;
        }

        // Determine loan status based on whether the fine is applied
        boolean loanStatus = !fineApplicable; // Loan is cleared (true) if no fine, else false

        // Create and return Loan object using Builder pattern
        return new Loan.Builder()
                .setLoanId(loanId)
                .setLoanDate(loanDate)
                .setLoanDueDate(loanDueDate)
                .setLoanReturnDate(loanReturnDate)
                .setLoanStatus(loanStatus) // Set loan status based on fine applicability
                .setBookLoanAmount(bookLoanAmount)
                .build();
    }
}
