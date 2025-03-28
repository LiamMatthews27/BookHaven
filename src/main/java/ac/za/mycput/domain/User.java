/*
Author: Engetelo Assistance Mathebane
Student Number: 230227767
*/
package ac.za.mycput.domain;

import java.time.LocalDate;

public class User {
    private int userId;
    private String userIdentityNo;  // Changed to String
    private String userName;
    private String userSurname;
    private String userEmail;
    private String userAddress;
    private LocalDate dateOfBirth;
    private Book bookBorrowed; // Relationship between user and a book not created
    private BookReservation bookReservation;//relationship between a use and book, not created yet
    private Fine fine;
    private Loan loan;


    public User() {}

    public User(Builder builder) {
        this.userId =builder.userId;
        this.userIdentityNo = builder.userIdentityNo;
        this.userName = builder.userName;
        this.userSurname = builder.userSurname;
        this.userEmail = builder.userEmail;
        this.userAddress = builder.userAddress;
        this.dateOfBirth = builder.dateOfBirth;
        this.bookBorrowed = builder.bookBorrowed;
        this.bookReservation = builder.bookReservation;
        this.fine = builder.fine;
        this.loan = builder.loan;
    }

    public String getUserId() {
        return userIdentityNo;
    }

    public String getUserIdentityNo() {
        return userIdentityNo;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Book getBookBorrowed() {
        return bookBorrowed;
    }

    public BookReservation getBookReservation() {
        return bookReservation;
    }

    public Fine getFine() {
        return fine;
    }

    public Loan getLoan() {
        return loan;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userIdentityNo='" + userIdentityNo + '\'' +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", bookBorrowed=" + bookBorrowed +
                ", bookReservation=" + bookReservation +
                ", fine=" + fine +
                ", loan=" + loan +
                '}';
    }

    public static class Builder {
        private int userId;
        private String userIdentityNo;  // Changed to String
        private String userName;
        private String userSurname;
        private String userEmail;
        private String userAddress;
        private LocalDate dateOfBirth;
        private Book bookBorrowed;
        private BookReservation bookReservation;
        private Fine fine;
        private  Loan loan;


        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }


        public Builder setUserIdentityNo(String userIdentityNo) {
            this.userIdentityNo = userIdentityNo;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserSurname(String userSurname) {
            this.userSurname = userSurname;
            return this;
        }

        public Builder setUserAddress(String userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setBookBorrowed(Book bookBorrowed) {
            this.bookBorrowed = bookBorrowed;
            return this;
        }

        public Builder setBookReservation(BookReservation bookReservation) {
            this.bookReservation = bookReservation;
            return this;
        }

        public Builder setFine(Fine fine) {
            this.fine = fine;
            return this;
        }

        public Builder setLoan(Loan loan) {
            this.loan = loan;
            return  this;
        }

        public Builder copy(User user) {
            this.userId = user.userId;
            this.userIdentityNo = user.userIdentityNo;
            this.userName = user.userName;
            this.userSurname = user.userSurname;
            this.userEmail = user.userEmail;
            this.userAddress = user.userAddress;
            this.dateOfBirth = user.dateOfBirth;
            this.bookBorrowed = user.bookBorrowed;
            this.bookReservation = user.bookReservation;
            this.fine = user.fine;
            this.loan = user.loan;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
