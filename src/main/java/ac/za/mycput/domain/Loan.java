package ac.za.mycput.domain;

import java.time.LocalDate;

public class Loan {
    private int loanId;
    private LocalDate loanDate;
    private LocalDate loanDueDate;
    private LocalDate loanReturnDate;
    private boolean loanStatus;
    private int bookLoanAmount;
    private int fineAmount;  // New field for fine amount

    private Loan(Builder builder) {
        this.loanId = builder.loanId;
        this.loanDate = builder.loanDate;
        this.loanDueDate = builder.loanDueDate;
        this.loanReturnDate = builder.loanReturnDate;
        this.loanStatus = builder.loanStatus;
        this.bookLoanAmount = builder.bookLoanAmount;
        this.fineAmount = builder.fineAmount;
    }

    // Getters for all fields
    public int getLoanId() {
        return loanId;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getLoanDueDate() {
        return loanDueDate;
    }

    public LocalDate getLoanReturnDate() {
        return loanReturnDate;
    }

    public boolean isLoanStatus() {
        return loanStatus;
    }

    public int getBookLoanAmount() {
        return bookLoanAmount;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", loanDate=" + loanDate +
                ", loanDueDate=" + loanDueDate +
                ", loanReturnDate=" + loanReturnDate +
                ", loanStatus=" + loanStatus +
                ", bookLoanAmount=" + bookLoanAmount +
                ", fineAmount=" + fineAmount + // Display fine amount as well
                '}';
    }

    // Builder class for Loan
    public static class Builder {
        private int loanId;
        private LocalDate loanDate;
        private LocalDate loanDueDate;
        private LocalDate loanReturnDate;
        private boolean loanStatus;
        private int bookLoanAmount;
        private int fineAmount; // New field for fine amount

        public Builder setLoanId(int loanId) {
            this.loanId = loanId;
            return this;
        }

        public Builder setLoanDate(LocalDate loanDate) {
            this.loanDate = loanDate;
            return this;
        }

        public Builder setLoanDueDate(LocalDate loanDueDate) {
            this.loanDueDate = loanDueDate;
            return this;
        }

        public Builder setLoanReturnDate(LocalDate loanReturnDate) {
            this.loanReturnDate = loanReturnDate;
            return this;
        }

        public Builder setLoanStatus(boolean loanStatus) {
            this.loanStatus = loanStatus;
            return this;
        }

        public Builder setBookLoanAmount(int bookLoanAmount) {
            this.bookLoanAmount = bookLoanAmount;
            return this;
        }

        public Builder setFineAmount(int fineAmount) { // New setter for fine amount
            this.fineAmount = fineAmount;
            return this;
        }

        public Loan build() {
            return new Loan(this);
        }
    }


}
