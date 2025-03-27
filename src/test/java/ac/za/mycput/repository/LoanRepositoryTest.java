package ac.za.mycput.repository;

import ac.za.mycput.domain.Loan;
import ac.za.mycput.factory.LoanFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class LoanRepositoryTest {

    private static ILoanRepository repository = LoanRepository.getRepository();

    private Loan loan = LoanFactory.createLoan(
            1,
            LocalDate.of(2024, 3, 1),  // Loan Date
            LocalDate.of(2024, 3, 15), // Due Date
            LocalDate.of(2024, 3, 10), // Return Date
            2 // Book Loan Amount
    );

    @Test
    void a_create() {
        Loan createdLoan = repository.create(loan);
        assertNotNull(createdLoan);
        System.out.println(createdLoan.toString());
    }

    @Test
    void b_read() {
        Loan readLoan = repository.read(loan.getLoanId());
        assertNotNull(readLoan);
        System.out.println(readLoan.toString());
    }

    @Test
    void c_update() {
        Loan updatedLoan = new Loan.Builder()
                .setLoanId(loan.getLoanId())
                .setLoanDate(loan.getLoanDate())
                .setLoanDueDate(loan.getLoanDueDate())
                .setLoanReturnDate(loan.getLoanReturnDate())
                .setBookLoanAmount(loan.getBookLoanAmount() + 1)
                .setFineAmount(loan.getFineAmount())
                .setLoanStatus(loan.isLoanStatus())
                .build();

        Loan updated = repository.update(updatedLoan);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(loan.getLoanId()));
        System.out.println("Loan has been successfully deleted! :)");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}
