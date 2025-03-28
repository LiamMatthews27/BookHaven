package ac.za.mycput.factory;

//*214280829 Zintle Mgqongose*//

import ac.za.mycput.domain.Fine;
import ac.za.mycput.domain.Loan;
import ac.za.mycput.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FineFactoryTest {

    private User testUser;
    private Loan testLoan;

    @BeforeEach
    void setUp() {
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
    void createFine_shouldCreateFineSuccessfully() {
        Fine fine = new Fine.Builder()
                .setFineID(1)
                .setReturnID(101)
                .setFineAmount(20.0)
                .setFineStatus("Paid")
                .setFineDate(LocalDate.now())
                .setUserOfFine(testUser)
                .setLoanOfFine(testLoan)
                .build();

        System.out.println("Created Fine: " + fine);

        assertNotNull(fine);
        assertEquals(1, fine.getFineID());
        assertEquals(101, fine.getReturnID());
        assertEquals(20.0, fine.getFineAmount());
        assertEquals("Paid", fine.getFineStatus());
        assertEquals(testUser, fine.getUserOfFine());
        assertEquals(testLoan, fine.getLoanOfFine());
    }

    @Test
    void createOverdueFine_shouldCreateFineWithDefaultAmount() {
        Fine fine = new Fine.Builder()
                .setFineID(2)
                .setReturnID(102)
                .setFineAmount(5.0)
                .setFineStatus("Overdue")
                .setFineDate(LocalDate.now())
                .setUserOfFine(testUser)
                .setLoanOfFine(testLoan)
                .build();

        System.out.println("Created Overdue Fine: " + fine);

        assertNotNull(fine);
        assertEquals(5.0, fine.getFineAmount());
        assertEquals("Overdue", fine.getFineStatus());
    }

    @Test
    void createDamagedBookFine_shouldCreateFineWithDefaultAmount() {
        Fine fine = new Fine.Builder()
                .setFineID(3)
                .setReturnID(103)
                .setFineAmount(50.0)
                .setFineStatus("Damaged")
                .setFineDate(LocalDate.now())
                .setUserOfFine(testUser)
                .setLoanOfFine(testLoan)
                .build();

        System.out.println("Created Damaged Book Fine: " + fine);

        assertNotNull(fine);
        assertEquals(50.0, fine.getFineAmount());
        assertEquals("Damaged", fine.getFineStatus());
    }

    @Test
    void createLostBookFine_shouldCreateFineWithDefaultAmountAndCurrentDate() {
        Fine fine = new Fine.Builder()
                .setFineID(4)
                .setReturnID(104)
                .setFineAmount(1000.0)
                .setFineStatus("Lost")
                .setFineDate(LocalDate.now())
                .setUserOfFine(testUser)
                .setLoanOfFine(testLoan)
                .build();

        System.out.println("Created Lost Book Fine: " + fine);

        assertNotNull(fine);
        assertEquals(1000.0, fine.getFineAmount());
        assertEquals("Lost", fine.getFineStatus());
        assertEquals(LocalDate.now(), fine.getFineDate());
    }
}