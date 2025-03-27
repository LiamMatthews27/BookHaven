package ac.za.mycput.factory;

import ac.za.mycput.domain.Book;
import ac.za.mycput.domain.BookReservation;
import ac.za.mycput.domain.User;
import ac.za.mycput.util.Helper;
import java.time.LocalDate;



/*
Author: Fhumulani Moses Makungo
Student Number: 230787932
 */
public class BookReservationFactory {
    public static BookReservation createBookReservation(
            String reservationID,
            LocalDate reservationStartDate,
            LocalDate reservationEndDate,
            boolean reservationStatus,
            Book book,
            User user) {

        // Validate reservationID
        if (Helper.isNullOrEmpty(reservationID)) {
            throw new IllegalArgumentException("Reservation ID cannot be null or empty");
        }

        // Validate required fields
        if (reservationStartDate == null || reservationEndDate == null) {
            throw new IllegalArgumentException("Reservation dates cannot be null");
        }
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        // Create and return a valid BookReservation object
        return new BookReservation.Builder()
                .setReservationID(reservationID)
                .setReservationStartDate(reservationStartDate)
                .setReservationEndDate(reservationEndDate)
                .setReservationStatus(reservationStatus)
                //.setBook(book)
                //.setUser(user)
                .build();

    }
}
