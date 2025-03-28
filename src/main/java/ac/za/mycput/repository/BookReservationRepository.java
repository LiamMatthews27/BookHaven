package ac.za.mycput.repository;

import ac.za.mycput.domain.BookReservation;

import java.util.ArrayList;
import java.util.List;

public class BookReservationRepository implements IBookReservationRepository{

    private static IBookReservationRepository repository = null;

    private static List<BookReservation> bookReservationList;

    private BookReservationRepository(){
        bookReservationList = new ArrayList<BookReservation>();
    }

    public static IBookReservationRepository getRepository() {
        if (repository == null) {
            repository = new BookReservationRepository();
        }
        return repository;
    }


    @Override
    public BookReservation create(BookReservation bookReservation) {
        boolean success = bookReservationList.add(bookReservation);
        if (success) {
            return bookReservation;
        }
        return null;
    }

    @Override
    public BookReservation read(String reservationId) {
        for (BookReservation bR : bookReservationList) {
            if (bR.getReservationID().equals(reservationId)) {
                return bR;
            }
        }
        return null;
    }

    @Override
    public BookReservation update(BookReservation bookReservation) {
        String reservationID = bookReservation.getReservationID();
        BookReservation bookReservationOld = read(reservationID);
        if (bookReservationOld != null) {

            boolean success = bookReservationList.remove(bookReservationOld);
            if (success) {
                if (bookReservationList.add(bookReservation))
                    return bookReservation;
            }
            return null;
        }
        return bookReservationOld;
    }

    @Override
    public boolean delete(String reservationID) {
        BookReservation bookReservation = read(reservationID);
        if (bookReservation == null)
            return false;
        return bookReservationList.remove(bookReservation);
    }

    public static List<BookReservation> getAll() {
        return bookReservationList;
    }

    @Override
    public List<BookReservation> getAll(BookReservation BookReservationAll) {
        return List.of();
    }
}
