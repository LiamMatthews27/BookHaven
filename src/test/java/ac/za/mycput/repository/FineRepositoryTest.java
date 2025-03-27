package ac.za.mycput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import ac.za.mycput.domain.Fine;
import ac.za.mycput.factory.FineFactory;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class FineRepositoryTest {

    private static IFineRepository<Fine, String> repository = FineRepository.getRepository();
    private Fine fine;

    @BeforeEach
    void setUp() {
        // Create a new fine instance before each test
        fine = FineFactory.createFine("LOAN123", "LIB123", "ISBN123", "USER456", LocalDate.now(), LocalDate.now().minusDays(5), 10.0, "Test fine");
        repository.create(fine); // Ensure the fine is created
    }

    @Test
    void a_create() {
        Fine created = repository.create(fine);
        assertNotNull(created);
        System.out.println("Created: " + created.toString());
    }

    @Test
    void b_read() {
        Fine read = repository.read(fine.getLoanID());
        assertNotNull(read);
        System.out.println("Read: " + read.toString());
    }

    @Test
    void c_update() {
        Fine updatedFine = new Fine.Builder().copy(fine)
                .setFineAmount(15.0)
                .setFineReason("Updated test fine")
                .build();
        Fine updated = repository.update(updatedFine);
        assertNotNull(updated);
        System.out.println("Updated: " + updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(fine.getLoanID()));
        System.out.println("Success: fine deleted");
    }

    @Test
    void e_getAll() {
        System.out.println("All fines: " + repository.getAll());
    }
}