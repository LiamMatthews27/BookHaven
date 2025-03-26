package ac.za.mycput.domain;

/*
Author: Engetelo Assistance Mathebane
Student Number: 230227767
 */


import java.time.LocalDate;

public class User {

    private int userId;
    private String userName;
    private String userSurname;
    private LocalDate userDateOfBirth;
    private String userEmail;
    private String userAddress;
    private Book bookBorrowed; //relationship between user and a book
    private BookReservation bookReservation ;
    // private Fine fine; //for a composition relationship between user and fine
    // private Loan loan; // for a relationship between user and loan

    public User(){

    }

    public User(Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userSurname = builder.userSurname;
        this.userDateOfBirth = builder.userDateOfBirth;
        this.userEmail = builder.userEmail;
        this.userAddress = builder.userAddress;
        this.bookBorrowed = builder.bookBorrowed;
        this.bookReservation = builder.bookReservation;
    }


    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public Book getBookBorrowed() {
        return bookBorrowed;
    }

    public BookReservation getBookReservation() {
        return bookReservation;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                ", userDateOfBirth=" + userDateOfBirth +
                ", userEmail='" + userEmail + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", bookBorrowed=" + bookBorrowed +
                ", bookReservation=" + bookReservation +
                '}';
    }
    public static class Builder {

        private int userId;

        private String userName;

        private String userSurname;

        private LocalDate userDateOfBirth;

        private String userEmail;

        private String userAddress;

        private Book bookBorrowed; //relationship between user and a book

        private BookReservation bookReservation ;//relationship between user and reservation

        //private Fine fine; //for a composition relationship between user and fine

        // private Loan loan; // for a relationship between user and loan

        public Builder setUserId(int userId) {
            this.userId = userId;
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

        public Builder setUserDateOfBirth(LocalDate userDateOfBirth) {
            this.userDateOfBirth = userDateOfBirth;
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
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


        public Builder copy(User user) {
            this.userId =user.userId;
            this.userName = user.userName;
            this.userSurname= user.userSurname;
            this.userDateOfBirth= user.userDateOfBirth;
            this.userEmail = user.userEmail;
            this.userAddress =user.userAddress;
            this.bookBorrowed =user.bookBorrowed;
            this.bookReservation = user.bookReservation;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}



