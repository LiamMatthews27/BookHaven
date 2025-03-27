package ac.za.mycput.domain;

// *Zintle Mgqongose* //
import java.time.LocalDate;

public class Fine {

    private String loanID;
    private String libraryISIL;
    private String bookISBN;
    private String userId;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private double fineAmount;
    private String fineStatus;
    private String fineReason;

    private Fine() {}


    private Fine(Builder builder) {
        this.loanID = builder.loanID;
        this.libraryISIL = builder.libraryISIL;
        this.bookISBN = builder.bookISBN;
        this.userId = builder.userId;
        this.issueDate = builder.issueDate;
        this.returnDate = builder.returnDate;
        this.fineAmount = builder.fineAmount;
        this.fineStatus = builder.fineStatus;
        this.fineReason = builder.fineReason;
    }


    public String getLoanID() {
        return loanID;
    }

    public String getLibraryISIL() {
        return libraryISIL;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public String getUserId() {
        return userId;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public String getFineStatus() {
        return fineStatus;
    }

    public String getFineReason() {
        return fineReason;
    }


    @Override
    public String toString() {
        return "Fine{" +
                "loanID='" + loanID + '\'' +
                ", libraryISIL='" + libraryISIL + '\'' +
                ", bookISBN='" + bookISBN + '\'' +
                ", userId='" + userId + '\'' +
                ", issueDate=" + issueDate +
                ", returnDate=" + returnDate +
                ", fineAmount=" + fineAmount +
                ", fineStatus='" + fineStatus + '\'' +
                ", fineReason='" + fineReason + '\'' +
                '}';
    }

    public static class Builder {
        private String loanID;
        private String libraryISIL;
        private String bookISBN;
        private String userId;
        private LocalDate issueDate;
        private LocalDate returnDate;
        private double fineAmount;
        private String fineStatus = "Pending";
        private String fineReason;

        public Builder setLoanID(String loanID) {
            this.loanID = loanID;
            return this;
        }

        public Builder setLibraryISIL(String libraryISIL) {
            this.libraryISIL = libraryISIL;
            return this;
        }

        public Builder setBookISBN(String bookISBN) {
            this.bookISBN = bookISBN;
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setIssueDate(LocalDate issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public Builder setReturnDate(LocalDate returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder setFineAmount(double fineAmount) {
            this.fineAmount = fineAmount;
            return this;
        }

        public Builder setFineStatus(String fineStatus) {
            this.fineStatus = fineStatus;
            return this;
        }

        public Builder setFineReason(String fineReason) {
            this.fineReason = fineReason;
            return this;
        }

        public Builder copy(Fine fine) {
            this.loanID = fine.loanID;
            this.libraryISIL = fine.libraryISIL;
            this.bookISBN = fine.bookISBN;
            this.userId = fine.userId;
            this.issueDate = fine.issueDate;
            this.returnDate = fine.returnDate;
            this.fineAmount = fine.fineAmount;
            this.fineStatus = fine.fineStatus;
            this.fineReason = fine.fineReason;
            return this;
        }

        public Fine build() {
            return new Fine(this);
        }
    }
}