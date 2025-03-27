package ac.za.mycput.factory;

import ac.za.mycput.domain.Fine;
import ac.za.mycput.domain.Loan;
import ac.za.mycput.domain.User;

import java.time.LocalDate;

public class FineFactory {

    public static Fine createFine(int fineID, int returnID, double fineAmount, String fineStatus, LocalDate fineDate, User user, Loan loan) {
        return new Fine.Builder()
                .setFineID(fineID)
                .setReturnID(returnID)
                .setFineAmount(fineAmount)
                .setFineStatus(fineStatus)
                .setFineDate(fineDate)
                .setUserOfFine(user)
                .setLoanOfFine(loan)
                .build();
    }

    public static Fine createOverdueFine(int fineID, int returnID, User user, Loan loan, LocalDate fineDate) {

        return createFine(fineID, returnID, 5.0, "Overdue", fineDate, user, loan);
    }

    public static Fine createDamagedBookFine(int fineID, int returnID, User user, Loan loan, LocalDate fineDate) {

        return createFine(fineID, returnID, 50.0, "Damaged", fineDate, user, loan);
    }

    public static Fine createLostBookFine(int fineID, int returnID, User user, Loan loan) {

        return createFine(fineID, returnID, 1000.0, "Lost", LocalDate.now(), user, loan);
    }
}