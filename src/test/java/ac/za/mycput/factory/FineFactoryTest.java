package ac.za.mycput.factory;

import ac.za.mycput.domain.Fine;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FineFactoryTest {

    @Test
    void createFine() {
        Fine fine = FineFactory.createFine("LOAN123", "LIB123", "ISBN123", "USER456", LocalDate.now(), LocalDate.now().minusDays(5), 10.0, "Test fine");

        assertNotNull(fine);
        assertEquals("LOAN123", fine.getLoanID());
        assertEquals("LIB123", fine.getLibraryISIL());
        assertEquals("ISBN123", fine.getBookISBN());
        assertEquals("USER456", fine.getUserId());
        assertEquals(10.0, fine.getFineAmount());
        assertEquals("Test fine", fine.getFineReason());
        System.out.println(fine);
    }

    @Test
    void createOverdueFine() {
        Fine overdueFine = FineFactory.createOverdueFine("LOAN123", "LIB123", "ISBN123", "USER456", LocalDate.now(), LocalDate.now().minusDays(5));

        assertNotNull(overdueFine);
        assertEquals("Overdue", overdueFine.getFineReason());
        assertEquals(5.0, overdueFine.getFineAmount());
        assertEquals("Pending", overdueFine.getFineStatus());
        System.out.println(overdueFine);
    }

    @Test
    void createDamagedBookFine() {
        Fine damagedFine = FineFactory.createDamagedBookFine("LOAN456", "LIB456", "ISBN456", "USER789", LocalDate.now(), LocalDate.now().minusDays(2));

        assertNotNull(damagedFine);
        assertEquals("Damaged book", damagedFine.getFineReason());
        assertEquals(50.0, damagedFine.getFineAmount());
        assertEquals("Pending", damagedFine.getFineStatus());
        System.out.println(damagedFine);
    }

    @Test
    void createLostBookFine() {
        Fine lostFine = FineFactory.createLostBookFine("LOAN789", "LIB789", "ISBN789", "USER111");

        assertNotNull(lostFine);
        assertEquals("Lost", lostFine.getFineReason());
        assertEquals(1000.0, lostFine.getFineAmount());
        assertEquals("Pending", lostFine.getFineStatus());
        System.out.println(lostFine);
    }
}