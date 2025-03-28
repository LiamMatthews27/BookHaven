package ac.za.mycput.factory;

//*214280829 Zintle Mgqongose*//

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

}