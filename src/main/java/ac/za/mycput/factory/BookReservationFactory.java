package ac.za.mycput.factory;

import ac.za.mycput.domain.BookReservation;
import ac.za.mycput.domain.Book;
import ac.za.mycput.domain.User;
import ac.za.mycput.util.Helper;
import java.time.LocalDate;

public class BookReservationFactory {

    public static BookReservation createBookReservation(
            String reservationID,
            LocalDate reservationStartDate,
            LocalDate reservationEndDate,
            boolean reservationStatus,
            Book book,
            User user) {

        if (reservationStartDate == null || reservationEndDate == null) {
            System.out.println("Invalid reservation dates provided. Reservation creation failed.");
            return null;
        }
        if (Helper.isNullOrInvalid(reservationID)) {
            System.out.println("Invalid reservation ID. Reservation creation failed.");
            return null;
        }
        if (book == null) {
            System.out.println("Invalid book details. Reservation creation failed.");
            return null;
        }
        if (user == null) {
            System.out.println("Invalid user details. Reservation creation failed.");
            return null;
        }

        return new BookReservation.Builder()
                .setReservationID(reservationID)
                .setReservationStartDate(reservationStartDate)
                .setReservationEndDate(reservationEndDate)
                .setReservationStatus(reservationStatus)
                .setBook(book)
                .setUser(user)
                .build();
    }

    public static String displayReservationDates(BookReservation reservation) {
        if (reservation == null) {
            return "Reservation details not available.";
        }

        return "Reservation Start Date: " + reservation.getReservationStartDate() +
                "\nReservation End Date: " + reservation.getReservationEndDate();
    }
}
