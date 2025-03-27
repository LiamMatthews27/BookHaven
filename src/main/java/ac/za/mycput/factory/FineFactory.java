package ac.za.mycput.factory;

import ac.za.mycput.domain.Fine;

import java.time.LocalDate;

public class FineFactory {

    public static Fine createFine(String loanID, String libraryISIL, String bookISBN, String userId, LocalDate returnDate, LocalDate issueDate, double fineAmount, String fineReason) {
        return new Fine.Builder()
                .setLoanID(loanID)
                .setLibraryISIL(libraryISIL)
                .setBookISBN(bookISBN)
                .setUserId(userId)
                .setReturnDate(returnDate)
                .setIssueDate(issueDate)
                .setFineAmount(fineAmount)
                .setFineReason(fineReason)
                .build();
    }

    public static Fine createOverdueFine(String loanID, String libraryISIL, String bookISBN, String userId, LocalDate returnDate, LocalDate issueDate) {
        return createFine(loanID, libraryISIL, bookISBN, userId, returnDate, issueDate, 5.0, "Overdue"); // Example amount
    }

    public static Fine createDamagedBookFine(String loanID, String libraryISIL, String bookISBN, String userId, LocalDate returnDate, LocalDate issueDate) {
        return createFine(loanID, libraryISIL, bookISBN, userId, returnDate, issueDate, 50.0, "Damaged book"); // Example amount
    }

    public static Fine createLostBookFine(String loanID, String libraryISIL, String bookISBN, String userId) {
        return createFine(loanID, libraryISIL, bookISBN, userId, LocalDate.now(), LocalDate.now(), 1000.0, "Lost"); // Example amount
    }
}