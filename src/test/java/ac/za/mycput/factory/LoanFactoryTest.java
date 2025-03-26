package ac.za.mycput.factory;

import ac.za.mycput.domain.Loan;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanFactoryTest {

    private static Loan loan1 = LoanFactory.createLoan(
            201,
            LocalDate.of(2024, 3, 5),  // Loan date
            LocalDate.of(2024, 4, 10), // Due date
            LocalDate.of(2024, 4, 8),  // Returned on time
            2
    );

    private static Loan loan2 = LoanFactory.createLoan(
            202,
            LocalDate.of(2024, 5, 12),  // Loan date
            LocalDate.of(2024, 6, 1),   // Due date
            LocalDate.of(2024, 6, 5),   // Returned late
            8
    );

    private static Loan loan3 = LoanFactory.createLoan(
            203,
            LocalDate.of(2024, 7, 15),  // Loan date
            LocalDate.of(2024, 8, 10),  // Due date
            LocalDate.of(2024, 8, 20),  // Returned late
            1
    );

    @Test
    public void testCreateLoan() {
        assertNotNull(loan1);
        System.out.println(loan1.toString());
    }

    @Test
    public void testCreateLoanWithFine() {
        assertNotNull(loan2);
        System.out.println(loan2.toString());
    }

    @Test
    public void testCreateLoanThatFails() {
        assertNotNull(loan3);
        System.out.println(loan3.toString());
    }

    @Test
    @Disabled
    public void testNotImplementedYet() {
        // Todo
    }
}
