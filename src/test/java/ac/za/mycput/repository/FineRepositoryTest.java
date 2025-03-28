package ac.za.mycput.repository;

//*214280829 Zintle Mgqongose*//

import ac.za.mycput.domain.Fine;
import ac.za.mycput.domain.Loan;
import ac.za.mycput.domain.User;
import ac.za.mycput.factory.FineFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FineRepositoryTest {

    private FineRepository fineRepository;
    private User testUser;
    private Loan testLoan;

    @BeforeEach
    void setUp() {
        fineRepository = (FineRepository) FineRepository.getRepository();

        testUser = new User.Builder()
                .setUserId(1)
                .setUserName("Esihle")
                .setUserSurname("Mlinjana")
                .setUserEmail("22343453@mycput.ac.za")
                .setUserAddress("Cape Town CBD")
                .build();

        testLoan = new Loan.Builder()
                .setLoanId(1)
                .setLoanDate(LocalDate.now())
                .setLoanDueDate(LocalDate.now().plusDays(14))
                .setLoanStatus(false)
                .build();
    }

    @Test
    void createFine_shouldAddFineSuccessfully() {
        Fine fine = FineFactory.createFine(1, 101, 20.0, "Paid", LocalDate.now(), testUser, testLoan);

        Fine createdFine = fineRepository.create(fine);

        System.out.println("Created Fine: " + createdFine);

        assertNotNull(createdFine);
        assertEquals(fine, createdFine);
    }

    @Test
    void readFine_shouldReturnFineIfExists() {
        Fine fine = FineFactory.createFine(2, 102, 30.0, "Overdue", LocalDate.now(), testUser, testLoan);
        fineRepository.create(fine);

        Fine foundFine = fineRepository.read(2);

        System.out.println("Found Fine: " + foundFine);

        assertNotNull(foundFine);
        assertEquals(fine.getFineID(), foundFine.getFineID());
    }

    @Test
    void readFine_shouldReturnNullIfNotExists() {
        Fine foundFine = fineRepository.read(999);
        System.out.println("Fine with ID 999: " + foundFine);
        assertNull(foundFine);
    }

    @Test
    void updateFine_shouldModifyExistingFine() {
        Fine fine = FineFactory.createFine(3, 103, 50.0, "Damaged", LocalDate.now(), testUser, testLoan);
        fineRepository.create(fine);

        Fine updatedFine = new Fine.Builder()
                .setFineID(3)
                .setReturnID(103)
                .setFineAmount(60.0)
                .setFineStatus("Damaged")
                .setFineDate(LocalDate.now())
                .setUserOfFine(testUser)
                .setLoanOfFine(testLoan)
                .build();

        Fine result = fineRepository.update(updatedFine);
        System.out.println("Updated Fine: " + result);

        assertNotNull(result);
        assertEquals(60.0, result.getFineAmount());
    }

    @Test
    void deleteFine_shouldRemoveFineIfExists() {
        Fine fine = FineFactory.createFine(4, 104, 100.0, "Lost", LocalDate.now(), testUser, testLoan);
        fineRepository.create(fine);

        boolean isDeleted = fineRepository.delete(4);
        System.out.println("Fine deleted: " + isDeleted);
        assertTrue(isDeleted);
        assertNull(fineRepository.read(4));
    }

    @Test
    void deleteFine_shouldReturnFalseIfNotExists() {
        boolean isDeleted = fineRepository.delete(999); // ID not created
        System.out.println("Attempt to delete non-existent fine: " + isDeleted);
        assertFalse(isDeleted);
    }

    @Test
    void getAll_shouldReturnAllFines() {
        fineRepository.create(FineFactory.createFine(5, 105, 10.0, "Pending", LocalDate.now(), testUser, testLoan));
        fineRepository.create(FineFactory.createFine(6, 106, 15.0, "Paid", LocalDate.now(), testUser, testLoan));

        int totalFines = fineRepository.getAll().size();
        System.out.println("Total fines in repository: " + totalFines);
        assertEquals(2, totalFines);
    }
}