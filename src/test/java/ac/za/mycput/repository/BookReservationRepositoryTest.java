package ac.za.mycput.repository;

import ac.za.mycput.domain.BookReservation;
import ac.za.mycput.factory.BookReservationFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BookReservationRepositoryTest {

    private static IBookReservationRepository repository = BookReservationRepository.getRepository();

    private BookReservation bookReservation = BookReservationFactory.createBookReservation("234000", "2025-03-29", "25", "");

    @Test
    void a_create() {
        BookReservation createdBookReservation = repository.create(bookReservation);
        //assertNotNull(created);
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
        BookReservation newBookReservation = new BookReservation.Builder().copy(bookReservation).setReservationID("34535")
            .build();
        BookReservation updatedBookReservation = repository.update(newBookReservation);
        assertNotNull(updatedBookReservation);
        System.out.println(updatedBookReservation.toString());

    }

    @Test
    @Disabled
    void d_delete() {
       // assertTrue(BookReservationRepository.delete(bookReservation.getReservationID()));
        System.out.println("Book reservation deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(BookReservationRepository.getAll());
    }
}
