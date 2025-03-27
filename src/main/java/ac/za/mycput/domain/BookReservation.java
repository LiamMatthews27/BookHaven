package ac.za.mycput.domain;

/*
Author: KodeKnack
Student Number: 230787932
 */
import java.time.LocalDate;

public class BookReservation {
    private String reservationID;
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private boolean reservationStatus;
    private Book book;
    private User user;


    public BookReservation() {
    }

    public BookReservation (Builder builder) {
        this.reservationID = builder.reservationID;
        this.reservationStartDate = builder.reservationStartDate;
        this.reservationEndDate = builder.reservationEndDate;
        this.reservationStatus = builder.reservationStatus;
        this.book = builder.book;
        this.user = builder.user;

    }

    public BookReservation(String reservationID, LocalDate reservationStartDate, LocalDate reservationEndDate, boolean reservationStatus, Book book) {
        this.reservationID = reservationID;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
        this.reservationStatus = reservationStatus;
        this.book = book;
        this.user = new User();
    }

    public String getReservationID() {
        return reservationID;
    }

    public LocalDate getReservationStartDate() {
        return reservationStartDate;
    }

    public LocalDate getReservationEndDate() {
        return reservationEndDate;
    }

    public boolean isReservationStatus() {
        return reservationStatus;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {return user;}

    @Override
    public String toString() {
        return "BookReservation{" +
                "reservationID='" + reservationID + '\'' +
                ", reservationStartDate=" + reservationStartDate +
                ", reservationEndDate=" + reservationEndDate +
                ", reservationStatus=" + reservationStatus +
                ", book=" + book +
                ", user=" + user +
                '}';
    }

    public static class Builder {
        private String reservationID;
        private LocalDate reservationStartDate;
        private LocalDate reservationEndDate;
        private boolean reservationStatus;
        private Book book;
        private User user;

        public Builder setReservationID(String reservationID) {
            this.reservationID = reservationID;
            return this;
        }

        public Builder setReservationStartDate(LocalDate reservationStartDate) {
            this.reservationStartDate = reservationStartDate;
            return this;
        }

        public Builder setReservationEndDate(LocalDate reservationEndDate) {
            this.reservationEndDate = reservationEndDate;
            return this;
        }

        public Builder setReservationStatus(boolean reservationStatus) {
            this.reservationStatus = reservationStatus;
            return this;
        }

        public void setBook(Book book) {
            this.book = book;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder copy (BookReservation bookReservation) {
            this.reservationID = bookReservation.getReservationID();
            this.reservationStartDate = bookReservation.getReservationStartDate();
            this.reservationEndDate = bookReservation.getReservationEndDate();
            this.reservationStatus = bookReservation.isReservationStatus();
            this.book = bookReservation.getBook();
            this.user = bookReservation.getUser();
            return this;

        }
        public BookReservation build() {
            return new BookReservation(this);
        }
    }

    
}
