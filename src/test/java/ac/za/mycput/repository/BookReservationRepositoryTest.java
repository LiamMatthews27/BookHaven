package ac.za.mycput.repository;

import ac.za.mycput.domain.Book;
import ac.za.mycput.domain.BookReservation;
import ac.za.mycput.domain.Library;
import ac.za.mycput.factory.BookReservationFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BookReservationRepositoryTest {

    private static IBookReservationRepository repository = BookReservationRepository.getRepository();

    private BookReservation bookReservation = BookReservationFactory.createBookReservation(
            "234000",
            LocalDate.of(2025, 3,12),
            LocalDate.of(2025, 3,12),
            true);

    @Test
    void a_create() {
        BookReservation createdBookReservation = repository.create(bookReservation);
        assertNotNull(createdBookReservation);
        System.out.println(createdBookReservation.toString());
    }

    @Test
    void b_read() {
        BookReservation read = repository.read(bookReservation.getReservationID());
        assertNotNull(read);
        System.out.println(read.toString());
    }


    @Test
    void c_update() {
        BookReservation newBookReservation = new BookReservation.Builder().copy(bookReservation).setReservationID("34535").build();
        BookReservation createdBookReservation = repository.create(newBookReservation);
        BookReservation updatedBookReservation = repository.update(createdBookReservation);
        assertNotNull(updatedBookReservation, "updated");
        System.out.println(updatedBookReservation.toString());
    }

    @Test
    void d_delete() {
       assertTrue(repository.delete(bookReservation.getReservationID()));
        System.out.println("Book reservation deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(BookReservationRepository.getAll());
    }
}
