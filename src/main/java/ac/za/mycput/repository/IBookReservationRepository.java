package ac.za.mycput.repository;

import ac.za.mycput.domain.BookReservation;

import java.util.List;

public interface IBookReservationRepository extends IRepository<BookReservation, String> {
    List<BookReservation> getAll(BookReservation BookReservationAll);
}
