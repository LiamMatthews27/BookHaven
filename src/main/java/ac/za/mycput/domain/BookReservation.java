package ac.za.mycput.domain;

/*
Author: Fhumulani Moses Makungo
Student Number: 230787932
 */
import java.time.LocalDate;

public class BookReservation {
    private String reservationID;
    private LocalDate reservationStartDate;
    private LocalDate reservationEndDate;
    private boolean reservationStatus;


    public BookReservation() {
    }

    public BookReservation (Builder builder) {
        this.reservationID = builder.reservationID;
        this.reservationStartDate = builder.reservationStartDate;
        this.reservationEndDate = builder.reservationEndDate;
        this.reservationStatus = builder.reservationStatus;


    }

    public BookReservation(String reservationID, LocalDate reservationStartDate, LocalDate reservationEndDate, boolean reservationStatus, Book book) {
        this.reservationID = reservationID;
        this.reservationStartDate = reservationStartDate;
        this.reservationEndDate = reservationEndDate;
        this.reservationStatus = reservationStatus;

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



    @Override
    public String toString() {
        return "BookReservation{" +
                "reservationID='" + reservationID + '\'' +
                ", reservationStartDate=" + reservationStartDate +
                ", reservationEndDate=" + reservationEndDate +
                ", reservationStatus=" + reservationStatus +
                '}';
    }

    public static class Builder {
        private String reservationID;
        private LocalDate reservationStartDate;
        private LocalDate reservationEndDate;
        private boolean reservationStatus;


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



        public Builder copy (BookReservation bookReservation) {
            this.reservationID = bookReservation.getReservationID();
            this.reservationStartDate = bookReservation.getReservationStartDate();
            this.reservationEndDate = bookReservation.getReservationEndDate();
            this.reservationStatus = bookReservation.isReservationStatus();
            return this;

        }
        public BookReservation build() {
            return new BookReservation(this);
        }
    }

    
}
