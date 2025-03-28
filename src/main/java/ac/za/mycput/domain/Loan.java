/*
Loan.java
Loan model class
Author: Liam Matthews
Student Number: 221818340
Date: 23 March 2025
 */
package ac.za.mycput.domain;
import java.time.LocalDate;

public class Loan {
    private int loanId;
    private LocalDate loanDate;
    private LocalDate loanDueDate;
    private LocalDate loanReturnDate;
    private boolean loanStatus;
    private int bookLoanAmount;


    public Loan(Builder builder) {
        this.loanId = builder.loanId;
        this.loanDate = builder.loanDate;
        this.loanDueDate = builder.loanDueDate;
        this.loanReturnDate = builder.loanReturnDate;
        this.loanStatus = builder.loanStatus;
        this.bookLoanAmount = builder.bookLoanAmount;

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



    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", loanDate=" + loanDate +
                ", loanDueDate=" + loanDueDate +
                ", loanReturnDate=" + loanReturnDate +
                ", loanStatus=" + loanStatus +
                ", bookLoanAmount=" + bookLoanAmount +
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
        public Loan build() {
            return new Loan(this);
        }
    }
}
